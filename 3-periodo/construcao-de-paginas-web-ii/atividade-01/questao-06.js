/*
 *
 * 6) Faça um programa que leia uma frase e uma palavra. O programa deve dizer se a palavra existe na frase. 
 * O programa deve considerar as diferenças de caixa alta e baixa, por exemplo: "Casa" é diferente de "casa"
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let frase = prompt(`Digite uma frase: `);
let palavra = prompt(`Digite a palavra que deseja encontrar: `);
let resp = frase.indexOf(palavra);

if (resp === -1) {
  console.log(`A palavra '${palavra}' não foi encontrada na frase '${frase}'.`)
} else {
  console.log(`A palavra '${palavra}' foi encontrada.`)
}