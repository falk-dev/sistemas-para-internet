import java.util.HashMap;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String, Integer> idades = new HashMap<>();
		
		System.out.printf("Digite a quantidade de elementos que você deseja inserir no HashMap: ");
		int qtd = teclado.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("\n");
			teclado.nextLine();
			
			System.out.print("Digite o " + (i + 1) + "º nome: ");
			String nome = teclado.nextLine();
			
			System.out.printf("Digite a " + (i + 1) + "ª idade: ");
			int idade = teclado.nextInt();
					
			idades.put(nome, idade);
		}
		
		System.out.printf("\n");
		
		for (String i : idades.keySet()) {
			System.out.println(i + " -> " + idades.get(i));
		}
		
		teclado.close();
	}

}
