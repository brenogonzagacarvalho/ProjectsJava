package br.ufc.quixada.es.model;

public class Professor extends Servidor {
	private int horasMinistradas;
	public Professor(String nome, String cpf, double salario, int horasMinistradas) {
		super(nome, cpf, salario);
		this.horasMinistradas = horasMinistradas;
	}
	@Override
	public double getBonificacao() {
		return this.horasMinistradas;
	}
}
