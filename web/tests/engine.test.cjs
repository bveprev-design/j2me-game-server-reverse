const test = require('node:test');
const assert = require('node:assert/strict');
const G = require('../engine.js');

function encounter(state, id) {
  const loc = state.world.locations.find(item => item.id === id);
  state.mode = 'world';
  state.hero.x = loc.x - 1;
  state.hero.y = loc.y;
  state.world.terrain[loc.y * G.SIZE + loc.x - 1] = G.TERRAIN.GRASS;
  assert.equal(G.move(state, 1, 0), true);
  assert.equal(state.mode, 'battle');
  return loc;
}

function playBattle(state) {
  let rounds = 0;
  while (state.mode === 'battle' && rounds++ < 30) {
    const battle = state.battle;
    const enemy = battle.units.filter(u => u.team === 'enemy' && u.hp > 0).sort((a, b) => a.hp - b.hp)[0];
    if (enemy && !battle.cast && state.hero.mana >= 6) G.castSpell(state, 'bolt', enemy.id);
    if (state.mode !== 'battle') break;
    for (const unit of battle.units.filter(u => u.team === 'ally' && u.hp > 0)) {
      if (state.mode !== 'battle') break;
      let enemies = battle.units.filter(u => u.team === 'enemy' && u.hp > 0);
      let target = enemies.find(e => G.inRange(unit, e));
      if (!target) {
        const moves = G.reachable(state, unit.id);
        moves.sort((a, b) => nearest(a, enemies) - nearest(b, enemies));
        if (moves.length) G.moveBattleUnit(state, unit.id, moves[0].x, moves[0].y);
        target = enemies.find(e => e.hp > 0 && G.inRange(unit, e));
      }
      if (target) G.attackBattleUnit(state, unit.id, target.id);
    }
    if (state.mode === 'battle') G.endTurn(state);
  }
  assert.ok(rounds < 30, 'fight must eventually end');
}
function nearest(cell, enemies) {
  return Math.min(...enemies.map(e => Math.abs(cell.x - e.x) + Math.abs(cell.y - e.y)));
}

test('a deterministic world with reachable landmarks exists for every race and multiple seeds', () => {
  for (let race = 0; race < 5; race++) for (const seed of [0, 1, 1234, 0xffffffff]) {
    const state = G.createGame('Искатель', race, seed);
    const same = G.createGame('Искатель', race, seed);
    assert.deepEqual(state.world.terrain, same.world.terrain);
    assert.equal(state.world.terrain.length, 36 * 36);
    assert.equal(state.world.explored.length, 36 * 36);
    assert.equal(state.army.length, 2);
    for (const landmark of state.world.locations) {
      state.world.explored[landmark.y * G.SIZE + landmark.x] = 1;
      const path = G.findPath(state, landmark.x, landmark.y);
      assert.ok(path, `${landmark.id} blocked with seed ${seed}`);
      assert.equal(path.at(-1).x, landmark.x);
      assert.equal(path.at(-1).y, landmark.y);
    }
  }
  assert.throws(() => G.createGame('', 0), /имя/);
  assert.throws(() => G.createGame('Лорд', 9), /расу/);
});

test('movement, chests, fog, city and teleport work without a server', () => {
  const s = G.createGame('Лорд', 4, 8);
  assert.equal(G.findPath(s, 28, 9), null, 'not-yet-discovered target cannot be clicked');
  assert.equal(G.move(s, -1, -1), false, 'diagonal movement is forbidden');
  assert.equal(G.move(s, 1, 0), true);
  assert.equal(G.move(s, 1, 0), true);
  assert.equal(s.hero.gold, 87);
  assert.equal(s.hero.inventory.potion, 2);
  assert.equal(s.world.locations.find(l => l.id === 'first-chest').cleared, true);
  G.move(s, -1, 0); G.move(s, 1, 0);
  assert.equal(s.hero.gold, 87, 'chest cannot be farmed repeatedly');
  s.hero.x = 17; s.hero.y = 19;
  G.move(s, 0, -1);
  assert.equal(s.mode, 'town');
  assert.equal(G.move(s, 1, 0), false, 'cannot walk while in town');
  assert.equal(G.leaveTown(s), true);
  s.hero.x = 11; s.hero.y = 22;
  G.move(s, 1, 0);
  assert.equal(s.hero.x, 25);
  assert.equal(s.hero.y, 24);
  G.move(s, -1, 0); G.move(s, 1, 0);
  assert.equal(s.hero.x, 12);
  assert.equal(s.hero.y, 22);
});

