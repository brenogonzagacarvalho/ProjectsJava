package br.ufc.quixada.es.model;

public class Brinquedo {
	private String nome;
	private double velocidade;
	private double aceleracao;
	
	public Brinquedo() {
		
	}
	public void Brinquedo(String nome,double velocidade,double aceleracao) {
		this.nome = nome;
		this.velocidade = velocidade;
		this.aceleracao = aceleracao;
	}
	public void mover() {
		System.out.println("O Brinquedo esta se movendo!");
	}
	public void velocidade (int vel) {
		
	}
	public void velocidade(double vel) {
		
	}
	public void velocidade(float vel, double ac) {
		
	}
}
