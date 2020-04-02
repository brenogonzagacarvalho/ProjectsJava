package br.ufc.quixada.model;

public abstract class ContaBancaria {
	private int numConta;
	private double saldo;
	
	public ContaBancaria() {
		super();
	}
	public ContaBancaria(int numConta, double saldo) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	public abstract void transferir(double valor, ContaBancaria cb);
}
