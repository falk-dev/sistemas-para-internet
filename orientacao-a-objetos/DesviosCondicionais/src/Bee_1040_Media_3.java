import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee_1040_Media_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1 = teclado.nextDouble();
		double n2 = teclado.nextDouble();
		double n3 = teclado.nextDouble();
		double n4 = teclado.nextDouble();
		
		double media = ((2 * n1) + (3 * n2) + (4 * n3) + (1 * n4)) / (2.0 + 3.0 + 4.0 + 1.0);
		
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			
			double nota_exame = teclado.nextDouble();
			
			System.out.println("Nota do exame: " + df.format(nota_exame));
			media = (media + nota_exame) / 2;
			
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.println("Media final: " + df.format(media));
		}
		
		teclado.close();

	}

}
