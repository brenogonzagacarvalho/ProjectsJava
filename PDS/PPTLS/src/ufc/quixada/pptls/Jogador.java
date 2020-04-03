package ufc.quixada.pptls;

import java.util.Scanner;

public class Jogador {
	private Scanner entrada;

	public String jogar() {
		System.out.print("Jogador: ");
		entrada = new Scanner(System.in);
		return entrada.next();
	 
	}

}