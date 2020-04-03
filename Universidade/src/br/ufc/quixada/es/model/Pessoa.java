package br.ufc.quixada.es.model;

import java.time.LocalDate;


public class Pessoa {
	
	private String nome;
	private String cpf;
	private LocalDate dataNasc;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf, LocalDate dataNasc) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}
	
	public void mostrarPessoa() {
		System.out.println("O nome dessa pessoa é : "+ this.nome);
		System.out.println("O CPF é : "+ this.cpf);
		System.out.println("Nasceu em : "+ this.dataNasc);
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
