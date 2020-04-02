import java.util.ArrayList;

public class Partida {
	private Palavra palavra;
	int vidas;
	ArrayList<Character>PalaCertas;
	ArrayList<Character>PalaErradas;
	
	public Partida(Palavra palavra, int vidas) {
		this.palavra = palavra;
		this.vidas = vidas;
		this.PalaCertas = new ArrayList<>();
		this.PalaErradas = new ArrayList<>();
	}
		
	public char jogar(char letra){
		return letra;
	}
	}
