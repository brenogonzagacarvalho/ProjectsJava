package br.quixada.ufc.es.model;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		super();
		}
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto,double valorVendas) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
			this.valorVendas = valorVendas;
	}
	public double calcularSalario() {
		double salarioTotal = (super.calcularSalario()) + valorVendas + (valorVendas * comissao);
		return salarioTotal;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
}
