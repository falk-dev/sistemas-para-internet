import java.util.Scanner;

public class Bee_1007_Diferenca {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		
		int dif = a * b - c * d;
		
		System.out.println("DIFERENCA = " + dif);
		
		teclado.close();
	}

}