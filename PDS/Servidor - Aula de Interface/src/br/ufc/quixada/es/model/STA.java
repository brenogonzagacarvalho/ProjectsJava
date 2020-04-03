package br.ufc.quixada.es.model;

public class STA extends Servidor {

	public STA(String nome, String cpf, double salario) {
		super(nome, cpf, salario);	
	}

	@Override
	public double getBonificacao() {
		
		return super.getSalario() * 0.1;
	}
}
