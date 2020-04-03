package ufc.quixada.pptls;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();

		jogo.msgBemVindo();
		while(!jogo.getSair()) {
			jogo.mostrarInstrucoes();
			jogo.vencedorRodada();
			jogo.mostrarPlacar();
		}
	}

}
