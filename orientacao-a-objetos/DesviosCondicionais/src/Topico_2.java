import java.util.Scanner;

public class Topico_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade < 18) {
			System.out.println("Você é menor de idade!");
		} else {
			System.out.println("Você é maior de idade!");
		}
		
		int dia = 1;
		
		switch (dia) {
		case 1: 
			System.out.println("Domingo");
		case 2: 
			System.out.println("Segunda-feira");
		case 3: 
			System.out.println("Terça-feira");
		case 4: 
			System.out.println("Quarta-feira");
		case 5: 
			System.out.println("Quinta-feira");
		case 6: 
			System.out.println("Sexta-feira");
		case 7: 
			System.out.println("Sábado");
		default:
			System.out.println("Dia inválido!");
		}
		
		teclado.close();
	}

}
