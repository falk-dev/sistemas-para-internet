/*
 *
 * 1) Gerar 100 número aleatórios e contar quantas vezes ele aparece
 * Exemplo:
 *    1 - 5 vezes
 *    6 - 3 vezes
 *    35 - 1 vez
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 15/05/2025
 * 
 */

const map = new Map();

for (let i = 0; i < 100; i++) {
  let num = Math.floor(Math.random() * 101);

  isNaN(map.get(num))
    ? map.set(num, 1)
    : map.set(num, map.get(num) + 1);
}

map.forEach((valor, chave) => {
  console.log(`${chave} = ${valor} vez(es)`);
});