test('town economy, leadership limit, equipment and consumables', () => {
  const s = G.createGame('Странник', 0, 42);
  G.move(s, 0, -1);
  const kind = G.RACES[0].guard;
  assert.equal(G.buy(s, 'sword'), true);
  assert.equal(s.hero.gold, 23);
  assert.equal(G.buy(s, 'sword'), false);
  assert.equal(G.equip(s, 'sword'), true);
  assert.equal(s.hero.equipment.weapon, 'sword');
  assert.equal(G.equip(s, 'sword'), true);
  assert.equal(s.hero.equipment.weapon, null);
  assert.equal(G.recruit(s, kind, 3), false, 'insufficient funds');
  assert.equal(G.recruit(s, kind, 1), true);
  assert.equal(G.recruit(s, kind, 1.5), false);
  s.hero.gold = 1000;
  assert.equal(G.recruit(s, kind, G.capacity(s)), false, 'leadership cap');
  s.hero.health = 10; s.hero.mana = 0;
  assert.equal(G.rest(s), true);
  assert.equal(s.hero.health, s.hero.maxHealth);
  assert.equal(s.hero.mana, s.hero.maxMana);
  assert.equal(G.leaveTown(s), true);
  s.hero.health = 5;
  assert.equal(G.useItem(s, 'potion'), true);
  assert.equal(s.hero.health, 30);
  assert.equal(G.useItem(s, 'potion'), false, 'no potion left');
  s.hero.points = 1;
  const before = G.capacity(s);
  assert.equal(G.levelStat(s, 'leadership'), true);
  assert.equal(G.capacity(s), before + 5);
  assert.equal(G.levelStat(s, 'magic'), false, 'no free stat points left');
});

test('tactical battle checks range, obstacles, turns, magic and battle saves', () => {
  let s = G.createGame('Герой', 4, 33);
  const loc = encounter(s, 'wild-bandits');
  const first = s.battle.units.find(u => u.team === 'ally');
  const enemy = s.battle.units.find(u => u.team === 'enemy');
  assert.equal(G.attackBattleUnit(s, first.id, enemy.id), false, 'melee cannot hit across the field');
  assert.equal(G.moveBattleUnit(s, first.id, 2, 0), false, 'cannot teleport an army unit');
  assert.equal(G.reachable(s, first.id).some(p => p.x === 1 && p.y === 2), true);
  assert.equal(G.moveBattleUnit(s, first.id, 1, 2), true);
  assert.equal(G.attackBattleUnit(s, first.id, enemy.id), true, 'moving then attacking is allowed');
  assert.equal(G.reachable(s, first.id).length, 0, 'one movement action per round');
  assert.equal(G.castSpell(s, 'heal', first.id), false, 'cannot heal an unwounded unit');
  assert.equal(G.castSpell(s, 'bolt', enemy.id), true);
  assert.equal(G.castSpell(s, 'bolt', enemy.id), false, 'one spell per round');
  if (s.mode === 'battle') {
    const hp = first.hp;
    G.endTurn(s);
    assert.equal(s.battle.round, 2);
    assert.ok(first.hp <= hp);
    s = G.loadGame(JSON.stringify(s));
    playBattle(s);
  }
  assert.equal(s.mode, 'world');
  assert.equal(loc.cleared, false, 'only the restored location was cleared after loading');
  assert.equal(s.world.locations.find(l => l.id === loc.id).cleared, true);
  assert.ok(s.hero.xp > 0);
  assert.ok(s.hero.gold > 65);
});

test('three guardian fights unlock the ending only after returning to the city', () => {
  const s = G.createGame('Победитель', 4, 101);
  // Recruit beforehand so the offline campaign can be finished without a server.
  s.mode = 'town'; s.hero.gold = 800; s.hero.mana = 100; s.hero.maxMana = 100;
  assert.equal(G.recruit(s, 'knight', 10), true);
  assert.equal(G.recruit(s, 'humanArcher', 6), true);
  G.leaveTown(s);
  for (const id of ['shrine-north', 'shrine-east', 'shrine-south']) {
    const loc = encounter(s, id);
    assert.equal(loc.type, 'shrine');
    assert.equal(G.reachable(s, s.battle.selected).some(p => p.x === 2 && p.y === 2), false, 'altar blocks a cell');
    playBattle(s);
    assert.equal(s.mode, 'world');
    assert.equal(loc.cleared, true);
    // Heal / replenish between expeditions (the player can do so at the inn).
    s.mode = 'town'; s.hero.gold += 200;
    G.recruit(s, 'knight', Math.min(3, G.capacity(s) - G.armySize(s)));
    G.rest(s); G.leaveTown(s);
  }
  assert.equal(G.relicCount(s), 3);
  assert.equal(s.campaignWon, false);
  s.hero.x = 17; s.hero.y = 19;
  G.move(s, 0, -1);
  assert.equal(s.mode, 'ending');
  assert.equal(s.campaignWon, true);
  assert.equal(G.continueAfterEnding(s), true);
  assert.equal(s.mode, 'town');
  G.leaveTown(s);
  G.move(s, 1, 0); G.move(s, -1, 0);
  assert.equal(s.mode, 'town', 'ending should not retrigger on every city visit');
});

