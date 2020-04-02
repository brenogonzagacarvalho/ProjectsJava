package br.quixada.ufc.es.model;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(){
		super();
	}
	public Fornecedor(double valorCredito, double valorDivida,String nome,String endereco,String telefone) {
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public double obterSaldo(double obterSaldo){
		obterSaldo = (valorCredito - valorDivida);
		return obterSaldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}

