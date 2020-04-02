package br.ufc.quixada.exec;

import br.ufc.quixada.model.ContaBancaria;
import br.ufc.quixada.model.ContaCorrente;
import br.ufc.quixada.model.ContaPoupanca;
import br.ufc.quixada.model.Relatorio;

public class Executavel {

	public static void main(String[] args) {
		ContaBancaria cp = new ContaPoupanca(122,150.0,2);
		ContaBancaria cc = new ContaCorrente(100,250.0,400.0);
		Relatorio relatorio = new Relatorio();
		
		cp.sacar(250);
		cc.sacar(300);
		System.out.println(relatorio.gerarRelatorio((Imprimivel) cc));
		System.out.println(relatorio.gerarRelatorio((Imprimivel)cp));
		
	}

}
