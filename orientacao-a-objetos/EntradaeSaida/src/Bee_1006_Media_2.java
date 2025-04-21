import java.util.Scanner;

public class Bee_1006_Media_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		
		double media = ((2 * nota1 + 3 * nota2 + 5 * nota3) / (2 + 3 + 5));
		
		System.out.printf("MEDIA = %.1f\n", media);
		
		teclado.close();
	}

}