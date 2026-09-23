/* Lordmancer Offline: local, deterministic game rules. No network or J2ME runtime. */
(function (root, factory) {
  const game = factory();
  if (typeof module === 'object' && module.exports) module.exports = game;
  root.Lordmancer = game;
})(typeof globalThis !== 'undefined' ? globalThis : this, function () {
  'use strict';

  const VERSION = 1;
  const SIZE = 36;
  const BATTLE_W = 5;
  const BATTLE_H = 6;
  const TERRAIN = Object.freeze({ ROCK: 2, SAND: 3, SNOW: 4, GRASS: 5, WATER: 6, MOUNTAIN: 7 });
  const STORAGE_KEY = 'lordmancer.offline.v1';
  const CITY = { x: 17, y: 18 };

  const RACES = [
    { name: 'Эльфы', hero: 0, icon: 0, description: 'Следопыты лесов. Сильны в магии и дальнем бою.', bonus: { attack: 0, defense: 0, magic: 2, leadership: 0 }, guard: 'unicorn', ranged: 'elfArcher' },
    { name: 'Гномы', hero: 1, icon: 1, description: 'Упрямые защитники, привыкшие сражаться бок о бок.', bonus: { attack: 0, defense: 2, magic: 0, leadership: 0 }, guard: 'dwarf', ranged: 'dwarfArcher' },
    { name: 'Орки', hero: 2, icon: 2, description: 'Стремительные воины, опасные в ближнем бою.', bonus: { attack: 2, defense: 0, magic: 0, leadership: 0 }, guard: 'orc', ranged: 'orcArcher' },
    { name: 'Мёртвые', hero: 3, icon: 3, description: 'Некроманты управляют нежитью и древней магией.', bonus: { attack: 0, defense: 0, magic: 2, leadership: 0 }, guard: 'skeleton', ranged: 'lich' },
    { name: 'Люди', hero: 4, icon: 4, description: 'Прирождённые лидеры: их армия может быть больше.', bonus: { attack: 0, defense: 0, magic: 0, leadership: 2 }, guard: 'knight', ranged: 'humanArcher' }
  ];

  // Sheet frames match the J2ME client: unites1/2 have 5 columns of 50 x 28.
  const TROOPS = {
    unicorn:     { name: 'Единороги', hp: 8, attack: 4, defense: 1, move: 3, range: 1, price: 8, sheet: 'unites1', frame: 0 },
    elfArcher:   { name: 'Лучники', hp: 5, attack: 4, defense: 0, move: 2, range: 3, price: 7, sheet: 'unites1', frame: 3 },
    dwarf:       { name: 'Стражи', hp: 10, attack: 4, defense: 2, move: 2, range: 1, price: 9, sheet: 'unites2', frame: 4 },
    dwarfArcher: { name: 'Стрелки', hp: 6, attack: 4, defense: 1, move: 2, range: 3, price: 8, sheet: 'unites2', frame: 9 },
    orc:         { name: 'Налётчики', hp: 7, attack: 5, defense: 0, move: 3, range: 1, price: 8, sheet: 'unites2', frame: 13 },
    orcArcher:   { name: 'Охотники', hp: 5, attack: 4, defense: 0, move: 2, range: 3, price: 7, sheet: 'unites2', frame: 8 },
    skeleton:    { name: 'Скелеты', hp: 7, attack: 4, defense: 1, move: 2, range: 1, price: 7, sheet: 'unites2', frame: 0 },
    lich:        { name: 'Личи', hp: 5, attack: 4, defense: 0, move: 2, range: 3, price: 8, sheet: 'unites2', frame: 3 },
    knight:      { name: 'Мечники', hp: 8, attack: 4, defense: 1, move: 2, range: 1, price: 7, sheet: 'unites1', frame: 12 },
    humanArcher: { name: 'Стрелки', hp: 5, attack: 4, defense: 0, move: 2, range: 3, price: 7, sheet: 'unites2', frame: 9 },
    wolf:        { name: 'Волки', hp: 5, attack: 3, defense: 0, move: 3, range: 1, sheet: 'unites1', frame: 10 },
    bandit:      { name: 'Разбойники', hp: 7, attack: 4, defense: 1, move: 2, range: 1, sheet: 'unites2', frame: 7 },
    wraith:      { name: 'Призраки', hp: 6, attack: 4, defense: 0, move: 2, range: 2, sheet: 'unites1', frame: 5 },
    golem:       { name: 'Големы', hp: 10, attack: 5, defense: 2, move: 2, range: 1, sheet: 'unites1', frame: 8 },
    drake:       { name: 'Драконы', hp: 11, attack: 5, defense: 1, move: 2, range: 2, sheet: 'unites1', frame: 13 }
  };

  const ITEMS = {
    potion: { name: 'Зелье жизни', description: 'Восстановить 25 жизни героя или 18 жизни отряда в бою.', price: 14, sheet: 'item-2', frame: 3 },
    ether:  { name: 'Эликсир маны', description: 'Восстановить 12 маны.', price: 14, sheet: 'item-2', frame: 1 },
    sword:  { name: 'Стальной меч', description: '+2 к атаке армии.', price: 42, sheet: 'item-1', frame: 0, slot: 'weapon' },
    armor:  { name: 'Кованая броня', description: '+2 к защите армии.', price: 48, sheet: 'item-1', frame: 2, slot: 'armor' }
  };

  const ENCOUNTERS = {
    wolves:    { name: 'Волчья стая', troops: [['wolf', 3]], gold: 16, xp: 18 },
    bandits:   { name: 'Разбойники', troops: [['bandit', 3], ['wolf', 2]], gold: 25, xp: 24 },
    shades:    { name: 'Тени руин', troops: [['wraith', 3]], gold: 26, xp: 25 },
    raiders:   { name: 'Пустынные налётчики', troops: [['bandit', 4], ['wolf', 2]], gold: 32, xp: 29 },
    spectres:  { name: 'Стражи перевала', troops: [['wraith', 4], ['wolf', 2]], gold: 30, xp: 30 },
    north:     { name: 'Страж северной печати', troops: [['golem', 4], ['wraith', 2]], gold: 48, xp: 42 },
    east:      { name: 'Страж восточной печати', troops: [['drake', 4], ['bandit', 3]], gold: 54, xp: 48 },
    south:     { name: 'Страж южной печати', troops: [['drake', 5], ['golem', 3]], gold: 65, xp: 55 }
  };

  const LOCATION_DATA = [
    { id: 'haven', type: 'city', name: 'Город Надежды', x: CITY.x, y: CITY.y },
    { id: 'first-chest', type: 'chest', name: 'Забытый сундук', x: 19, y: 19, loot: { gold: 22, potion: 1 } },
    { id: 'chest-north', type: 'chest', name: 'Тайник путника', x: 11, y: 13, loot: { gold: 30, ether: 1 } },
    { id: 'chest-east', type: 'chest', name: 'Старинный ларец', x: 25, y: 16, loot: { gold: 34, potion: 1 } },
    { id: 'chest-south', type: 'chest', name: 'Затерянный сундук', x: 26, y: 28, loot: { gold: 42, ether: 1 } },
    { id: 'wild-wolves', type: 'enemy', name: 'Волчья стая', x: 21, y: 19, encounter: 'wolves' },
    { id: 'wild-bandits', type: 'enemy', name: 'Разбойники', x: 15, y: 13, encounter: 'bandits' },
    { id: 'wild-shades', type: 'enemy', name: 'Тени руин', x: 20, y: 11, encounter: 'shades' },
    { id: 'wild-raiders', type: 'enemy', name: 'Налётчики', x: 26, y: 21, encounter: 'raiders' },
    { id: 'wild-spectres', type: 'enemy', name: 'Стражи перевала', x: 10, y: 26, encounter: 'spectres' },
    { id: 'shrine-north', type: 'shrine', name: 'Северная печать', x: 8, y: 8, encounter: 'north' },
    { id: 'shrine-east', type: 'shrine', name: 'Восточная печать', x: 28, y: 9, encounter: 'east' },
    { id: 'shrine-south', type: 'shrine', name: 'Южная печать', x: 27, y: 29, encounter: 'south' },
    { id: 'gate-west', type: 'gate', name: 'Древние врата', x: 12, y: 22, destination: 'gate-east' },
    { id: 'gate-east', type: 'gate', name: 'Древние врата', x: 25, y: 24, destination: 'gate-west' }
  ];

  function hash(seed, x, y) {
    let n = Math.imul(x + 11, 374761393) + Math.imul(y + 37, 668265263) + seed;
    n = Math.imul(n ^ (n >>> 13), 1274126177);
    return (n ^ (n >>> 16)) >>> 0;
  }

  function hashString(text) {
    let n = 2166136261;
    for (let i = 0; i < text.length; i++) n = Math.imul(n ^ text.charCodeAt(i), 16777619);
    return n >>> 0;
  }

  function noise(seed, x, y, scale) {
    const fx = x / scale, fy = y / scale;
    const ix = Math.floor(fx), iy = Math.floor(fy);
    const sx = (fx - ix) ** 2 * (3 - 2 * (fx - ix));
    const sy = (fy - iy) ** 2 * (3 - 2 * (fy - iy));
    const a = hash(seed, ix, iy) / 4294967296;
    const b = hash(seed, ix + 1, iy) / 4294967296;
    const c = hash(seed, ix, iy + 1) / 4294967296;
    const d = hash(seed, ix + 1, iy + 1) / 4294967296;
    return (a + (b - a) * sx) * (1 - sy) + (c + (d - c) * sx) * sy;
  }

  function pos(x, y) { return y * SIZE + x; }
  function inside(x, y) { return x >= 0 && y >= 0 && x < SIZE && y < SIZE; }
  function walkable(terrain) { return terrain !== TERRAIN.WATER && terrain !== TERRAIN.MOUNTAIN; }

  function makeWorld(seed) {
    const terrain = new Array(SIZE * SIZE);
    for (let y = 0; y < SIZE; y++) {
      for (let x = 0; x < SIZE; x++) {
        const height = noise(seed, x, y, 8) * 0.7 + noise(seed ^ 0x56ac, x, y, 3) * 0.3;
        const edge = Math.min(x, y, SIZE - x - 1, SIZE - y - 1);
        let tile = TERRAIN.GRASS;
        if (edge < 1 || height < (edge < 3 ? 0.43 : 0.23)) tile = TERRAIN.WATER;
        else if (height > 0.83) tile = TERRAIN.MOUNTAIN;
        else if (y < 11 && height > 0.43) tile = TERRAIN.SNOW;
        else if (x > 22 && y > 16 && height > 0.39) tile = TERRAIN.SAND;
        else if (height > 0.64) tile = TERRAIN.ROCK;
        terrain[pos(x, y)] = tile;
      }
    }

    // Server maps do not ship with the client. These carved trails guarantee that
    // every landmark in the local campaign is reachable for every world seed.
    function carve(ax, ay, bx, by) {
      let x = ax, y = ay;
      while (x !== bx || y !== by) {
        const choice = hash(seed ^ 0x411, x, y) % (Math.abs(x - bx) + Math.abs(y - by));
        if (x !== bx && (y === by || choice < Math.abs(x - bx))) x += Math.sign(bx - x);
        else y += Math.sign(by - y);
        if (inside(x, y) && !walkable(terrain[pos(x, y)])) terrain[pos(x, y)] = TERRAIN.GRASS;
      }
    }
    for (const landmark of LOCATION_DATA) {
      carve(CITY.x, CITY.y, landmark.x, landmark.y);
      terrain[pos(landmark.x, landmark.y)] = TERRAIN.GRASS;
    }
    for (let y = CITY.y - 3; y <= CITY.y + 3; y++) {
      for (let x = CITY.x - 3; x <= CITY.x + 3; x++) {
        if (inside(x, y) && !walkable(terrain[pos(x, y)])) terrain[pos(x, y)] = TERRAIN.GRASS;
      }
    }
    return {
      seed, terrain, explored: Array(SIZE * SIZE).fill(0),
      locations: LOCATION_DATA.map(loc => loc.loot ? { ...loc, loot: { ...loc.loot }, cleared: false } : { ...loc, cleared: false })
    };
  }

  function reveal(state, cx, cy) {
    for (let dy = -5; dy <= 5; dy++) {
      for (let dx = -5; dx <= 5; dx++) {
        if (dx * dx + dy * dy <= 25 && inside(cx + dx, cy + dy)) state.world.explored[pos(cx + dx, cy + dy)] = 1;
      }
    }
  }

  function note(state, text, kind = 'info') {
    state.log.unshift({ text, kind });
    state.log.length = Math.min(state.log.length, 40);
    state.lastMessage = text;
  }

  function xpNeeded(level) { return 18 + level * 20; }
  function capacity(state) { return 12 + state.hero.leadership * 5; }
  function stackCount(stack) { return stack && stack.hp > 0 ? Math.ceil(stack.hp / TROOPS[stack.kind].hp) : 0; }
  function armySize(state) { return state.army.reduce((n, stack) => n + stackCount(stack), 0); }
  function locationAt(state, x, y) { return state.world.locations.find(loc => loc.x === x && loc.y === y) || null; }
  function hasItem(state, id) { return (state.hero.inventory[id] || 0) > 0; }

  function createGame(name, race = 4, seed) {
    race = Number(race);
    if (!Number.isInteger(race) || race < 0 || race >= RACES.length) throw new Error('Выберите расу героя.');
    name = String(name || '').trim().replace(/\s+/g, ' ').slice(0, 24);
    if (!name) throw new Error('Введите имя героя.');
    seed = Number.isInteger(seed) ? seed >>> 0 : hashString(name + ':' + race);
    const choice = RACES[race];
    const state = {
      version: VERSION, mode: 'world', campaignWon: false, steps: 0,
      hero: {
        name, race, x: CITY.x, y: CITY.y + 1, level: 1, xp: 0, points: 0,
        health: 48, maxHealth: 48, mana: 18 + choice.bonus.magic * 2,
        maxMana: 18 + choice.bonus.magic * 2, gold: 65,
        attack: 2 + choice.bonus.attack, defense: 2 + choice.bonus.defense,
        magic: 2 + choice.bonus.magic, leadership: 2 + choice.bonus.leadership,
        inventory: { potion: 1, ether: 0, sword: 0, armor: 0 },
        equipment: { weapon: null, armor: null }
      },
      army: [{ kind: choice.guard, hp: TROOPS[choice.guard].hp * 5 }, { kind: choice.ranged, hp: TROOPS[choice.ranged].hp * 3 }],
      world: makeWorld(seed), battle: null, log: [], lastMessage: ''
    };
    reveal(state, state.hero.x, state.hero.y);
    note(state, 'Добро пожаловать в Сотканный мир. Отыщите три печати и вернитесь в город.', 'quest');
    return state;
  }

  function gainXp(state, amount) {
    state.hero.xp += amount;
    while (state.hero.xp >= xpNeeded(state.hero.level)) {
      state.hero.xp -= xpNeeded(state.hero.level);
      state.hero.level++;
      state.hero.points++;
      state.hero.maxHealth += 5;
      state.hero.health = Math.min(state.hero.maxHealth, state.hero.health + 5);
      state.hero.maxMana += 2;
      state.hero.mana = Math.min(state.hero.maxMana, state.hero.mana + 4);
      note(state, `Новый уровень: ${state.hero.level}! Доступно очко характеристики.`, 'success');
    }
  }

  function levelStat(state, stat) {
    if (!['attack', 'defense', 'magic', 'leadership'].includes(stat) || state.hero.points < 1) return false;
    state.hero[stat]++;
    state.hero.points--;
    if (stat === 'magic') { state.hero.maxMana += 2; state.hero.mana += 2; }
    note(state, 'Характеристика улучшена.', 'success');
    return true;
  }

  function collectChest(state, loc) {
    if (loc.cleared) { note(state, 'Сундук уже пуст.'); return; }
    loc.cleared = true;
    const found = [];
    for (const [key, amount] of Object.entries(loc.loot)) {
      if (key === 'gold') { state.hero.gold += amount; found.push(`${amount} монет`); }
      else { state.hero.inventory[key] += amount; found.push(`${ITEMS[key].name} ×${amount}`); }
    }
    note(state, `В сундуке: ${found.join(', ')}.`, 'loot');
  }

  function enterTown(state) {
    if (state.campaignWon) { state.mode = 'town'; return; }
    const seals = relicCount(state);
    if (seals === 3) {
      state.campaignWon = true;
      state.mode = 'ending';
      note(state, 'Три печати вернулись в город. Ткань мира восстановлена!', 'success');
    } else {
      state.mode = 'town';
      note(state, 'Город Надежды: здесь можно отдохнуть, купить припасы и нанять войско.');
    }
  }

  function visit(state, loc) {
    switch (loc.type) {
      case 'city': enterTown(state); break;
      case 'chest': collectChest(state, loc); break;
      case 'enemy':
      case 'shrine':
        if (!loc.cleared) startBattle(state, loc);
        else note(state, loc.type === 'shrine' ? 'Древняя печать уже ваша.' : 'Враг повержен.');
        break;
      case 'gate': {
        const target = state.world.locations.find(other => other.id === loc.destination);
        state.hero.x = target.x;
        state.hero.y = target.y;
        reveal(state, target.x, target.y);
        note(state, 'Древние врата перенесли вашу армию на другой край земли.', 'quest');
        break;
      }
    }
  }

  function move(state, dx, dy) {
    if (state.mode !== 'world' || Math.abs(dx) + Math.abs(dy) !== 1) return false;
    const x = state.hero.x + dx, y = state.hero.y + dy;
    if (!inside(x, y)) { note(state, 'Дальше — край земли.'); return false; }
    if (!walkable(state.world.terrain[pos(x, y)])) { note(state, 'Здесь не пройти.'); return false; }
    const loc = locationAt(state, x, y);
    if (loc && (loc.type === 'enemy' || loc.type === 'shrine') && !loc.cleared && armySize(state) === 0) {
      note(state, 'Без армии нельзя вступить в бой. Вернитесь в город.', 'warning');
      return false;
    }
    state.hero.x = x;
    state.hero.y = y;
    state.steps++;
    reveal(state, x, y);
    if (loc) visit(state, loc);
    return true;
  }

  function interact(state) {
    if (state.mode !== 'world') return false;
    const loc = locationAt(state, state.hero.x, state.hero.y);
    if (loc) { visit(state, loc); return true; }
    note(state, 'Здесь нет ничего интересного.');
    return false;
  }

  function leaveTown(state) {
    if (state.mode !== 'town') return false;
    if (armySize(state) === 0) {
      const guard = RACES[state.hero.race].guard;
      const stack = state.army.find(s => s.kind === guard);
      if (stack) stack.hp = TROOPS[guard].hp * 2;
      else state.army.push({ kind: guard, hp: TROOPS[guard].hp * 2 });
      note(state, 'Городской гарнизон выделил вам двух воинов.', 'success');
    }
    state.mode = 'world';
    return true;
  }

  function relicCount(state) {
    return state.world.locations.filter(loc => loc.type === 'shrine' && loc.cleared).length;
  }

  function findPath(state, toX, toY) {
    if (state.mode !== 'world' || !inside(toX, toY) || !walkable(state.world.terrain[pos(toX, toY)])) return null;
    if (!state.world.explored[pos(toX, toY)]) return null;
    const from = pos(state.hero.x, state.hero.y), target = pos(toX, toY);
    const previous = new Int32Array(SIZE * SIZE).fill(-1);
    const queue = new Int32Array(SIZE * SIZE);
    let head = 0, tail = 0;
    previous[from] = from;
    queue[tail++] = from;
    while (head < tail && previous[target] === -1) {
      const here = queue[head++], x = here % SIZE, y = Math.floor(here / SIZE);
      for (const [dx, dy] of [[0, -1], [1, 0], [0, 1], [-1, 0]]) {
        const nx = x + dx, ny = y + dy;
        if (!inside(nx, ny) || !walkable(state.world.terrain[pos(nx, ny)])) continue;
        const next = pos(nx, ny);
        if (previous[next] !== -1) continue;
        previous[next] = here;
        queue[tail++] = next;
      }
    }
    if (previous[target] === -1) return null;
    const path = [];
    for (let at = target; at !== from; at = previous[at]) path.push({ x: at % SIZE, y: Math.floor(at / SIZE) });
    return path.reverse();
  }

  function recruit(state, kind, amount = 1) {
    if (state.mode !== 'town' || ![RACES[state.hero.race].guard, RACES[state.hero.race].ranged].includes(kind)) return false;
    amount = Number(amount);
    if (!Number.isInteger(amount) || amount < 1 || amount > 10) return false;
    if (armySize(state) + amount > capacity(state)) { note(state, 'Армия переполнена. Улучшите лидерство.', 'warning'); return false; }
    const price = TROOPS[kind].price * amount;
    if (state.hero.gold < price) { note(state, 'Недостаточно монет.', 'warning'); return false; }
    state.hero.gold -= price;
    const stack = state.army.find(s => s.kind === kind);
    if (stack) stack.hp += TROOPS[kind].hp * amount;
    else state.army.push({ kind, hp: TROOPS[kind].hp * amount });
    note(state, `Наняты ${TROOPS[kind].name.toLowerCase()}: ${amount}.`, 'success');
    return true;
  }

  function buy(state, itemId) {
    if (state.mode !== 'town' || !ITEMS[itemId]) return false;
    const item = ITEMS[itemId];
    if (item.slot && state.hero.inventory[itemId] > 0) { note(state, 'Этот предмет уже куплен.'); return false; }
    if (state.hero.gold < item.price) { note(state, 'Недостаточно монет.', 'warning'); return false; }
    state.hero.gold -= item.price;
    state.hero.inventory[itemId] = (state.hero.inventory[itemId] || 0) + 1;
    note(state, `Куплено: ${item.name}.`, 'success');
    return true;
  }

  function rest(state) {
    if (state.mode !== 'town') return false;
    const needsRest = state.hero.health < state.hero.maxHealth || state.hero.mana < state.hero.maxMana ||
      state.army.some(stack => stack.hp % TROOPS[stack.kind].hp !== 0);
    if (!needsRest) { note(state, 'Армия уже отдохнула.'); return false; }
    if (state.hero.gold < 12) { note(state, 'Ночлег стоит 12 монет.', 'warning'); return false; }
    state.hero.gold -= 12;
    state.hero.health = state.hero.maxHealth;
    state.hero.mana = state.hero.maxMana;
    for (const stack of state.army) stack.hp = stackCount(stack) * TROOPS[stack.kind].hp;
    note(state, 'Постоялый двор: жизни и мана восстановлены, раненые вылечены.', 'success');
    return true;
  }

  function equip(state, itemId) {
    const item = ITEMS[itemId];
    if (!item || !item.slot || !hasItem(state, itemId) || state.mode === 'battle') return false;
    state.hero.equipment[item.slot] = state.hero.equipment[item.slot] === itemId ? null : itemId;
    note(state, state.hero.equipment[item.slot] ? `${item.name} надет.` : `${item.name} снят.`);
    return true;
  }

  function useItem(state, itemId, unitId) {
    if (!hasItem(state, itemId)) { note(state, 'Нет подходящего предмета.', 'warning'); return false; }
    if (itemId === 'ether') {
      if (state.hero.mana >= state.hero.maxMana) { note(state, 'Мана уже полная.'); return false; }
      state.hero.mana = Math.min(state.hero.maxMana, state.hero.mana + 12);
    } else if (itemId === 'potion' && state.mode === 'battle') {
      const ally = state.battle.units.find(u => u.id === unitId && u.team === 'ally' && u.hp > 0);
      if (!ally || ally.hp >= ally.maxHp) { note(state, 'Выберите раненый отряд.', 'warning'); return false; }
      ally.hp = Math.min(ally.maxHp, ally.hp + 18);
    } else if (itemId === 'potion') {
      if (state.hero.health >= state.hero.maxHealth) { note(state, 'Здоровье уже полное.'); return false; }
      state.hero.health = Math.min(state.hero.maxHealth, state.hero.health + 25);
    } else return false;
    state.hero.inventory[itemId]--;
    note(state, `Использовано: ${ITEMS[itemId].name}.`, 'success');
    return true;
  }

  function startBattle(state, loc) {
    const enemy = ENCOUNTERS[loc.encounter];
    const allies = state.army.filter(stack => stack.hp > 0).map((stack, i) => ({
      id: `a${i}`, team: 'ally', kind: stack.kind, x: i === 0 ? 1 : 3, y: 4,
      hp: stack.hp, maxHp: stackCount(stack) * TROOPS[stack.kind].hp, moved: false, acted: false
    }));
    const enemies = enemy.troops.map(([kind, count], i) => ({
      id: `e${i}`, team: 'enemy', kind, x: i === 0 ? 1 : 3, y: 1,
      hp: TROOPS[kind].hp * count, maxHp: TROOPS[kind].hp * count, moved: false, acted: false
    }));
    state.battle = {
      locationId: loc.id, name: enemy.name, round: 1,
      selected: allies[0].id, cast: false, units: [...allies, ...enemies],
      obstacles: loc.type === 'shrine' ? [{ x: 2, y: 2 }] : []
    };
    state.mode = 'battle';
    note(state, `Начался бой: ${enemy.name}. Выберите отряд, затем цель.`, 'battle');
  }

  function battleUnitAt(state, x, y) {
    if (!state.battle) return null;
    return state.battle.units.find(u => u.hp > 0 && u.x === x && u.y === y) || null;
  }

  function battleUnit(state, id) { return state.battle && state.battle.units.find(u => u.id === id && u.hp > 0); }
  function distance(a, b) { return Math.abs(a.x - b.x) + Math.abs(a.y - b.y); }
  function inRange(attacker, target) { return distance(attacker, target) <= TROOPS[attacker.kind].range; }
  function blocked(state, x, y, exceptId) {
    return !insideBattle(x, y) || state.battle.obstacles.some(o => o.x === x && o.y === y) ||
      state.battle.units.some(u => u.hp > 0 && u.id !== exceptId && u.x === x && u.y === y);
  }
  function insideBattle(x, y) { return x >= 0 && x < BATTLE_W && y >= 0 && y < BATTLE_H; }

  function reachable(state, unitId) {
    const unit = battleUnit(state, unitId);
    if (!unit || unit.moved || unit.acted) return [];
    const paths = [{ x: unit.x, y: unit.y, cost: 0 }];
    const visited = new Set([`${unit.x},${unit.y}`]);
    for (let i = 0; i < paths.length; i++) {
      const here = paths[i];
      if (here.cost >= TROOPS[unit.kind].move) continue;
      for (const [dx, dy] of [[0, -1], [1, 0], [0, 1], [-1, 0]]) {
        const x = here.x + dx, y = here.y + dy, key = `${x},${y}`;
        if (visited.has(key) || blocked(state, x, y, unit.id)) continue;
        visited.add(key);
        paths.push({ x, y, cost: here.cost + 1 });
      }
    }
    return paths.slice(1);
  }

  function moveBattleUnit(state, unitId, x, y) {
    if (state.mode !== 'battle') return false;
    const unit = battleUnit(state, unitId);
    if (!unit || unit.team !== 'ally' || !reachable(state, unitId).some(p => p.x === x && p.y === y)) {
      note(state, 'Этот отряд не может сюда пройти.', 'warning'); return false;
    }
    unit.x = x; unit.y = y; unit.moved = true;
    note(state, `${TROOPS[unit.kind].name} переместились.`);
    return true;
  }

  function strike(state, attacker, target) {
    const troop = TROOPS[attacker.kind], victim = TROOPS[target.kind];
    const count = Math.ceil(attacker.hp / troop.hp);
    const attackBonus = attacker.team === 'ally' ? Math.floor(state.hero.attack / 2) + (state.hero.equipment.weapon ? 2 : 0) : 0;
    const defenseBonus = target.team === 'ally' ? Math.floor(state.hero.defense / 2) + (state.hero.equipment.armor ? 2 : 0) : 0;
    const damage = Math.max(1, Math.round((troop.attack + attackBonus) * (1 + Math.min(8, count - 1) * 0.24) - (victim.defense + defenseBonus) * 0.65));
    target.hp = Math.max(0, target.hp - damage);
    note(state, `${troop.name} атакуют ${victim.name.toLowerCase()}: −${damage} жизни.${target.hp ? '' : ' Отряд уничтожен!'}`, 'battle');
  }

  function checkBattleEnd(state) {
    if (!state.battle) return false;
    const allies = state.battle.units.some(u => u.team === 'ally' && u.hp > 0);
    const enemies = state.battle.units.some(u => u.team === 'enemy' && u.hp > 0);
    if (enemies && allies) return false;
    const loc = state.world.locations.find(l => l.id === state.battle.locationId);
    for (const stack of state.army) {
      const fighter = state.battle.units.find(u => u.team === 'ally' && u.kind === stack.kind);
      stack.hp = fighter ? fighter.hp : 0;
    }
    state.battle = null;
    if (enemies) {
      state.hero.gold = Math.max(0, state.hero.gold - Math.min(18, state.hero.gold));
      state.hero.health = Math.max(8, Math.floor(state.hero.maxHealth / 2));
      state.hero.x = CITY.x; state.hero.y = CITY.y;
      reveal(state, CITY.x, CITY.y);
      state.mode = 'town';
      note(state, 'Поражение. Вы вернулись в город. Гарнизон поможет начать заново.', 'warning');
    } else {
      const reward = ENCOUNTERS[loc.encounter];
      state.mode = 'world';
      loc.cleared = true;
      state.hero.gold += reward.gold;
      gainXp(state, reward.xp);
      note(state, `Победа! +${reward.xp} опыта, +${reward.gold} монет.`, 'success');
      if (loc.type === 'shrine') note(state, `${loc.name} восстановлена! Печати: ${relicCount(state)}/3.`, 'quest');
    }
    return true;
  }

  function attackBattleUnit(state, attackerId, targetId) {
    if (state.mode !== 'battle') return false;
    const attacker = battleUnit(state, attackerId), target = battleUnit(state, targetId);
    if (!attacker || !target || attacker.team !== 'ally' || target.team !== 'enemy' || attacker.acted || !inRange(attacker, target)) {
      note(state, 'Выберите доступную цель для атаки.', 'warning'); return false;
    }
    strike(state, attacker, target);
    attacker.acted = true; attacker.moved = true;
    checkBattleEnd(state);
    return true;
  }

  function castSpell(state, spell, targetId) {
    if (state.mode !== 'battle' || !['bolt', 'heal'].includes(spell)) return false;
    const target = battleUnit(state, targetId);
    const cost = spell === 'bolt' ? 6 : 5;
    if (state.battle.cast || state.hero.mana < cost) { note(state, 'Недостаточно маны или герой уже колдовал в этом раунде.', 'warning'); return false; }
    if (!target || (spell === 'bolt' ? target.team !== 'enemy' : target.team !== 'ally' || target.hp >= target.maxHp)) {
      note(state, 'Выберите подходящую цель заклинания.', 'warning'); return false;
    }
    state.hero.mana -= cost;
    state.battle.cast = true;
    if (spell === 'bolt') {
      const damage = 9 + state.hero.magic * 2;
      target.hp = Math.max(0, target.hp - damage);
      note(state, `Молния поражает ${TROOPS[target.kind].name.toLowerCase()}: −${damage} жизни!`, 'battle');
    } else {
      const restored = 12 + state.hero.magic * 2;
      target.hp = Math.min(target.maxHp, target.hp + restored);
      note(state, `Лечение восстанавливает ${restored} жизни.`, 'battle');
    }
    checkBattleEnd(state);
    return true;
  }

  function endTurn(state) {
    if (state.mode !== 'battle') return false;
    const battle = state.battle;
    const enemies = battle.units.filter(u => u.team === 'enemy' && u.hp > 0);
    for (const enemy of enemies) {
      const allies = battle.units.filter(u => u.team === 'ally' && u.hp > 0);
      if (!allies.length) break;
      let victim = allies.slice().sort((a, b) => distance(a, enemy) - distance(b, enemy) || a.hp - b.hp)[0];
      if (!inRange(enemy, victim)) {
        // Each enemy walks toward the closest reachable opponent; avoid occupied cells.
        for (let step = 0; step < TROOPS[enemy.kind].move; step++) {
          let best = null, bestDist = distance(enemy, victim);
          for (const [dx, dy] of [[0, 1], [-1, 0], [1, 0], [0, -1]]) {
            const x = enemy.x + dx, y = enemy.y + dy;
            const nextDist = Math.abs(x - victim.x) + Math.abs(y - victim.y);
            if (!blocked(state, x, y, enemy.id) && nextDist < bestDist) { best = { x, y }; bestDist = nextDist; }
          }
          if (!best) break;
          enemy.x = best.x; enemy.y = best.y;
          if (inRange(enemy, victim)) break;
        }
      }
      const inReach = battle.units.filter(u => u.team === 'ally' && u.hp > 0 && inRange(enemy, u));
      if (inReach.length) {
        victim = inReach.sort((a, b) => a.hp - b.hp)[0];
        strike(state, enemy, victim);
      }
    }
    if (checkBattleEnd(state)) return true;
    battle.round++;
    battle.cast = false;
    for (const unit of battle.units) if (unit.team === 'ally') { unit.moved = false; unit.acted = false; }
    note(state, `Раунд ${battle.round}. Ваш ход.`, 'battle');
    return true;
  }

  function flee(state) {
    if (state.mode !== 'battle') return false;
    for (const stack of state.army) stack.hp = 0;
    state.hero.xp = Math.max(0, state.hero.xp - 10);
    state.hero.health = Math.max(8, Math.floor(state.hero.maxHealth / 2));
    state.hero.x = CITY.x; state.hero.y = CITY.y;
    state.battle = null;
    state.mode = 'town';
    reveal(state, CITY.x, CITY.y);
    note(state, 'Вы сбежали с поля боя и потеряли армию. Гарнизон поможет восстановиться.', 'warning');
    return true;
  }

  function continueAfterEnding(state) {
    if (state.mode !== 'ending') return false;
    state.mode = 'town';
    return true;
  }

  // A save may come from a local file. Check the shape before rendering or mutating it,
  // and restore landmark metadata from our own campaign rather than trusting imported text.
  function loadGame(json) {
    let s;
    try { s = typeof json === 'string' ? JSON.parse(json) : json; }
    catch (_) { throw new Error('Файл сохранения повреждён.'); }
    const invalid = () => { throw new Error('Несовместимое или повреждённое сохранение.'); };
    if (!s || s.version !== VERSION || !['world', 'town', 'battle', 'ending'].includes(s.mode) ||
        !s.hero || !s.world || !Array.isArray(s.army) || !Array.isArray(s.log) ||
        !Number.isInteger(s.steps) || s.steps < 0 || typeof s.campaignWon !== 'boolean' ||
        !Number.isInteger(s.world.seed) || s.world.seed < 0 || s.world.seed > 0xffffffff ||
        !Array.isArray(s.world.terrain) || s.world.terrain.length !== SIZE * SIZE ||
        !Array.isArray(s.world.explored) || s.world.explored.length !== SIZE * SIZE ||
        !Array.isArray(s.world.locations) || s.world.locations.length !== LOCATION_DATA.length) invalid();
    const h = s.hero;
    if (!Number.isInteger(h.race) || !RACES[h.race] || typeof h.name !== 'string' ||
        !h.name.trim() || h.name.length > 24 ||
        !Number.isInteger(h.x) || !Number.isInteger(h.y) || !inside(h.x, h.y) ||
        !h.inventory || !h.equipment || !Number.isInteger(h.gold) || h.gold < 0 ||
        !Number.isInteger(h.level) || h.level < 1 || h.level > 100 ||
        !Number.isInteger(h.points) || h.points < 0 || h.points > 100 ||
        !['health', 'maxHealth', 'mana', 'maxMana', 'attack', 'defense', 'magic', 'leadership', 'xp'].every(k =>
          Number.isInteger(h[k]) && h[k] >= 0 && h[k] < 100000) ||
        h.maxHealth < 1 || h.maxMana < 1 || h.health > h.maxHealth || h.mana > h.maxMana ||
        !s.world.terrain.every(t => [2, 3, 4, 5, 6, 7].includes(t)) ||
        !s.world.explored.every(v => v === 0 || v === 1) ||
        !s.world.locations.every((l, i) => l && l.id === LOCATION_DATA[i].id && typeof l.cleared === 'boolean') ||
        s.army.length > 2 || !s.army.every(st => st && [RACES[h.race].guard, RACES[h.race].ranged].includes(st.kind) &&
          Number.isInteger(st.hp) && st.hp >= 0 && st.hp < 10000) ||
        new Set(s.army.map(st => st.kind)).size !== s.army.length ||
        !['potion', 'ether', 'sword', 'armor'].every(id => Number.isInteger(h.inventory[id]) && h.inventory[id] >= 0 && h.inventory[id] < 10000) ||
        !['weapon', 'armor'].every(slot => h.equipment[slot] === null ||
          (ITEMS[h.equipment[slot]]?.slot === slot && h.inventory[h.equipment[slot]] > 0)) ||
        s.log.length > 40 || !s.log.every(e => e && typeof e.text === 'string' && e.text.length < 500 &&
          typeof e.kind === 'string' && e.kind.length < 30)) invalid();
    // Imported files are not trusted world definitions. Only exploration and cleared
    // landmarks are persistent; reconstruct terrain and immutable metadata from the seed.
    const canonical = makeWorld(s.world.seed);
    s.world.terrain = canonical.terrain;
    s.world.locations = canonical.locations.map((loc, i) => ({ ...loc, cleared: s.world.locations[i].cleared }));
    if (!walkable(s.world.terrain[pos(h.x, h.y)]) ||
        (['town', 'ending'].includes(s.mode) && (h.x !== CITY.x || h.y !== CITY.y)) ||
        (s.campaignWon && relicCount(s) !== 3) ||
        (s.mode === 'ending' && !s.campaignWon)) invalid();
    if (typeof s.lastMessage !== 'string' || s.lastMessage.length >= 500) s.lastMessage = '';
    if (s.mode === 'battle') {
      const loc = s.world.locations.find(l => l.id === s.battle?.locationId);
      const b = s.battle;
      const enemy = loc && ENCOUNTERS[loc.encounter];
      if (!enemy || loc.cleared || h.x !== loc.x || h.y !== loc.y ||
          !Number.isInteger(b.round) || b.round < 1 || b.round > 1000 || typeof b.cast !== 'boolean' ||
          !Array.isArray(b.units)) throw new Error('Данные боя в сохранении повреждены.');
      const allies = s.army.filter(stack => stack.hp > 0);
      const lineup = [
        ...allies.map((stack, i) => ({ id: `a${i}`, team: 'ally', kind: stack.kind,
          maxHp: stackCount(stack) * TROOPS[stack.kind].hp })),
        ...enemy.troops.map(([kind, count], i) => ({ id: `e${i}`, team: 'enemy', kind,
          maxHp: count * TROOPS[kind].hp }))
      ];
      b.obstacles = loc.type === 'shrine' ? [{ x: 2, y: 2 }] : [];
      if (b.units.length !== lineup.length || !b.units.every((u, i) =>
        u && u.id === lineup[i].id && u.team === lineup[i].team &&
        u.kind === lineup[i].kind && u.maxHp === lineup[i].maxHp &&
        Number.isInteger(u.hp) && u.hp >= 0 && u.hp <= u.maxHp &&
        typeof u.moved === 'boolean' && typeof u.acted === 'boolean' &&
        Number.isInteger(u.x) && Number.isInteger(u.y) && insideBattle(u.x, u.y) &&
        !(u.hp > 0 && b.obstacles.some(o => o.x === u.x && o.y === u.y))) ||
        b.units.some((u, i) => u.hp > 0 && b.units.some((other, j) => j > i && other.hp > 0 && u.x === other.x && u.y === other.y)) ||
        !b.units.some(u => u.team === 'ally' && u.hp > 0) ||
        !b.units.some(u => u.team === 'enemy' && u.hp > 0)) {
        throw new Error('Данные боя в сохранении повреждены.');
      }
      b.name = enemy.name;
      if (!b.units.some(u => u.id === b.selected && u.team === 'ally' && u.hp > 0)) {
        b.selected = b.units.find(u => u.team === 'ally' && u.hp > 0).id;
      }
    } else s.battle = null;
    return s;
  }

  return {
    VERSION, SIZE, BATTLE_W, BATTLE_H, TERRAIN, CITY, RACES, TROOPS, ITEMS, ENCOUNTERS, STORAGE_KEY,
    createGame, loadGame, move, interact, leaveTown, continueAfterEnding, recruit, buy, rest, equip, useItem,
    levelStat, locationAt, findPath, relicCount, capacity, armySize, stackCount, xpNeeded,
    battleUnitAt, battleUnit, reachable, inRange, moveBattleUnit, attackBattleUnit, castSpell, endTurn, flee,
    inside, walkable, hash
  };
});
