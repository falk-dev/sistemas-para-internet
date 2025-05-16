
public class Porta {
	double altura;
	double largura;
	double espessura;
	String material;
	String cor;
	Fechadura fechadura;
	boolean estaFechado = true;
	boolean estaTrancado = true;
	
	public boolean abrir() {
		if(!estaTrancado) {
			estaFechado = false;
			return true;
		}
		
		return false;
	}
	
	public void fechar() {
		estaFechado = true;
	}
	
	public boolean destrancar(String chave) {
		if (chave.equals(fechadura.chave) || !estaTrancado ) {
			estaTrancado = false;
			return true;
		}
		
		return false;
	}
	
	public boolean trancar(String chave) {
		if(chave.equals("1234")) {
			fechar();
			return true;
		}
		
		return false;
	}
	
	public String getRelatorio() {
		String relatorio = "Altura: " + altura;
		relatorio += "\nLargura: " + largura;
		relatorio += "\nEspessura: " + espessura;
		relatorio += "\nMaterial: " + material;
		relatorio += "\nCor: " + cor;
		relatorio += "\nFechadura: " + fechadura;
		
		return relatorio;
	}
}
