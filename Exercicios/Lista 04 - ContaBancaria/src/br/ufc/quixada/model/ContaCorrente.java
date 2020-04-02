package br.ufc.quixada.model;

import br.ufc.quixada.exec.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
	private double limite;
	
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(int numConta, double saldo,double limite) {
		super(numConta, saldo);
		this.limite = 400;
	}
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public void depositar(double valor) {
		super.setSaldo((super.getSaldo()+valor));
		super.setSaldo(super.getSaldo());
		
	}
	@Override
	public void sacar(double valor) {
		if(this.getSaldo() > valor &&  valor > 0) {
			this.setSaldo((this.getSaldo()- valor));
		}
		else if(super.getSaldo() <= valor && valor <= this.limite )  {
			this.setSaldo(this.getSaldo() - valor);
			
		}else
			System.out.println("Saldo Insuficiente!");
		}
		
	
	@Override
	public String mostrarDados() {
		
		String retorno = "ContaCorrente [Numero da Conta = "+getNumConta()+" "+" O limite é de = "+this.limite+" O Saldo é = "+getSaldo();
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