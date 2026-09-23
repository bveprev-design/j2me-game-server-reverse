// Optional browser smoke test: RUN_BROWSER_TESTS=1 node --test web/tests/browser.test.cjs
// Requires Playwright and Chromium only for testing; the game itself needs neither.
const test = require('node:test');
const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const { pathToFileURL } = require('node:url');

const enabled = process.env.RUN_BROWSER_TESTS === '1';

test('the complete UI works from file:// with no network, including saves and touch controls',
  { skip: enabled ? false : 'Set RUN_BROWSER_TESTS=1 and install Playwright + Chromium to run.' },
  async () => {
    const { chromium } = require('playwright');
    const browser = await chromium.launch({
      executablePath: process.env.CHROMIUM_PATH || undefined,
      args: process.env.CHROMIUM_PATH ? ['--no-sandbox', '--no-zygote', '--single-process'] : []
    });
    const url = pathToFileURL(path.join(__dirname, '..', 'index.html')).href;
    const errors = [];

    async function offlinePage(options) {
      const context = await browser.newContext({ acceptDownloads: true, ...options });
      // If the game attempts a server request, abort it instead of relying on connectivity.
      await context.route(/^https?:\/\//, route => { errors.push(`Network: ${route.request().url()}`); return route.abort(); });
      const page = await context.newPage();
      page.on('pageerror', error => errors.push(error.message));
      page.on('requestfailed', request => errors.push(`Missing: ${request.url()}`));
      page.on('websocket', socket => errors.push(`WebSocket: ${socket.url()}`));
      page.on('dialog', dialog => dialog.accept());
      await page.goto(url);
      return { page, context };
    }

    try {
      const { page } = await offlinePage({ viewport: { width: 1200, height: 900 } });
      assert.equal(await page.locator('#intro').isVisible(), true);
      assert.equal(await page.locator('#race-options label').count(), 5);
      await page.locator('.start-button').click();
      assert.equal(await page.locator('#world-canvas').isVisible(), true);
      for (const key of ['ArrowRight', 'ArrowRight']) await page.keyboard.press(key);
      assert.equal(await page.locator('#gold-text').innerText(), '87', 'first chest collected');
      for (const key of ['ArrowLeft', 'ArrowLeft', 'ArrowUp']) await page.keyboard.press(key);
      assert.equal(await page.locator('#town-view').isVisible(), true);
      await page.locator('[data-town="barracks"]').click();
      assert.match(await page.locator('#town-content').innerText(), /Войско 8/);
      await page.locator('#leave-town').click();
      for (const key of ['ArrowDown', 'ArrowRight', 'ArrowRight', 'ArrowRight', 'ArrowRight']) {
        await page.keyboard.press(key);
      }
      assert.equal(await page.locator('#battle-canvas').isVisible(), true);
      await page.locator('#battle-canvas').focus();
      for (const key of ['ArrowUp', 'ArrowUp', 'Space']) await page.keyboard.press(key);
      assert.match(await page.locator('#scene-caption').innerText(), /переместились/);
      await page.keyboard.press('ArrowUp');
      await page.keyboard.press('Space');
      assert.match(await page.locator('#scene-caption').innerText(), /атакуют/);
      await page.locator('[data-spell="bolt"]').click();
      await page.locator('#battle-canvas').focus();
      await page.keyboard.press('Space');
      assert.equal(await page.locator('#world-canvas').isVisible(), true, 'victory returns to the map');
      assert.equal(await page.locator('#gold-text').innerText(), '103');

      await page.locator('#settings-button').click();
      const downloadPromise = page.waitForEvent('download');
      await page.getByRole('button', { name: /Скачать сохранение/ }).click();
      const download = await downloadPromise;
      const file = fs.readFileSync(await download.path());
      const save = JSON.parse(file.toString('utf8'));
      assert.equal(save.hero.gold, 103);
      assert.equal(save.world.locations.find(loc => loc.id === 'wild-wolves').cleared, true);
      await page.reload();
      assert.equal(await page.locator('#continue-button').isVisible(), true);
      await page.locator('#continue-button').click();
      assert.equal(await page.locator('#gold-text').innerText(), '103', 'auto-save survives reload');

      const imported = await offlinePage({ viewport: { width: 390, height: 844 }, isMobile: true, hasTouch: true });
      await imported.page.locator('#settings-button').click();
      await imported.page.locator('#import-file').setInputFiles({
        name: 'lordmancer.json', mimeType: 'application/json', buffer: file
      });
      await imported.page.waitForFunction(() => document.getElementById('gold-text')?.textContent === '103');
      assert.equal(await imported.page.locator('#gold-text').innerText(), '103', 'JSON import works offline');
      assert.equal(await imported.page.locator('#world-canvas').isVisible(), true);
      assert.equal(await imported.page.evaluate(() => document.documentElement.scrollWidth <= innerWidth), true,
        'mobile layout must not overflow horizontally');

      const compact = await offlinePage({ viewport: { width: 300, height: 740 }, isMobile: true, hasTouch: true });
      await compact.page.locator('.start-button').click();
      await compact.page.locator('[data-move="0,-1"]').tap();
      await compact.page.locator('[data-town="barracks"]').tap();
      assert.equal(await compact.page.evaluate(() => document.documentElement.scrollWidth <= 300), true,
        'the city and recruit buttons must fit a narrow phone');
      assert.equal(await compact.page.locator('#town-content button').count(), 4);

      const blocked = await browser.newContext({ viewport: { width: 390, height: 844 }, hasTouch: true });
      await blocked.addInitScript(() => {
        Object.defineProperty(window, 'localStorage', { configurable: true, get() { throw new Error('Storage disabled'); } });
      });
      const noStorage = await blocked.newPage();
      noStorage.on('pageerror', error => errors.push(error.message));
      await noStorage.goto(url);
      await noStorage.locator('.start-button').click();
      assert.match(await noStorage.locator('#save-status').innerText(), /недоступно/);
      await noStorage.locator('[data-move="1,0"]').click();
      await noStorage.locator('[data-move="1,0"]').click();
      await noStorage.locator('#settings-button').click();
      await noStorage.getByRole('button', { name: 'Вернуться к выбору героя' }).click();
      assert.equal(await noStorage.locator('#continue-button').isVisible(), true, 'session fallback available');
      await noStorage.locator('#continue-button').click();
      assert.equal(await noStorage.locator('#gold-text').innerText(), '87', 'memory fallback preserves progress');
      assert.deepEqual(errors, [], 'every asset must be bundled and the game must not contact a server');
    } finally {
      await browser.close();
    }
  });
