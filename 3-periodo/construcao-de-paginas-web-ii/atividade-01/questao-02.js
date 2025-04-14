/*
 *
 * 2) Faça um programa onde o usuário digite sua altura e peso e o programa calcula o seu IMC.
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 14/04/2025
 * 
 */

let altura = prompt(`Digite a altura (m): `);
let peso = prompt(`Digite o peso (kg): `);

let imc = (peso / (altura * altura)).toFixed(1);

console.log(`O seu imc é ${imc}`);

if (imc < 18.5) {
  console.log(`Diagnóstico: Magreza`);
} else if (imc >= 18.5 && imc < 25) {
  console.log(`Diagnóstico: Saudável`);
} else if (imc >= 25 && imc < 30) {
  console.log(`Diagnóstico: Sobrepeso`);
} else if (imc >= 30 && imc < 35) {
  console.log(`Diagnóstico: Obesidade Grau I`);
} else if (imc >= 35 && imc < 40) {
  console.log(`Diagnóstico: Obesidade Grau II (severa)`);
} else {
  console.log(`Diagnóstico: Obesidade Grau III (mórbida)`)
}