test('the campaign is finishable with only starting gold, chests and battle rewards', () => {
  let state = G.createGame('Странник', 4, 1234);
  const route = ['first-chest', 'wild-wolves', 'chest-north', 'wild-bandits',
    'shrine-north', 'chest-east', 'shrine-east', 'chest-south', 'shrine-south', 'haven'];

  // Take one walkable step toward a landmark. Like manual exploration, this does
  // not reveal undiscovered map cells or grant any items or resources.
  function nextStep(x, y) {
    const prev = new Int32Array(G.SIZE * G.SIZE).fill(-1);
    const start = state.hero.y * G.SIZE + state.hero.x;
    const target = y * G.SIZE + x;
    const queue = [start];
    prev[start] = start;
    for (let head = 0; head < queue.length && prev[target] === -1; head++) {
      const here = queue[head], hx = here % G.SIZE, hy = Math.floor(here / G.SIZE);
      for (const [dx, dy] of [[0, -1], [1, 0], [0, 1], [-1, 0]]) {
        const nx = hx + dx, ny = hy + dy, n = ny * G.SIZE + nx;
        if (!G.inside(nx, ny) || prev[n] !== -1 || !G.walkable(state.world.terrain[n])) continue;
        prev[n] = here;
        queue.push(n);
      }
    }
    assert.notEqual(prev[target], -1, `landmark ${x}:${y} is unreachable`);
    for (let at = target; at !== start; at = prev[at]) {
      if (prev[at] === start) return { x: at % G.SIZE, y: Math.floor(at / G.SIZE) };
    }
    return null;
  }

  for (const id of route) {
    let done = false;
    for (let attempts = 0; attempts < 2000 && !done; attempts++) {
      const loc = state.world.locations.find(l => l.id === id);
      if (id === 'haven' ? state.mode === 'ending' : loc.cleared) { done = true; break; }
      if (state.mode === 'battle') playBattle(state);
      else if (state.mode === 'town') {
        if (state.hero.gold >= 12 && (state.hero.mana < state.hero.maxMana ||
            state.army.some(stack => stack.hp % G.TROOPS[stack.kind].hp !== 0))) G.rest(state);
        while (state.hero.gold >= 7 && G.armySize(state) < G.capacity(state)) {
          const archers = G.stackCount(state.army.find(stack => stack.kind === 'humanArcher'));
          const kind = archers > G.armySize(state) / 2 ? 'knight' : 'humanArcher';
          assert.equal(G.recruit(state, kind), true);
        }
        G.leaveTown(state);
      } else {
        const step = nextStep(loc.x, loc.y);
        if (step) assert.equal(G.move(state, step.x - state.hero.x, step.y - state.hero.y), true);
        else G.interact(state);
      }
    }
    assert.ok(done, `cannot complete ${id} without extra resources`);
    // A player can close and reopen the local HTML file at any point.
    state = G.loadGame(JSON.stringify(state));
  }
  assert.equal(G.relicCount(state), 3);
  assert.equal(state.campaignWon, true);
  assert.equal(state.mode, 'ending');
});

test('fleeing and losing cannot strand the player with no army', () => {
  const s = G.createGame('Сбежавший', 1, 45);
  encounter(s, 'wild-wolves');
  assert.equal(G.flee(s), true);
  assert.equal(s.mode, 'town');
  assert.equal(G.armySize(s), 0);
  assert.equal(G.leaveTown(s), true);
  assert.equal(G.armySize(s), 2, 'city supplies an emergency garrison for free');
  assert.equal(s.mode, 'world');
  s.army[0].hp = 1; s.army[1].hp = 0;
  encounter(s, 'wild-bandits');
  for (let i = 0; i < 10 && s.mode === 'battle'; i++) G.endTurn(s);
  assert.equal(s.mode, 'town');
  assert.equal(s.hero.x, G.CITY.x);
  assert.equal(s.hero.y, G.CITY.y);
  G.leaveTown(s);
  assert.equal(G.armySize(s), 2);
});

