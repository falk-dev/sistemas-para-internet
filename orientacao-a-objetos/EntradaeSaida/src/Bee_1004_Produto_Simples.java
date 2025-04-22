import java.util.Scanner;

public class Bee_1004_Produto_Simples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		
		int prod = num1 * num2;
		
		System.out.println("PROD = " + prod);
		
		teclado.close();

	}

}