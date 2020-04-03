package br.ufc.quixada.es.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

		private String matricula;
		private LocalDate dataAdmissao;
		private double salario;	
		
		
		public Funcionario() {
			super();
		}
		public Funcionario(String nome, String cpf, LocalDate dataNasc, String matricula, LocalDate dataAdmissao,
				double salario) {
			super(nome, cpf, dataNasc);
			this.matricula = matricula;
			this.dataAdmissao = dataAdmissao;
			this.salario = salario;
		}	
		public void mostrarFuncionario() {
			super.mostrarPessoa();
			/*                    pode ve mostrado assim tbm //////////////////
			System.out.println("O nome desse Funcionario é : "+super.getNome());
			System.out.println("O CPF é : "+ super.getCpf());
			System.out.println("Nasceu em : "+ super.getDataNasc());
																	*/
			System.out.println("Print do Funcionario");
			System.out.println("Matricula:"+this.matricula);
			System.out.println("Entrou na Universidade em :"+this.dataAdmissao);
			System.out.println("Seu salario é de :"+this.salario);
	}
		public String getMatricula() {
			return matricula;
		}
		public LocalDate getDataAdmissao() {
			return dataAdmissao;
		}
		public double getSalario() {
			return salario;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public void setDataAdmissao(LocalDate dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		

}
