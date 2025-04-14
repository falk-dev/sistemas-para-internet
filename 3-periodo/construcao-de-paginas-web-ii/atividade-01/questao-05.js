/*
 *
 * 5) Faça um programa que leia 1 palavra e devolva a palavra invertida.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let palavra = prompt(`Digite uma palavra: `);
let palavra_reverse = ``;

for (let i = palavra.length - 1; i >= 0; i--) {
  palavra_reverse += palavra[i];
}

console.log(`Palavra invertida: ${palavra_reverse}`)