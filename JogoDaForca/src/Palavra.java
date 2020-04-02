
public class Palavra {
	private String texto ; 
	private int tamanho; 
	
		
	public Palavra(String tex) {
		this.texto = tex;
		this.tamanho = texto.length();
	}

	public boolean validar(char letra) {
		for (int i=0; i < tamanho; i++) {
			if (texto.charAt(i) == letra) {
				return true;
			}	
		}
 		return false;	
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}

