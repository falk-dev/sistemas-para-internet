import java.util.Scanner;

public class Bee_1010_Calculo_Simples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int codigo_peca_1 = teclado.nextInt();
		int num_pecas_1 = teclado.nextInt();
		double valor_peca_1 = teclado.nextDouble();
		
		int codigo_peca_2 = teclado.nextInt();
		int num_pecas_2 = teclado.nextInt();
		double valor_peca_2 = teclado.nextDouble();
		
		double valor_a_pagar = num_pecas_1 * valor_peca_1 + num_pecas_2 * valor_peca_2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_a_pagar);
		
		teclado.close();
	}

}
