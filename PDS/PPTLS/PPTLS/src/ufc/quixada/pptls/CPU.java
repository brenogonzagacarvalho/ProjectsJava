package ufc.quixada.pptls;

import java.util.Random;

public class CPU {
	private String jogadas[];
	
	public CPU() {
		jogadas = new String[] {"pedra", "papel", "tesoura", "lagarto", "spock"};
	}
	
	public String jogar() {
		String saida;
		Random rand = new Random();
		int aleatorio = rand.nextInt(5);
		saida = jogadas[aleatorio];
		System.out.println("CPU: " + saida);
		return saida;
		
	}

	
}
