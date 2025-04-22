import java.util.Scanner;

public class Bee_1002_Area_do_Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = teclado.nextDouble();
		
		double area = n * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		teclado.close();
	}

}