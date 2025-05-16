/*
 *
 * 3) Você ganhou um cachorro e quer decidir o nome dele. Faça um programa
 * que o usuário digite o nome e o sistema contabiliza quantas vezes
 * ele foi escolhido.
 * Exemplo:
 *    Toto - 3 votos
 *    Kaka - 5 votos
 *
 * Discente: Mychelle Ketlen Falk Rocha
 * Data: 15/05/2025
 * 
 */

const map = new Map();
let resp = 'S'

while (resp == 'S' || resp == 's') {
  let nome = prompt('Digite o nome do cachorro: ');
  isNaN(map.get(nome))
    ? map.set(nome, 1)
    : map.set(nome, map.get(nome) + 1);

  resp = prompt('Deseja adicionar mais um nome? [S/N]: ');
}

map.forEach((valor, chave) => {
  console.log(`${chave} - ${valor} voto(s)`);
});