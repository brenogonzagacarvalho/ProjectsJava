package br.ufc.quixada.model;

public class Time {
	private String nome;
	private Jogador[] jogadores;
	private int contador = 0;
	
	public Time(String nome) {
		this.jogadores = new Jogador[12];
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Jogador[] getJogadores() {
		return jogadores;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	public Time() {
		this.jogadores = new Jogador[12];
		this.nome = nome;
	}
	public void addJogador(Jogador a) {
		this.jogadores[contador] = a;
		contador++;
	}
	
		
}
