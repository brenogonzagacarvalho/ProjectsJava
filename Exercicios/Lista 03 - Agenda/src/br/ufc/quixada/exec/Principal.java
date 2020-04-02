package br.ufc.quixada.exec;

import br.ufc.quixada.model.Agenda;
import br.ufc.quixada.model.Pessoa;
import br.ufc.quixada.model.PessoaFisica;
import br.ufc.quixada.model.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Agenda contatos = new Agenda();
		
		Pessoa j1 = new PessoaJuridica("maricon","UFC","breno123@gmail.com","23/11/1555","solteiro",19874512);
		Pessoa j2 = new PessoaJuridica("joao","UFC","breno123@gmail.com","23/11/1555","solteiro",17895127);
		Pessoa j3 = new PessoaJuridica("tiago","UFC","breno123@gmail.com","23/11/1555","solteiro",14567894);

		Pessoa f1 = new PessoaFisica("el francisco","UFC","breno123@gmail.com",123456789,"23/11/1555","solteiro");
		Pessoa f2 = new PessoaFisica("Weydla", "Quixada","weydlaalves23@gmail.com", 133456789,"28/02/1991","Solteiro");
		contatos.addLista(j1);
		contatos.addLista(j3);
		contatos.addLista(j2);
		contatos.addLista(f1);
		contatos.addLista(f2);
		
		contatos.ordenarLista();
		for (Pessoa p : contatos.getListaDeContatos()) {
			System.out.println(p.toString());
		}
	}

}
