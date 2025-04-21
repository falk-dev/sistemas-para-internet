import java.util.Scanner;

public class Bee_1008_Salário {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int id_funcionario = teclado.nextInt();
		int numero_horas = teclado.nextInt();
		double valor_hora = teclado.nextDouble();
		
		double salario = numero_horas * valor_hora;
		
		System.out.println("NUMBER = " + id_funcionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		teclado.close();

	}

}
