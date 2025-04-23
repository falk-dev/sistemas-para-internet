import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Topico_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Vetores
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}
		
		System.out.printf("Imprimindo com for: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(vetor[i] + " ");
		}
		
		System.out.printf("\nImprimindo com for-each: ");
		for (int i : vetor) {
			System.out.printf(i + " ");
		}
		
		System.out.println("\n\n-----------\n");
		
		// Arrays
		ArrayList<String> vetor_nomes = new ArrayList<>();
		
		vetor_nomes.add("Ana");
		vetor_nomes.add("Carlos");
		vetor_nomes.add("João");
		
		for (String i : vetor_nomes) {
			System.out.println(i);
		}
		
		System.out.println(vetor_nomes.get(1) + "\n");
		vetor_nomes.add(3, "Mychelle");
		
		for (String i : vetor_nomes) {
			System.out.println(i);
		}
		
		System.out.println("\n-----------\n");
		
		// HashMap
		HashMap<String, Integer> idades = new HashMap<> ();
		
		idades.put("Mychelle", 21);
		idades.put("Luís", 24);
		idades.put("Samuel", 21);
		
		System.out.println("Idade de Mychelle: " + idades.get("Mychelle"));
		
		System.out.printf("\nImprimindo os valores com for-each: ");
		for (int i : idades.values()) {
			System.out.printf(i + " ");
		}
				
		System.out.printf("\n\nImprimindo as chaves com for-each: ");
		for (String i : idades.keySet()) {
			System.out.printf(i + " ");
		}
		
		System.out.println("\n\nImprimindo chaves e valores com for-each: ");
		for (String i : idades.keySet()) {
			System.out.println(i + " -> " + idades.get(i));
		}
		
		teclado.close();
	}
}
