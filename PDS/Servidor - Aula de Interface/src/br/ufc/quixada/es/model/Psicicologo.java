package br.ufc.quixada.es.model;

public class Psicicologo extends Servidor {
	private int consultasFeitas;

	public Psicicologo(String nome, String cpf, double salario, int consultasFeitas) {
		super(nome, cpf, salario);
		this.consultasFeitas = consultasFeitas;
	}
	public double getBonificacao() {
		return this.consultasFeitas;
	}
}
