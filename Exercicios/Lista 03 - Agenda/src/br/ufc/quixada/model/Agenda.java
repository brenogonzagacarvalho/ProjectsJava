package br.ufc.quixada.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Pessoa> ListaDeContatos = new ArrayList<>();
	private List<PessoaFisica> AuxF = new ArrayList<>();
	private List<PessoaJuridica> AuxJ = new ArrayList<>();
	
	public List<Pessoa> getListaDeContatos() {
		return ListaDeContatos;
	}
	public void setListaDeContatos(List<Pessoa> listaDeContatos) {
		ListaDeContatos = listaDeContatos;
	}
	public void addLista(Pessoa p) {
		ListaDeContatos.add(p);
		
	}
	public void removerPorNome(String nome) {
		for(int i=0;i<ListaDeContatos.size();i++) {
			if(ListaDeContatos.get(i).getNome().equals(nome)) {
				ListaDeContatos.remove(i);
				break;
			}	
		}System.out.println("Contato nao esta na lista!");
	}
	 public void removerPorCPF(int cpf) {
		for(int i=0;i<ListaDeContatos.size();i++) {
			if(ListaDeContatos.get(i) instanceof PessoaFisica){
				PessoaFisica pf = (PessoaFisica) ListaDeContatos.get(i);
				
				if(pf.getCpf() == cpf) {					
					ListaDeContatos.remove(i);
					break;
				}	
			}System.out.println("Contato nao esta na lista!");	
		}
	}
	 public void removerPorCnpj(int cnpj) {
		for(int i=0;i<ListaDeContatos.size();i++) {
			if(ListaDeContatos.get(i) instanceof PessoaJuridica){
				PessoaJuridica pj = (PessoaJuridica) ListaDeContatos.get(i);
				
				if(pj.getCnpj() == cnpj) {					
					ListaDeContatos.remove(i);
					break;
				}	
			}System.out.println("Contato nao esta na lista!");	
		}
	 }
		public void ordenarLista() {
			for(int i=0; i<ListaDeContatos.size(); i++) {
				if(ListaDeContatos.get(i) instanceof PessoaFisica) {
					
					AuxF.add((PessoaFisica) ListaDeContatos.get(i));
					
				}else if(ListaDeContatos.get(i) instanceof PessoaJuridica) {
					AuxJ.add((PessoaJuridica) ListaDeContatos.get(i));
				}
			}for(int i=0; i<AuxF.size();i++) {
				int menor = i;
				for(int j=i+1; j<AuxF.size();j++) {
					if(AuxF.get(j).getCpf() <AuxF.get(menor).getCpf()) {
						menor = j;
					}
				}
				
			PessoaFisica aux = AuxF.get(i);
			AuxF.set(i,AuxF.get(menor));
			AuxF.set(menor, aux);
			
			}for(int i=0; i<AuxJ.size();i++) {
				int menorj = i;
				for(int j=i+1; j<AuxJ.size();j++) {
					if(AuxJ.get(j).getCnpj() <AuxJ.get(menorj).getCnpj()) {
						menorj = j;
					}
				}
				
			PessoaJuridica aux = AuxJ.get(i);
			AuxJ.set(i,AuxJ.get(menorj));
			AuxJ.set(menorj, aux);
			}	
				
			
			ListaDeContatos.clear();
			ListaDeContatos.addAll(AuxF);
			ListaDeContatos.addAll(AuxJ);
		}
	}		