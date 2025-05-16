/*
 *
 * 5) Faça um programa que crie um array com 50 números aleatórios de 0 a 100 e mostre o menor número.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 05/05/2025
 * 
 */

const array = [];

for (let i = 0; i < 50; i++) {
  array.push(Math.floor(Math.random() * 101));
}

let menor = array[0];

for (let i = 0; i < 50; i++) {
  if (array[i] < menor) {
    menor = array[i];
  }
}

console.log(`O maior número é ${menor}.`);
