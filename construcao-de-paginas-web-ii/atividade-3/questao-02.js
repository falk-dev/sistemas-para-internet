/*
 *
 * 2) Gerar 100 número aleatórios.
 * Exemplo: 2 9 8 5 2 9 31
 * Saída: 2 9 8 5 31
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 15/05/2025
 * 
 */

const set = new Set();

for (let i = 0; i < 100; i++) {
  let num = Math.floor(Math.random() * 101);
  set.add(num);
}

set.forEach(function (valor) {
  console.log(valor);
});