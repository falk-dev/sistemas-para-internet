
public class Aplicacao {

	public static void main(String[] args) {
		Porta porta1 = new Porta();
		Fechadura fechadura1 = new Fechadura();
		fechadura1.chave = "1234";
		porta1.altura = 2.1;
		porta1.largura = 0.9;
		porta1.espessura = 0.06;
		porta1.material = "Madeira";
		porta1.cor = "Branca";
		porta1.fechadura = fechadura1;
		System.out.println(porta1.getRelatorio());
		
		Porta porta2 = new Porta();
		porta2.altura = 2.1;
		porta2.largura = 0.9;
		porta2.espessura = 0.06;
		porta2.material = "Madeira";
		porta2.cor = "Branca";
		// porta2.fechadura = "abcd";
		System.out.println(porta1 == porta2);
		//porta1 = porta2;
		System.out.println(porta1 == porta2);

		if (porta1.abrir()) {
			System.out.println("Porta aberta.");
		} else {
			System.out.println("Não foi possível abrir a porta.");
		}
		System.out.println(porta1.fechadura.chave);
		if(porta1.destrancar("1234")) {
			System.out.println("Porta destrancada.");
		} else {
			System.out.println("Não foi possível destrancar a porta.");
		}
		
		if (porta1.abrir()) {
			System.out.println("Porta aberta.");
		} else {
			System.out.println("Não foi possível abrir a porta.");
		}
		
	}

}
