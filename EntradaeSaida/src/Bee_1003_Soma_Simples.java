import java.util.Scanner;

public class Bee_1003_Soma_Simples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		
		teclado.close();
	}

}
