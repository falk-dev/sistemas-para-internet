import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mychelle");
		nomes.add("Luís");
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Leandro");
		
		System.out.printf("Nomes na lita: ");
		for (String i : nomes) {
			System.out.printf(i + " ");
		}
		
		System.out.println();
		
		boolean existe = nomes.contains("Marcia");
		
		if (existe) {
			System.out.println("Marcia está na lista!");
		} else {
			System.out.println("Marcia não está na lista.");
		}
		
		teclado.close();
	}

}
