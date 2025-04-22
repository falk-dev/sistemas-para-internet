import java.util.Scanner;

public class Bee_1001_Extremamente_Basico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("X = " + soma);
		
		teclado.close();
	}

}