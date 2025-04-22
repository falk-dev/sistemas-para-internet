import java.util.Scanner;

public class Bee_1005_Media_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		
		double media = ((3.5 * nota1 + 7.5 * nota2) / (3.5 + 7.5));
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		teclado.close();

	}

}