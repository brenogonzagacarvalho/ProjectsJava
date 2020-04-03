package br.ufc.quixada.es.model;

import java.time.LocalDate;

public class Aluno extends Pessoa{

	private String matricula;
	
	public Aluno(String nome, String cpf, LocalDate dataNasc,String matricula) {
		super(nome, cpf, dataNasc);
		this.matricula = matricula;
	}
	
	public Aluno(){
		super();
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void mostrarAluno() {
		super.mostrarPessoa();
		System.out.println("Print do Aluno");
		System.out.println("Matricula :"+this.matricula);
	}
	
}