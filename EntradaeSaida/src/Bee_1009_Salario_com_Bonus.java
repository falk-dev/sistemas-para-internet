import java.util.Scanner;

public class Bee_1009_Salario_com_Bonus {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome = teclado.nextLine();
		double salario_fixo = teclado.nextDouble();
		double total_vendas = teclado.nextDouble();
		
		double salario = salario_fixo + (total_vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", salario);
		
		teclado.close();

	}

}
