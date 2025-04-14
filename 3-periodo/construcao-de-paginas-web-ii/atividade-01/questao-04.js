/*
 *
 * 4) Faça um programa onde o usuário digite 4 números e o programa mostrar o maior deles
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let maior = Number.MIN_SAFE_INTEGER;

for (let i = 1; i <= 4; i++) {
  let numero = parseInt(prompt(`Digite o ${i}º número: `));
  if (numero > maior) {
    maior = numero;
  }
}

console.log(`O maior número que você digitou é ${maior}.`);