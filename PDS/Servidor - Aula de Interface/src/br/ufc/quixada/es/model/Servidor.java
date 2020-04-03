package br.ufc.quixada.es.model;

public abstract class  Servidor {
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Servidor(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	//Assinatura dos metodos
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacao();
	
}
