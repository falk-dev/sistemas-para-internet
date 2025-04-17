/*
 *
 * 3) Faça um programa onde o usuário digite 4 notas e o programa calcula a média.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let notas = 0;

for (let i = 1; i <= 4; i++) {
  let nota = parseInt(prompt(`Digite a ${i}ª nota: `));
  notas += nota;
}
let media = (notas / 4).toFixed(1);

console.log(`A sua média é ${notas}`);
console.log(`A sua média é ${media}`);