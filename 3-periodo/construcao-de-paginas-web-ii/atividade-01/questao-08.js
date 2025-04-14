/*
 *
 * 8) Faça um programa que crie um array com 50 números aleatórios de 0 a 100 e calcule a média dos elementos.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let array = [];

for (let i = 0; i < 50; i++) {
  array.push(Math.floor(Math.random() * 101));
}

let media = 0;

for (let i = 0; i < 50; i++) {
  media += parseInt(array[i]);
}

media /= 50;

console.log(`A média dos números ${media}.`);