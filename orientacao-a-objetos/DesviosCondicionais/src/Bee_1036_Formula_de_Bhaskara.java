import java.util.Scanner;

public class Bee_1036_Formula_de_Bhaskara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double delta = (b * b) - 4 * a * c;
				
		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else if (delta == 0) {
			double bhaskara = -b / (2 * a);
			System.out.printf("R1 = %.5f\n", bhaskara);
		} else {
			double bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
			double bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\n", bhaskara1);
			System.out.printf("R2 = %.5f\n", bhaskara2);
		}
		
		teclado.close();
	}

}
