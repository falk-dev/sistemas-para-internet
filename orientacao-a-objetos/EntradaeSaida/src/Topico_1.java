import java.util.Scanner;

public class Topico_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite o ano do seu nascimento: ");
		int ano_nascimento = teclado.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int ano_atual = teclado.nextInt();
		
		int idade = ano_atual - ano_nascimento;
		
		System.out.println("Hey, " + nome + "! Você tem " + idade + " anos!");
		
		
		teclado.close();
	}

}
