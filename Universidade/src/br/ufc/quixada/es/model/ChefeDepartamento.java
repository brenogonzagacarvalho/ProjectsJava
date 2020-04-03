package br.ufc.quixada.es.model;
import java.time.LocalDate;


public class ChefeDepartamento extends Funcionario {

	private String departamento;
	private LocalDate dataPromocao;
	private double gratificacao;
	

		public ChefeDepartamento(String nome, String cpf, LocalDate dataNasc, String matricula, LocalDate dataAdmissao,
			double salario, String departamento, LocalDate dataPromocao, double gratificacao) {
		
			super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
		
			this.departamento = departamento;
			this.dataPromocao = dataPromocao;
			this.gratificacao = gratificacao;
	}
		public ChefeDepartamento() {
			super();
		}
		
		
		public void mostrarChefeDepartamento() {
			super.mostrarFuncionario();
			System.out.println("Print do Chefe");
			System.out.println("Trabalha no Departamento:"+this.departamento);
			System.out.println("E ganha uma gratificacao:"+this.gratificacao);
		}
}
