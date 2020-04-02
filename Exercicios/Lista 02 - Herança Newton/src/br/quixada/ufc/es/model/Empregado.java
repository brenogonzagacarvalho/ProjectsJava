	package br.quixada.ufc.es.model;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
	
	}
	
	public Empregado(String nome, String endereco, String telefone,int codigoSetor, double salarioBase, double imposto) {
		super(nome,endereco,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public double calcularSalario() {
		double calcularSalario = (salarioBase - imposto);
		return calcularSalario;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
