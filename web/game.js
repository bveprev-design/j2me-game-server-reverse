/* Browser adapter for the local game engine. Classic scripts intentionally work on file://. */
(() => {
  'use strict';
  const G = window.Lordmancer;
  const $ = id => document.getElementById(id);
  const ASSETS = [
    'tail', 'decorGrass', 'decorRocks', 'decorSand', 'decorSnow', 'decorWater',
    'herouse1', 'herouse2', 'unites1', 'unites2', '1castle', '2castle', '3castle',
    '4castle', '5castle', 'sunduk', 'sunduk_open', 'generators', 'teleport',
    'tiles_grass', 'tiles_rocks', 'tiles_sand', 'tiles_snow', 'battle_top'
  ];
  const art = {};
  let game = null, pausedGame = null;
  const ui = {
    race: 4, town: 'inn', intent: null, panel: null, route: [], timer: null,
    camera: { x: 0, y: 0 }, hover: null,
    battleCursor: { x: 1, y: 4 }, cursorVisible: false, currentBattle: null
  };
  const worldCanvas = $('world-canvas'), battleCanvas = $('battle-canvas'), miniMap = $('mini-map');
  const worldCtx = worldCanvas.getContext('2d'), battleCtx = battleCanvas.getContext('2d');
  const W = worldCanvas.width, TILE = 25;
  const GRID = { x: 32, y: 45, w: 59, h: 44 };
  worldCtx.imageSmoothingEnabled = false;
  battleCtx.imageSmoothingEnabled = false;

  function text(id, value) { $(id).textContent = String(value); }
  function element(tag, className, content) {
    const node = document.createElement(tag);
    if (className) node.className = className;
    if (content !== undefined) node.textContent = String(content);
    return node;
  }
  function button(label, callback, disabled = false) {
    const node = element('button', '', label);
    node.type = 'button';
    node.disabled = disabled;
    node.addEventListener('click', callback);
    return node;
  }
  function message(value) {
    if (game) { game.lastMessage = value; text('scene-caption', value); }
  }
  function loadArt() {
    for (const name of ASSETS) {
      const img = new Image();
      art[name] = img;
      img.onload = () => { if (game) { drawScene(); drawMap(miniMap, 5); if (ui.panel === 'map') drawPanelMap(); } };
      img.src = `assets/${name}.png`;
    }
  }
  function sprite(ctx, name, sx, sy, sw, sh, dx, dy, dw = sw, dh = sh) {
    const img = art[name];
    if (img && img.complete && img.naturalWidth) ctx.drawImage(img, sx, sy, sw, sh, Math.round(dx), Math.round(dy), Math.round(dw), Math.round(dh));
  }
  function troopSprite(ctx, troop, x, y, w, h) {
    const def = G.TROOPS[troop];
    sprite(ctx, def.sheet, (def.frame % 5) * 50, Math.floor(def.frame / 5) * 28, 50, 28, x, y, w, h);
  }
  function spriteElement(name, frame, unit = false) {
    const span = element('span', unit ? 'unit-icon' : 'sprite-icon');
    const width = unit ? 50 : 37;
    span.style.backgroundImage = `url("assets/${name}.png")`;
    span.style.backgroundPosition = unit ? `${-(frame % 5) * 50}px ${-Math.floor(frame / 5) * 28}px` : `${-frame * width}px 0`;
    span.setAttribute('aria-hidden', 'true');
    return span;
  }

  function buildRaces() {
    const container = $('race-options');
    for (let i = 0; i < G.RACES.length; i++) {
      const race = G.RACES[i];
      const label = element('label', 'race-choice');
      const radio = element('input');
      radio.type = 'radio'; radio.name = 'race'; radio.value = String(i); radio.checked = i === ui.race;
      radio.setAttribute('aria-label', race.name);
      const body = element('span', 'race-choice-body');
      const portrait = element('span', 'race-avatar');
      portrait.style.backgroundPosition = `${-i * 42}px 0`;
      portrait.setAttribute('aria-hidden', 'true');
      body.append(portrait, element('strong', '', race.name));
      label.append(radio, body);
      container.append(label);
      radio.addEventListener('change', () => { ui.race = i; text('race-description', race.description); });
    }
    text('race-description', G.RACES[ui.race].description);
  }

  function getSaved() {
    try {
      const raw = localStorage.getItem(G.STORAGE_KEY);
      return raw ? G.loadGame(raw) : null;
    } catch (_) { return null; }
  }
  function updateContinue() { $('continue-button').hidden = !(pausedGame || getSaved()); }
  function save() {
    if (!game) return;
    try {
      localStorage.setItem(G.STORAGE_KEY, JSON.stringify(game));
      text('save-status', 'Автосохранено на этом устройстве');
    } catch (_) {
      text('save-status', 'Хранилище недоступно · экспортируй игру в файл');
    }
  }
  function stopRoute() {
    clearTimeout(ui.timer);
    ui.timer = null;
    ui.route = [];
  }
  function change(callback) {
    callback();
    save(); render();
  }
  function start(name) {
    if ((pausedGame || getSaved()) && !window.confirm('Начать новую игру? Текущее автосохранение будет заменено.')) return;
    try { game = G.createGame(name, ui.race); }
    catch (err) { window.alert(err.message); return; }
    pausedGame = null;
    stopRoute();
    ui.intent = null; ui.panel = null; ui.town = 'inn';
    save(); render();
    worldCanvas.focus({ preventScroll: true });
  }

  function render() {
    $('intro').hidden = !!game;
    $('play').hidden = !game;
    $('sidebar').hidden = !game;
    $('layout').classList.toggle('is-intro', !game);
    if (!game) { updateContinue(); return; }
    if (game.mode === 'battle' && ui.currentBattle !== game.battle) {
      const first = game.battle.units.find(u => u.team === 'ally' && u.hp > 0);
      ui.battleCursor = { x: first.x, y: first.y };
      ui.cursorVisible = false;
      ui.currentBattle = game.battle;
    } else if (game.mode !== 'battle') {
      ui.currentBattle = null;
      ui.cursorVisible = false;
    }
    const hero = game.hero;
    text('hero-name', hero.name);
    text('hero-level', `УР. ${hero.level}`);
    text('hp-text', `${hero.health}/${hero.maxHealth}`);
    text('mana-text', `${hero.mana}/${hero.maxMana}`);
    text('gold-text', hero.gold);
    $('hp-fill').style.width = `${Math.min(100, 100 * hero.health / hero.maxHealth)}%`;
    $('mana-fill').style.width = `${Math.min(100, 100 * hero.mana / hero.maxMana)}%`;
    $('hero-portrait').style.backgroundPosition = `${4 - G.RACES[hero.race].hero * 42}px 12px`;
    $('points-dot').hidden = !hero.points;
    text('scene-caption', game.lastMessage || 'Исследуйте землю и отыщите три печати.');
    $('world-canvas').hidden = game.mode !== 'world';
    $('battle-canvas').hidden = game.mode !== 'battle';
    $('town-view').hidden = game.mode !== 'town';
    $('ending-view').hidden = game.mode !== 'ending';
    $('world-controls').hidden = game.mode !== 'world';
    $('battle-controls').hidden = game.mode !== 'battle';
    $('town-controls').hidden = game.mode !== 'town';
    if (game.mode === 'world') {
      text('scene-overline', 'ЗЕМЛЯ I · СОТКАННЫЙ МИР');
      text('scene-title', 'Карта земли');
      text('scene-detail', `${hero.x} : ${hero.y}`);
    } else if (game.mode === 'battle') {
      text('scene-overline', 'СТОЛКНОВЕНИЕ · ТАКТИЧЕСКИЙ БОЙ');
      text('scene-title', game.battle.name);
      text('scene-detail', `РАУНД ${game.battle.round}`);
      renderBattleControls();
    } else if (game.mode === 'town') {
      text('scene-overline', 'ГОРОД · БЕЗОПАСНАЯ ЗОНА');
      text('scene-title', 'Город Надежды');
      text('scene-detail', `${hero.gold} МОНЕТ`);
      renderTown();
    } else {
      text('scene-overline', 'ТРИ ПЕЧАТИ · ПОВЕСТЬ');
      text('scene-title', 'Победа');
      text('scene-detail', '3 / 3');
    }
    drawScene();
    renderSidebar();
    if (ui.panel && $('panel-dialog').open) renderPanel(ui.panel);
  }

  function camera() {
    const max = G.SIZE * TILE - W;
    ui.camera.x = Math.max(0, Math.min(max, game.hero.x * TILE - W / 2 + TILE / 2));
    ui.camera.y = Math.max(0, Math.min(max, game.hero.y * TILE - W / 2 + TILE / 2));
  }
  function seen(x, y) { return game.world.explored[y * G.SIZE + x]; }
  function visible(x, y) { const dx = x - game.hero.x, dy = y - game.hero.y; return dx * dx + dy * dy <= 25; }
  function colorTerrain(tile) {
    return { [G.TERRAIN.GRASS]: '#688a54', [G.TERRAIN.SNOW]: '#d5dfd4', [G.TERRAIN.SAND]: '#b9a06c',
      [G.TERRAIN.ROCK]: '#846d52', [G.TERRAIN.WATER]: '#397caa', [G.TERRAIN.MOUNTAIN]: '#655e65' }[tile] || '#152431';
  }

  function drawWorld() {
    const ctx = worldCtx;
    ctx.fillStyle = '#081523'; ctx.fillRect(0, 0, W, W);
    camera();
    const terrain = game.world.terrain, seed = game.world.seed;
    const left = Math.max(0, Math.floor(ui.camera.x / TILE));
    const top = Math.max(0, Math.floor(ui.camera.y / TILE));
    const right = Math.min(G.SIZE, Math.ceil((ui.camera.x + W) / TILE) + 1);
    const bottom = Math.min(G.SIZE, Math.ceil((ui.camera.y + W) / TILE) + 1);
    for (let y = top; y < bottom; y++) {
      for (let x = left; x < right; x++) {
        const sx = Math.round(x * TILE - ui.camera.x), sy = Math.round(y * TILE - ui.camera.y);
        if (!seen(x, y)) { ctx.fillStyle = (x + y) % 2 ? '#0d1e2c' : '#101f2d'; ctx.fillRect(sx, sy, TILE, TILE); continue; }
        const tile = terrain[y * G.SIZE + x];
        ctx.fillStyle = colorTerrain(tile);
        ctx.fillRect(sx, sy, TILE, TILE);
        const index = tile === G.TERRAIN.WATER ? 1 : tile;
        sprite(ctx, 'tail', index * TILE, 0, TILE, TILE, sx, sy);
        const chance = G.hash(seed, x, y);
        if (tile === G.TERRAIN.WATER && chance % 9 === 0) {
          sprite(ctx, 'decorWater', 0, 0, TILE, TILE, sx, sy);
        } else if (tile !== G.TERRAIN.MOUNTAIN && tile !== G.TERRAIN.WATER && chance % 10 === 0 && !G.locationAt(game, x, y)) {
          const name = { [G.TERRAIN.GRASS]: 'decorGrass', [G.TERRAIN.SNOW]: 'decorSnow',
            [G.TERRAIN.SAND]: 'decorSand', [G.TERRAIN.ROCK]: 'decorRocks' }[tile];
          if (name) sprite(ctx, name, ((chance >>> 7) % 3) * TILE, 0, TILE, TILE, sx, sy);
        }
      }
    }
    // Draw a planned route below entities, and only over already discovered cells.
    if (ui.route.length) {
      ctx.fillStyle = '#ffe09d';
      for (const p of ui.route) {
        const sx = p.x * TILE - ui.camera.x + 10, sy = p.y * TILE - ui.camera.y + 10;
        ctx.fillRect(Math.round(sx), Math.round(sy), 5, 5);
      }
    }
    const locals = game.world.locations.slice().sort((a, b) => a.y - b.y);
    for (const loc of locals) {
      if (!seen(loc.x, loc.y)) continue;
      const sx = Math.round(loc.x * TILE - ui.camera.x), sy = Math.round(loc.y * TILE - ui.camera.y);
      if (sx < -60 || sy < -60 || sx > W + 20 || sy > W + 20) continue;
      if (loc.type === 'city') {
        const image = `${game.hero.race + 1}castle`;
        const width = [56, 56, 58, 54, 58][game.hero.race];
        sprite(ctx, image, 0, 0, width, 49, sx - Math.round((width - 25) / 2), sy - 26, width, 49);
      } else if (loc.type === 'chest') {
        if (loc.cleared) sprite(ctx, 'sunduk_open', 0, 0, 31, 22, sx - 3, sy + 2, 31, 22);
        else sprite(ctx, 'sunduk', 0, 0, 29, 16, sx - 2, sy + 9, 29, 16);
      } else if (loc.type === 'gate') {
        sprite(ctx, 'teleport', 29 * (loc.id === 'gate-west' ? 0 : 3), 0, 29, 25, sx - 2, sy);
      } else if (loc.type === 'shrine') {
        ctx.fillStyle = loc.cleared ? '#e5d393aa' : '#83e5d3aa';
        ctx.fillRect(sx + 2, sy + 20, 21, 2);
        sprite(ctx, 'generators', loc.cleared ? 33 : 66, 0, 33, 25, sx - 4, sy);
        if (!loc.cleared) troopSprite(ctx, G.ENCOUNTERS[loc.encounter].troops[0][0], sx - 10, sy - 12, 44, 27);
      } else if (loc.type === 'enemy' && !loc.cleared) {
        troopSprite(ctx, G.ENCOUNTERS[loc.encounter].troops[0][0], sx - 10, sy - 8, 44, 28);
      }
    }
    const heroX = Math.round(game.hero.x * TILE - ui.camera.x), heroY = Math.round(game.hero.y * TILE - ui.camera.y);
    sprite(ctx, 'herouse1', game.hero.race * 42, 0, 42, 28, heroX - 8, heroY - 7);
    // Fog is per-cell so the player can remember where they have been, but not see distant enemies clearly.
    for (let y = top; y < bottom; y++) {
      for (let x = left; x < right; x++) {
        if (!seen(x, y) || visible(x, y)) continue;
        ctx.fillStyle = '#07131daa';
        ctx.fillRect(Math.round(x * TILE - ui.camera.x), Math.round(y * TILE - ui.camera.y), TILE, TILE);
      }
    }
    if (ui.hover && G.inside(ui.hover.x, ui.hover.y) && seen(ui.hover.x, ui.hover.y)) {
      const x = Math.round(ui.hover.x * TILE - ui.camera.x), y = Math.round(ui.hover.y * TILE - ui.camera.y);
      ctx.strokeStyle = '#f6d684'; ctx.lineWidth = 2; ctx.strokeRect(x + 1, y + 1, 23, 23);
    }
    ctx.fillStyle = '#081b26e0'; ctx.fillRect(6, 6, 116, 21);
    ctx.fillStyle = '#ecd297'; ctx.font = 'bold 10px monospace'; ctx.fillText(`✦ ЗЕМЛЯ I  ${game.hero.x}:${game.hero.y}`, 12, 20);
  }

  function drawBattle() {
    const ctx = battleCtx, battle = game.battle;
    ctx.fillStyle = '#101b2d'; ctx.fillRect(0, 0, W, W);
    ctx.fillStyle = '#182e37'; ctx.fillRect(13, 31, 334, 278);
    const tile = game.world.terrain[game.hero.y * G.SIZE + game.hero.x];
    const sheet = { [G.TERRAIN.SAND]: 'tiles_sand', [G.TERRAIN.SNOW]: 'tiles_snow',
      [G.TERRAIN.ROCK]: 'tiles_rocks', [G.TERRAIN.GRASS]: 'tiles_grass' }[tile] || 'tiles_grass';
    const selected = G.battleUnit(game, battle.selected);
    const moves = selected ? G.reachable(game, selected.id) : [];
    for (let y = 0; y < G.BATTLE_H; y++) {
      for (let x = 0; x < G.BATTLE_W; x++) {
        const sx = GRID.x + x * GRID.w, sy = GRID.y + y * GRID.h;
        sprite(ctx, sheet, ((x + y) % 2) * 34, 0, 34, 30, sx, sy, GRID.w, GRID.h);
        ctx.fillStyle = (x + y) % 2 ? '#09121d13' : '#ebd6980b';
        ctx.fillRect(sx, sy, GRID.w, GRID.h);
        if (!ui.intent && moves.some(p => p.x === x && p.y === y)) {
          ctx.fillStyle = '#9de4b642'; ctx.fillRect(sx + 2, sy + 2, GRID.w - 4, GRID.h - 4);
        }
        ctx.strokeStyle = '#17253370'; ctx.lineWidth = 1; ctx.strokeRect(sx + .5, sy + .5, GRID.w, GRID.h);
      }
    }
    for (const stone of battle.obstacles) {
      const x = GRID.x + stone.x * GRID.w, y = GRID.y + stone.y * GRID.h;
      sprite(ctx, 'tail', 7 * TILE, 0, TILE, TILE, x + 7, y + 3, 45, 38);
    }
    if (art.battle_top?.naturalWidth) {
      sprite(ctx, 'battle_top', 0, 0, 148, 26, 3, 4, 354, 30);
    }
    ctx.fillStyle = '#eed393'; ctx.font = 'bold 10px monospace';
    ctx.fillText(`СВОИ ${battle.units.filter(u => u.team === 'ally' && u.hp > 0).length}`, 34, 330);
    ctx.fillText(`ВРАГИ ${battle.units.filter(u => u.team === 'enemy' && u.hp > 0).length}`, 268, 330);
    for (const u of battle.units) {
      if (u.hp <= 0) continue;
      const x = GRID.x + u.x * GRID.w, y = GRID.y + u.y * GRID.h;
      if (selected && u.id === selected.id) {
        ctx.fillStyle = '#e9cf78aa'; ctx.fillRect(x + 1, y + 1, GRID.w - 2, GRID.h - 2);
        ctx.strokeStyle = '#ffe59d'; ctx.lineWidth = 2; ctx.strokeRect(x + 1, y + 1, GRID.w - 2, GRID.h - 2);
      } else if ((ui.intent === 'bolt' && u.team === 'enemy') ||
                 ((ui.intent === 'heal' || ui.intent === 'potion') && u.team === 'ally') ||
                 (!ui.intent && selected && u.team === 'enemy' && !selected.acted && G.inRange(selected, u))) {
        ctx.strokeStyle = u.team === 'enemy' ? '#f5a485' : '#b0e3ac';
        ctx.lineWidth = 2; ctx.strokeRect(x + 1, y + 1, GRID.w - 2, GRID.h - 2);
      }
      troopSprite(ctx, u.kind, x + 3, y + 2, 52, 33);
      ctx.fillStyle = '#0c1b26'; ctx.fillRect(x + 4, y + 36, 51, 5);
      ctx.fillStyle = u.team === 'ally' ? '#8ccda8' : '#da8676';
      ctx.fillRect(x + 5, y + 37, Math.round(49 * u.hp / u.maxHp), 3);
      ctx.fillStyle = '#091723d9'; ctx.fillRect(x + 40, y + 2, 16, 13);
      ctx.fillStyle = '#fff3cb'; ctx.font = 'bold 10px monospace';
      ctx.fillText(String(Math.ceil(u.hp / G.TROOPS[u.kind].hp)), x + 43, y + 12);
      if (u.team === 'ally' && u.acted) { ctx.fillStyle = '#08152277'; ctx.fillRect(x + 1, y + 1, 57, 35); }
    }
    if (ui.cursorVisible) {
      const x = GRID.x + ui.battleCursor.x * GRID.w, y = GRID.y + ui.battleCursor.y * GRID.h;
      ctx.strokeStyle = '#ffe59d'; ctx.lineWidth = 2; ctx.setLineDash([5, 3]);
      ctx.strokeRect(x + 3, y + 3, GRID.w - 6, GRID.h - 6);
      ctx.setLineDash([]);
    }
  }

  function drawScene() {
    if (!game) return;
    if (game.mode === 'world') drawWorld();
    else if (game.mode === 'battle') drawBattle();
  }

  function drawMap(canvas, scale) {
    if (!game || !canvas) return;
    const ctx = canvas.getContext('2d');
    ctx.imageSmoothingEnabled = false;
    ctx.fillStyle = '#0c1c2a'; ctx.fillRect(0, 0, canvas.width, canvas.height);
    for (let y = 0; y < G.SIZE; y++) for (let x = 0; x < G.SIZE; x++) {
      if (seen(x, y)) {
        ctx.fillStyle = colorTerrain(game.world.terrain[y * G.SIZE + x]);
        ctx.fillRect(x * scale, y * scale, scale, scale);
      }
    }
    for (const loc of game.world.locations) {
      if (!seen(loc.x, loc.y)) continue;
      const color = { city: '#e89774', shrine: loc.cleared ? '#d9c47f' : '#a3eed2', chest: '#f1ca75',
        enemy: loc.cleared ? null : '#ed897c', gate: '#94b9e6' }[loc.type];
      if (!color) continue;
      ctx.fillStyle = '#10242b'; ctx.fillRect(loc.x * scale - 1, loc.y * scale - 1, scale + 2, scale + 2);
      ctx.fillStyle = color; ctx.fillRect(loc.x * scale, loc.y * scale, scale, scale);
    }
    ctx.fillStyle = '#071827'; ctx.fillRect(game.hero.x * scale - 2, game.hero.y * scale - 2, scale + 4, scale + 4);
    ctx.fillStyle = '#ffe8a5'; ctx.fillRect(game.hero.x * scale - 1, game.hero.y * scale - 1, scale + 2, scale + 2);
  }

  function renderSidebar() {
    const seals = G.relicCount(game);
    text('quest-description', game.campaignWon ? 'Все три печати найдены. Сотканный мир снова цел.' :
      seals === 0 ? 'Найди три древние печати на севере, востоке и юге. Осторожно: их охраняют стражи.' :
      seals === 3 ? 'Все печати найдены. Вернись в Город Надежды, чтобы закончить путешествие.' :
      `Найдено печатей: ${seals}/3. Отыщи оставшиеся и вернись в город.`);
    const track = $('seal-track'); track.replaceChildren();
    for (const loc of game.world.locations.filter(l => l.type === 'shrine')) {
      const seal = element('span', `seal ${loc.cleared ? 'found' : ''}`);
      seal.append(element('span', '', loc.cleared ? '✦' : '◇'));
      seal.setAttribute('role', 'img');
      seal.setAttribute('aria-label', `${loc.name}: ${loc.cleared ? 'найдена' : 'не найдена'}`);
      track.append(seal);
    }
    $('quest-progress-fill').style.width = `${100 * seals / 3}%`;
    text('quest-progress-text', `${seals} / 3 ПЕЧАТЕЙ НАЙДЕНО`);
    drawMap(miniMap, 5);
    const log = $('event-log'); log.replaceChildren();
    for (const entry of game.log.slice(0, 5)) {
      const li = element('li', ['quest', 'success', 'warning', 'battle', 'loot'].includes(entry.kind) ? entry.kind : '', entry.text);
      log.append(li);
    }
  }

  function addTownOption(parent, icon, title, detail, actions) {
    const row = element('div', 'town-option');
    if (icon) row.append(icon);
    const info = element('div', 'option-copy');
    info.append(element('strong', '', title), element('span', '', detail));
    row.append(info);
    for (const action of actions) row.append(button(action.label, action.run, action.disabled));
    parent.append(row);
  }
  function townAction(action) { return () => { change(action); }; }
  function renderTown() {
    const race = G.RACES[game.hero.race];
    const castle = $('town-castle');
    castle.style.backgroundImage = `url("assets/${game.hero.race + 1}castle.png")`;
    castle.style.width = `${[56, 56, 58, 54, 58][game.hero.race]}px`;
    for (const tab of document.querySelectorAll('[data-town]')) tab.setAttribute('aria-pressed', String(tab.dataset.town === ui.town));
    const content = $('town-content'); content.replaceChildren();
    if (ui.town === 'inn') {
      content.append(element('h3', '', 'Постоялый двор'), element('p', '', 'Старый трактир ждёт путешественников. Отдых восстановит жизнь, ману и здоровье выживших воинов.'));
      addTownOption(content, spriteElement('item-2', 3), 'Полный отдых', 'Лечение армии и героя · 12 монет', [
        { label: 'ОТДОХНУТЬ', run: townAction(() => G.rest(game)), disabled: game.hero.gold < 12 }
      ]);
      content.append(element('div', 'town-subnote', 'Совет: после тяжёлой битвы найми новых воинов в казарме.'));
    } else if (ui.town === 'barracks') {
      content.append(element('h3', '', 'Казарма'), element('p', '', `Войско ${G.armySize(game)} / ${G.capacity(game)}. Повышай лидерство героя, чтобы нанимать больше существ.`));
      for (const kind of [race.guard, race.ranged]) {
        const troop = G.TROOPS[kind];
        addTownOption(content, spriteElement(troop.sheet, troop.frame, true), troop.name, `Атака ${troop.attack} · жизнь ${troop.hp} · ${troop.range > 1 ? 'дальний бой' : 'ближний бой'}`, [
          { label: `+1 · ${troop.price}`, run: townAction(() => G.recruit(game, kind, 1)), disabled: game.hero.gold < troop.price || G.armySize(game) >= G.capacity(game) },
          { label: `+3 · ${troop.price * 3}`, run: townAction(() => G.recruit(game, kind, 3)), disabled: game.hero.gold < troop.price * 3 || G.armySize(game) + 3 > G.capacity(game) }
        ]);
      }
    } else {
      content.append(element('h3', '', 'Магазин'), element('p', '', 'Припасы для похода и вещи для героя. Купленные вещи лежат в сумке.'));
      for (const [id, item] of Object.entries(G.ITEMS)) {
        addTownOption(content, spriteElement(item.sheet, item.frame), item.name, item.description, [
          { label: `${item.price} МОН.`, run: townAction(() => G.buy(game, id)), disabled: game.hero.gold < item.price || !!(item.slot && game.hero.inventory[id]) }
        ]);
      }
    }
  }

  function renderBattleControls() {
    const battle = game.battle;
    text('battle-round', `РАУНД ${battle.round}`);
    const selected = G.battleUnit(game, battle.selected);
    text('battle-hint', ui.intent === 'bolt' ? 'Молния: выбери вражеский отряд на поле (6 маны).' :
      ui.intent === 'heal' ? 'Лечение: выбери раненый союзный отряд (5 маны).' :
      ui.intent === 'potion' ? 'Зелье: выбери раненый союзный отряд.' :
      selected ? `${G.TROOPS[selected.kind].name} ×${Math.ceil(selected.hp / G.TROOPS[selected.kind].hp)} · ход ${G.TROOPS[selected.kind].move} · дальность ${G.TROOPS[selected.kind].range}${selected.acted ? ' · уже действовали' : ''}. Нажми на клетку или врага.` :
      'Выбери свой отряд, потом клетку для перемещения или врага для атаки.');
    for (const btn of document.querySelectorAll('[data-spell]')) {
      const spell = btn.dataset.spell;
      btn.disabled = battle.cast || game.hero.mana < (spell === 'bolt' ? 6 : 5);
      btn.setAttribute('aria-pressed', String(ui.intent === spell));
    }
    $('battle-potion').disabled = game.hero.inventory.potion === 0;
    $('battle-potion').setAttribute('aria-pressed', String(ui.intent === 'potion'));
    text('potion-count', `×${game.hero.inventory.potion}`);
    if (ui.cursorVisible) {
      const { x, y } = ui.battleCursor;
      const unit = G.battleUnitAt(game, x, y);
      const description = unit ? `${unit.team === 'ally' ? 'Свой отряд' : 'Враг'}: ${G.TROOPS[unit.kind].name}, жизнь ${unit.hp}/${unit.maxHp}` :
        battle.obstacles.some(o => o.x === x && o.y === y) ? 'Препятствие' : 'Свободная клетка';
      text('battle-cursor-info', `Клетка ${x + 1}:${y + 1} · ${description} · Пробел — действие.`);
    } else {
      text('battle-cursor-info', 'Стрелки / WASD — клетка · Пробел — действие · Enter — конец хода.');
    }
  }

  function canvasCoords(event, canvas) {
    const box = canvas.getBoundingClientRect();
    return { x: Math.floor((event.clientX - box.left) * canvas.width / box.width),
      y: Math.floor((event.clientY - box.top) * canvas.height / box.height) };
  }
  function worldTile(event) {
    const p = canvasCoords(event, worldCanvas);
    return { x: Math.floor((p.x + ui.camera.x) / TILE), y: Math.floor((p.y + ui.camera.y) / TILE) };
  }
  function routeTo(x, y) {
    if (game.mode !== 'world') return;
    stopRoute();
    if (x === game.hero.x && y === game.hero.y) { change(() => G.interact(game)); return; }
    const path = G.findPath(game, x, y);
    if (!path?.length) { message('Путь закрыт или эта часть земли ещё не открыта.'); render(); return; }
    ui.route = path;
    advanceRoute();
  }
  function advanceRoute() {
    if (!game || game.mode !== 'world' || !ui.route.length) { stopRoute(); return; }
    const next = ui.route.shift();
    const loc = G.locationAt(game, next.x, next.y);
    const moved = G.move(game, next.x - game.hero.x, next.y - game.hero.y);
    const interrupted = game.mode !== 'world' || (loc && (loc.type === 'chest' && loc.cleared || loc.type === 'enemy' || loc.type === 'shrine' || loc.type === 'gate')) ||
      game.hero.x !== next.x || game.hero.y !== next.y || !moved;
    if (interrupted) stopRoute();
    save(); render();
    if (ui.route.length) ui.timer = setTimeout(advanceRoute, 135);
  }

  function selectBattleCell(x, y) {
    if (game.mode !== 'battle' || x < 0 || x >= G.BATTLE_W || y < 0 || y >= G.BATTLE_H) return;
    const target = G.battleUnitAt(game, x, y);
    if (ui.intent) {
      let success = false;
      if (target && ui.intent === 'potion') success = G.useItem(game, 'potion', target.id);
      else if (target) success = G.castSpell(game, ui.intent, target.id);
      else message('Выбери отряд для применения заклинания.');
      if (success || game.mode !== 'battle') ui.intent = null;
      save(); render(); return;
    }
    if (target?.team === 'ally') { game.battle.selected = target.id; save(); render(); return; }
    const selected = G.battleUnit(game, game.battle.selected);
    if (!selected) { message('Сначала выбери союзный отряд.'); render(); return; }
    if (target) change(() => G.attackBattleUnit(game, selected.id, target.id));
    else change(() => G.moveBattleUnit(game, selected.id, x, y));
  }
  function drawPanelMap() {
    const panelMap = $('panel-map');
    if (panelMap) drawMap(panelMap, 10);
  }
  function openPanel(name) {
    if (!game && name !== 'settings') return;
    stopRoute();
    ui.panel = name;
    renderPanel(name);
    if (!$('panel-dialog').open) $('panel-dialog').showModal();
  }
  function closePanel() {
    if ($('panel-dialog').open) $('panel-dialog').close();
    ui.panel = null;
  }
  function panelHeader(eyebrow, title) { text('dialog-eyebrow', eyebrow); text('dialog-title', title); }
  function sectionLabel(label) { return element('div', 'panel-section-title', label); }
  function renderPanel(name) {
    const content = $('dialog-content'); content.replaceChildren();
    if (name === 'settings') { renderSettings(content); return; }
    if (!game) return;
    if (name === 'hero') renderHeroPanel(content);
    else if (name === 'bag') renderBagPanel(content);
    else if (name === 'journal') renderJournalPanel(content);
    else if (name === 'map') renderMapPanel(content);
  }
  function renderHeroPanel(content) {
    panelHeader('ХАРАКТЕРИСТИКИ · ВОЙСКО', game.hero.name);
    content.append(element('p', 'panel-lead', `${G.RACES[game.hero.race].name} · уровень ${game.hero.level} · опыт ${game.hero.xp}/${G.xpNeeded(game.hero.level)} · свободных очков: ${game.hero.points}.`));
    content.append(sectionLabel('ХАРАКТЕРИСТИКИ'));
    const grid = element('div', 'stats-grid');
    for (const [key, label] of [['attack', 'Атака'], ['defense', 'Защита'], ['magic', 'Магия'], ['leadership', 'Лидерство']]) {
      const box = element('div', 'stat-box');
      box.append(element('span', '', label), element('strong', '', game.hero[key]));
      if (game.hero.points) box.append(button('+', () => change(() => G.levelStat(game, key))));
      grid.append(box);
    }
    content.append(grid, sectionLabel('СНАРЯЖЕНИЕ'));
    const gear = element('div', 'equipment-grid');
    for (const [slot, label] of [['weapon', 'ОРУЖИЕ'], ['armor', 'БРОНЯ']]) {
      const item = game.hero.equipment[slot];
      const cell = element('div'); cell.append(element('span', '', label), document.createTextNode(item ? G.ITEMS[item].name : 'Пусто'));
      gear.append(cell);
    }
    content.append(gear, sectionLabel(`АРМИЯ  ${G.armySize(game)} / ${G.capacity(game)}`));
    for (const stack of game.army) {
      const troop = G.TROOPS[stack.kind], row = element('div', 'inventory-item');
      row.append(spriteElement(troop.sheet, troop.frame, true));
      const info = element('div');
      info.append(element('strong', '', `${troop.name} ×${G.stackCount(stack)}`), element('p', '', `Жизнь отряда: ${stack.hp} · ход: ${troop.move} · дальность: ${troop.range}`));
      row.append(info); content.append(row);
    }
  }
  function renderBagPanel(content) {
    panelHeader('ИНВЕНТАРЬ · ЛИЧНЫЕ ВЕЩИ', 'Сумка');
    content.append(element('p', 'panel-lead', 'Предметы используются только локально. Меч и броню можно надеть, зелья и эликсиры — выпить.'));
    content.append(sectionLabel('ВЕЩИ'));
    let count = 0;
    for (const [id, item] of Object.entries(G.ITEMS)) {
      if (!game.hero.inventory[id]) continue;
      count++;
      const row = element('div', 'inventory-item');
      row.append(spriteElement(item.sheet, item.frame));
      const info = element('div');
      info.append(element('strong', '', `${item.name} ×${game.hero.inventory[id]}`), element('p', '', item.description));
      row.append(info);
      let label, disabled = false;
      if (item.slot) { label = game.hero.equipment[item.slot] === id ? 'СНЯТЬ' : 'НАДЕТЬ'; disabled = game.mode === 'battle'; }
      else {
        label = 'ИСПОЛЬЗОВАТЬ';
        const selected = game.mode === 'battle' ? G.battleUnit(game, game.battle.selected) : null;
        disabled = id === 'ether' ? game.hero.mana >= game.hero.maxMana :
          game.mode === 'battle' ? !selected || selected.hp >= selected.maxHp : game.hero.health >= game.hero.maxHealth;
      }
      row.append(button(label, () => {
        if (item.slot) change(() => G.equip(game, id));
        else change(() => G.useItem(game, id, game.battle?.selected));
      }, disabled));
      content.append(row);
    }
    if (!count) content.append(element('p', 'empty-note', 'Сумка пуста. Найди сундуки на карте или загляни в магазин.'));
    if (game.mode === 'battle') content.append(element('p', 'settings-note', 'В бою зелье восстанавливает жизнь выбранного отряда. Чтобы выбрать другой отряд, закрой сумку и нажми на него.'));
  }
  function renderJournalPanel(content) {
    panelHeader('ДНЕВНИК ПУТЕШЕСТВИЯ', 'Задание');
    const seals = G.relicCount(game);
    const main = element('div', 'journal-objective');
    main.append(element('small', '', 'ГЛАВНАЯ ЦЕЛЬ'), document.createTextNode(
      seals === 3 ? 'Верни три печати в Город Надежды.' : `Восстанови три печати Сотканного мира (${seals}/3).`));
    content.append(main, sectionLabel('ДРЕВНИЕ ПЕЧАТИ'));
    const list = element('ul', 'journal-list');
    for (const loc of game.world.locations.filter(l => l.type === 'shrine')) {
      const li = element('li', loc.cleared ? 'done' : '');
      li.append(element('span', '', loc.cleared ? '✦' : '◇'), document.createTextNode(`${loc.name} · ${loc.cleared ? 'восстановлена' : seen(loc.x, loc.y) ? `найдена (${loc.x}:${loc.y})` : 'не открыта'}`));
      list.append(li);
    }
    content.append(list, sectionLabel('НЕДАВНИЕ СОБЫТИЯ'));
    for (const entry of game.log.slice(0, 12)) content.append(element('p', 'panel-lead', `✦ ${entry.text}`));
  }
  function renderMapPanel(content) {
    panelHeader('КАРТА ЗЕМЛИ · 36 × 36', 'Разведка');
    content.append(element('p', 'panel-lead', 'Открытые клетки остаются на карте. Жёлтый знак — герой, бирюзовый — печать, красный — враг. Нажми на открытую точку, чтобы проложить путь.'));
    const canvas = element('canvas', 'panel-map');
    canvas.id = 'panel-map'; canvas.width = 360; canvas.height = 360;
    canvas.setAttribute('aria-label', 'Карта открытых земель');
    content.append(canvas, element('p', 'panel-map-legend', '✦ Герой　◆ Город　◇ Печати　• Врата и сокровища'));
    drawPanelMap();
    canvas.addEventListener('click', event => {
      if (game.mode !== 'world') return;
      const p = canvasCoords(event, canvas);
      const x = Math.floor(p.x / 10), y = Math.floor(p.y / 10);
      closePanel(); routeTo(x, y);
      const rect = worldCanvas.getBoundingClientRect();
      if (rect.top < 0 || rect.bottom > window.innerHeight) worldCanvas.scrollIntoView({ block: 'center' });
    });
  }
  function renderSettings(content) {
    panelHeader('ОФЛАЙН · НАСТРОЙКИ', 'Сохранения');
    content.append(element('p', 'panel-lead', 'Игра не подключается к серверу. Прогресс автоматически сохраняется в этом браузере. Для переноса на другое устройство выгрузи файл сохранения.'));
    const actions = element('div', 'settings-actions');
    actions.append(button('↓ Скачать сохранение (.json)', exportSave, !game));
    actions.append(button('↑ Загрузить сохранение из файла', () => $('import-file').click()));
    if (game) {
      actions.append(button('Вернуться к выбору героя', () => {
        closePanel(); stopRoute(); pausedGame = game; game = null; render();
      }));
      const erase = button('Удалить сохранение и начать заново', () => {
        if (!window.confirm('Удалить локальное сохранение? Экспортируйте его заранее, если оно вам нужно.')) return;
        try { localStorage.removeItem(G.STORAGE_KEY); } catch (_) { /* storage may be unavailable */ }
        stopRoute(); pausedGame = null; game = null; closePanel(); text('save-status', 'Локальное сохранение удалено'); render();
      });
      erase.className = 'danger'; actions.append(erase);
    }
    content.append(actions, element('p', 'settings-note', 'Работает даже при открытии index.html как обычного файла. Если приватный режим отключает локальное хранилище, экспортируйте игру вручную. Сетевые функции оригинала (чат, аккаунты, аукцион) не входят в офлайн-кампанию.'));
  }
  function exportSave() {
    if (!game) return;
    const file = new Blob([JSON.stringify(game, null, 2)], { type: 'application/json' });
    const url = URL.createObjectURL(file);
    const link = element('a'); link.href = url; link.download = `lordmancer-${game.hero.race}-${game.hero.level}.json`;
    document.body.append(link); link.click(); link.remove();
    setTimeout(() => URL.revokeObjectURL(url), 1000);
  }

  // Inputs / actions
  $('new-game-form').addEventListener('submit', event => { event.preventDefault(); start($('hero-input').value); });
  $('continue-button').addEventListener('click', () => {
    const restored = pausedGame || getSaved();
    if (restored) { game = restored; pausedGame = null; stopRoute(); ui.intent = null; render(); }
    else updateContinue();
  });
  $('settings-button').addEventListener('click', () => openPanel('settings'));
  $('dialog-close').addEventListener('click', closePanel);
  $('panel-dialog').addEventListener('close', () => { ui.panel = null; });
  for (const nav of document.querySelectorAll('[data-panel]')) nav.addEventListener('click', () => openPanel(nav.dataset.panel));
  for (const nav of document.querySelectorAll('[data-town]')) nav.addEventListener('click', () => { ui.town = nav.dataset.town; renderTown(); });
  for (const direction of document.querySelectorAll('[data-move]')) direction.addEventListener('click', () => {
    stopRoute(); const [dx, dy] = direction.dataset.move.split(',').map(Number);
    change(() => G.move(game, dx, dy));
  });
  $('interact-button').addEventListener('click', () => { stopRoute(); change(() => G.interact(game)); });
  $('leave-town').addEventListener('click', () => change(() => G.leaveTown(game)));
  $('ending-continue').addEventListener('click', () => change(() => G.continueAfterEnding(game)));
  for (const btn of document.querySelectorAll('[data-spell]')) btn.addEventListener('click', () => {
    ui.intent = ui.intent === btn.dataset.spell ? null : btn.dataset.spell; render();
  });
  $('battle-potion').addEventListener('click', () => { ui.intent = ui.intent === 'potion' ? null : 'potion'; render(); });
  $('end-turn').addEventListener('click', () => { ui.intent = null; change(() => G.endTurn(game)); });
  $('flee-button').addEventListener('click', () => {
    if (window.confirm('Сбежать? Ваша армия будет потеряна, но герой вернётся в город.')) { ui.intent = null; change(() => G.flee(game)); }
  });
  worldCanvas.addEventListener('click', event => { if (!game) return; const p = worldTile(event); if (G.inside(p.x, p.y)) routeTo(p.x, p.y); });
  worldCanvas.addEventListener('pointermove', event => {
    if (!game || game.mode !== 'world') return;
    const p = worldTile(event);
    if (!ui.hover || ui.hover.x !== p.x || ui.hover.y !== p.y) { ui.hover = p; drawWorld(); }
  });
  worldCanvas.addEventListener('pointerleave', () => { ui.hover = null; if (game?.mode === 'world') drawWorld(); });
  battleCanvas.addEventListener('click', event => {
    if (!game || game.mode !== 'battle') return;
    const p = canvasCoords(event, battleCanvas);
    const x = Math.floor((p.x - GRID.x) / GRID.w), y = Math.floor((p.y - GRID.y) / GRID.h);
    if (x >= 0 && x < G.BATTLE_W && y >= 0 && y < G.BATTLE_H) ui.battleCursor = { x, y };
    ui.cursorVisible = false;
    selectBattleCell(x, y);
  });
  miniMap.addEventListener('click', () => openPanel('map'));
  $('import-file').addEventListener('change', async event => {
    const file = event.target.files?.[0]; event.target.value = '';
    if (!file) return;
    try {
      if (file.size > 2_000_000) throw new Error('Файл слишком большой (максимум 2 МБ).');
      const restored = G.loadGame(await file.text());
      stopRoute(); closePanel(); ui.intent = null; pausedGame = null; game = restored; save(); render();
    } catch (err) { window.alert(`Не удалось загрузить игру: ${err.message}`); }
  });
  window.addEventListener('keydown', event => {
    if (!game || $('panel-dialog').open || ['INPUT', 'TEXTAREA', 'SELECT'].includes(document.activeElement?.tagName)) return;
    const key = event.key.toLowerCase();
    const direction = { arrowup: [0, -1], w: [0, -1], arrowdown: [0, 1], s: [0, 1], arrowleft: [-1, 0], a: [-1, 0], arrowright: [1, 0], d: [1, 0] }[key];
    if (direction && game.mode === 'world') {
      event.preventDefault(); stopRoute(); change(() => G.move(game, ...direction)); return;
    }
    if (direction && game.mode === 'battle') {
      event.preventDefault();
      ui.battleCursor.x = Math.max(0, Math.min(G.BATTLE_W - 1, ui.battleCursor.x + direction[0]));
      ui.battleCursor.y = Math.max(0, Math.min(G.BATTLE_H - 1, ui.battleCursor.y + direction[1]));
      ui.cursorVisible = true;
      drawBattle(); renderBattleControls(); return;
    }
    if (key === ' ' && game.mode === 'battle' && document.activeElement?.tagName !== 'BUTTON') {
      event.preventDefault(); ui.cursorVisible = true;
      selectBattleCell(ui.battleCursor.x, ui.battleCursor.y); return;
    }
    if (key === 'm') { event.preventDefault(); openPanel('map'); }
    else if (key === 'i') { event.preventDefault(); openPanel('bag'); }
    else if (key === 'h') { event.preventDefault(); openPanel('hero'); }
    else if (key === 'j') { event.preventDefault(); openPanel('journal'); }
    else if (key === 'escape' && game.mode === 'town') change(() => G.leaveTown(game));
    else if (key === 'escape' && game.mode === 'battle' && ui.intent) { ui.intent = null; render(); }
    else if (key === 'enter' && game.mode === 'battle' && document.activeElement?.tagName !== 'BUTTON') {
      event.preventDefault(); ui.intent = null; change(() => G.endTurn(game));
    }
  });
  buildRaces();
  loadArt();
  render();
})();
