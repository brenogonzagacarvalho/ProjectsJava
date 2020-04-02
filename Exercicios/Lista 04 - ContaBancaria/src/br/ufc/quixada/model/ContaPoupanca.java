package br.ufc.quixada.model;

import br.ufc.quixada.exec.Imprimivel;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
	private double taxaDeOperacao;
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(int numConta, double saldo,int taxaDeOperacao) {
		super(numConta, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	@Override
	public void depositar(double valor) {
		super.setSaldo((super.getSaldo()+valor));
		super.setSaldo(super.getSaldo()- this.taxaDeOperacao);
		
	}
	@Override
	public void sacar(double valor) {
		if(super.getSaldo() >= valor && valor > 0) {
			this.setSaldo((this.getSaldo() - (valor+this.taxaDeOperacao)));
		}else if (this.getSaldo() < valor && valor > 0) {
			System.out.println("Saldo Insuficiente!");
		}else {
			System.out.println("Valor Invalido!");
		}
	}
	@Override
	public String mostrarDados() {
		
	String retorno = "ContaPoupanca [Numero da Conta = "+getNumConta()+" "+" Taxa De Operacao = "+this.taxaDeOperacao+" O Saldo é = "+getSaldo();
		return retorno;
	}
	
	@Override
	public void transferir(double valor, ContaBancaria cb) {
		if(cb instanceof ContaPoupanca) {
			if(this.getSaldo() >= valor) {
				this.sacar(valor);
				((ContaPoupanca)cb).depositar(valor);
			}else{
				System.out.println("Nao é possivel transferir saldo insufiente");
			}
		}
		if(cb instanceof ContaCorrente) {
			if(this.getSaldo() >= valor) {
				this.sacar(valor);
				((ContaCorrente)cb).depositar(valor);
			}else{
				System.out.println("Nao é possivel transferir saldo insufiente");
			}
		}
	}
			
}
