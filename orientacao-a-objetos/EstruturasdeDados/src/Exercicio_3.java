import java.util.HashMap;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String, Integer> idades = new HashMap<>();
		
		idades.put("Mychelle", 21);
		idades.put("Tonhão", 24);
		idades.put("Mario", 58);
		idades.put("Marfisa", 52);
		
		for (String i : idades.keySet()) {
			System.out.println(i + " -> " + idades.get(i));
		}
		
		teclado.close();
	}

}
