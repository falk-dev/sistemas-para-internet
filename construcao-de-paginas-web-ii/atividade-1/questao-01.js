/*
 *
 * 1) Faça um programa onde o usuário digite um número e o programa diz se é par ou ímpar.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let numero = prompt(`Digite um número: `);

if (numero % 2 === 0) {
  console.log(`${numero} é par.`);
} else {
  console.log(`${numero} é ímpar.`);
}