test('saves round-trip and reject incompatible/corrupted or missing battle state', () => {
  const state = G.createGame('Путник', 2, 17);
  assert.deepEqual(G.loadGame(JSON.stringify(state)), state);
  assert.throws(() => G.loadGame('{not json'), /повреждён/);
  const bad = JSON.parse(JSON.stringify(state)); bad.version = 99;
  assert.throws(() => G.loadGame(bad), /Несовместимое/);
  bad.version = G.VERSION; bad.world.terrain.length = 5;
  assert.throws(() => G.loadGame(bad), /повреждён/);
  const fighting = G.createGame('В бою', 4, 33);
  encounter(fighting, 'wild-wolves');
  fighting.battle = null;
  assert.throws(() => G.loadGame(JSON.stringify(fighting)), /боя/);
  const altered = G.createGame('Безопасно', 0, 73);
  altered.world.locations[0].name = '<img src=x onerror=alert(1)>';
  altered.world.locations[1].loot.gold = 999999;
  const cityTile = G.CITY.y * G.SIZE + G.CITY.x;
  altered.world.terrain[cityTile] = G.TERRAIN.WATER;
  const restored = G.loadGame(JSON.stringify(altered));
  assert.equal(restored.world.locations[0].name, 'Город Надежды');
  assert.equal(restored.world.locations[1].loot.gold, 22, 'loot is canonical after import');
  assert.equal(restored.world.terrain[cityTile], G.TERRAIN.GRASS, 'terrain is rebuilt from the seed');
  altered.mode = 'battle'; altered.battle = { locationId: 'wild-wolves', units: [] };
  assert.throws(() => G.loadGame(JSON.stringify(altered)), /боя/);

  for (const value of ['17', 17.5, null]) {
    const invalidCoords = JSON.parse(JSON.stringify(state));
    invalidCoords.hero.x = value;
    assert.throws(() => G.loadGame(invalidCoords), /повреждён/, `bad hero coordinate ${value}`);
  }
  const battle = G.createGame('Страж', 4, 33);
  encounter(battle, 'wild-wolves');
  assert.deepEqual(G.loadGame(JSON.stringify(battle)), battle);
  for (const mutate of [
    b => { b.units[0].x = '1'; },
    b => { b.units[0].kind = 'wolf'; },
    b => { b.units[0].maxHp = 9999; },
    b => { b.units[1].x = b.units[0].x; b.units[1].y = b.units[0].y; }
  ]) {
    const broken = JSON.parse(JSON.stringify(battle));
    mutate(broken.battle);
    assert.throws(() => G.loadGame(broken), /боя/);
  }
  const selectedEnemy = JSON.parse(JSON.stringify(battle));
  selectedEnemy.battle.selected = 'e0';
  assert.equal(G.loadGame(selectedEnemy).battle.selected, 'a0', 'restore a living friendly selection');
});

test('the offline folder contains every referenced sprite and has no runtime network API', () => {
  const fs = require('node:fs');
  const path = require('node:path');
  const web = path.resolve(__dirname, '..');
  const script = fs.readFileSync(path.join(web, 'game.js'), 'utf8');
  const manifest = script.match(/const ASSETS = \[([\s\S]*?)\];/)[1]
    .match(/'[^']+'/g).map(name => name.slice(1, -1));
  const files = new Set(['logo', 'money', 'item-1', 'item-2', ...manifest]);
  for (const file of files) {
    const bundled = path.join(web, 'assets', `${file}.png`);
    const original = path.resolve(web, '..', 'resources', 'mobak', 'res', `${file}.png`);
    assert.ok(fs.existsSync(bundled), `${file}.png missing from the offline folder`);
    assert.deepEqual(fs.readFileSync(bundled), fs.readFileSync(original), `${file}.png differs from the original sprite`);
  }
  const source = fs.readFileSync(path.join(web, 'engine.js'), 'utf8') + script +
    fs.readFileSync(path.join(web, 'index.html'), 'utf8') + fs.readFileSync(path.join(web, 'styles.css'), 'utf8');
  assert.doesNotMatch(source, /\b(?:https?|wss?):\/\/|\b(?:fetch|WebSocket|XMLHttpRequest|EventSource)\s*\(/);
});
