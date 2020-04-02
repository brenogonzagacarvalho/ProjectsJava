package br.ufc.quixada.model;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.ufc.quixada.exec.Imprimivel;

public class Banco implements Imprimivel{
	ArrayList <ContaBancaria> conta = new ArrayList<>();
	Relatorio r = new Relatorio();
		
	public ArrayList<ContaBancaria> getConta() {
		return conta;
	}
	public void setConta(ArrayList<ContaBancaria> conta) {
		this.conta = conta;
	}
	public void adicionarConta(ContaBancaria cb) {
		conta.add(cb);
	}
	public ContaBancaria buscarConta(int NumConta) {
		for(int i=0;i<conta.size();i++) {
			if(conta.get(i).getNumConta() == NumConta) {
				if(conta.get(i) instanceof ContaPoupanca) {
					ContaBancaria cb = (ContaPoupanca) conta.get(i);
					System.out.println("Sua conta esta aqui");
					System.out.println(((ContaPoupanca)cb).mostrarDados());
					return cb;
				}
				else{
					ContaBancaria cb = (ContaCorrente) conta.get(i);
					System.out.println("Sua conta esta aqui");
					System.out.println(((ContaCorrente)cb).mostrarDados());
					return cb;
				}
			}
		}
		return null;
	}
	public boolean removerConta(int NumConta) {
		for(int i=0;i<conta.size();i++) {
			if(conta.get(i).getNumConta() == NumConta) {
				conta.remove(i);
				System.out.println("Sua Conta Foi Removida!");
				return true;
			}
		}System.out.println("A conta nao existe !");
		return false;
	}

	@Override
	public String mostrarDados() {
		String retorno = "Banco [conta=" + this.conta + "]";
		return retorno;
	}
	public void gerarRelatorio(){
		for (ContaBancaria cb: conta) {
			if(cb instanceof ContaPoupanca) {
				Imprimivel conta = (ContaPoupanca)cb;
				Relatorio r = new Relatorio();
				System.out.println(r.gerarRelatorio(conta));
			}else {
				Imprimivel conta = (ContaCorrente)cb;
				Relatorio r = new Relatorio();
				System.out.println(r.gerarRelatorio(conta));
			}
		}
	}
}