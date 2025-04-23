import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o " + (i + 1) + "º elemento: ");
			vetor[i] = teclado.nextInt();
			soma += vetor[i];
		}
		
		double media = (double)soma / (double)vetor.length;
		
		System.out.println("A média dos elementos que você digitou é " + media);
		
		teclado.close();
	}

}
