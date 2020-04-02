package br.ufc.quixada.model;

public class Partida {
	private int idPartida;

	public Partida() {
		this.idPartida = idPartida;
	}
	public void gerarResultado(Time a,Time b) {
		System.out.println(a.getNome() + " 3 x 1 " + b.getNome());
	}

}
