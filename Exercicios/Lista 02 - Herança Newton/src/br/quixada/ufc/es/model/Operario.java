package br.quixada.ufc.es.model;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,double imposto, double valorProducao,
			double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.comissao = comissao;
		this.valorProducao = valorProducao;
	}
	public Operario() {
		super();
	}

	public double calcularSalario() {
		double salarioFinal = super.calcularSalario() + (valorProducao * comissao);
		return salarioFinal;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
