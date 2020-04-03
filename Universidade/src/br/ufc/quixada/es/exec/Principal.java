package br.ufc.quixada.es.exec;

import java.time.LocalDate;
import java.util.Scanner;

import br.ufc.quixada.es.model.Aluno;
import br.ufc.quixada.es.model.ChefeDepartamento;
import br.ufc.quixada.es.model.Funcionario;
import br.ufc.quixada.es.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2000, 11, 5);
		Pessoa p = new Pessoa("Pessoa","124.333.222-34", ld);
		Funcionario f = new Funcionario("Funcionario", "134.233.444-55", ld, "13445", ld, 800);
		ChefeDepartamento c = new ChefeDepartamento("Chefe", "124.323.343-55", ld, "234", ld, 799, "RH", ld, 3500);
		Aluno a = new Aluno("Aluno", "124.343.345-22", ld, "1132424");
		
		p.mostrarPessoa();
		f.mostrarFuncionario();
		c.mostrarChefeDepartamento();
		a.mostrarAluno();

		
		
		/*
		Scanner lerTeclado = new Scanner(System.in);
		Scanner opcao1 = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("----------Cadrasto de Dados Universidade---------");
			System.out.println("----------MENU-------------");
			System.out.println("0 - Fechar Menu");
			System.out.println("1 - Definir dados Pessoais");
			System.out.println("2 - Definir dados Aluno");
			System.out.println("3 - Definir dados Funcionario");
			System.out.println("4 - Definir dados ChefeDepartamento");
			opcao = opcao1.nextInt();
			
			switch(opcao) {
			case 1:{
				
				System.out.println("Voce agora está definindo os dados da Pessoa.\n");
					System.out.println("Digite o cpf ");
				String cpf = lerTeclado.nextLine();
					System.out.println("Digite o nome da Pessoa\n");
				String nome = lerTeclado.nextLine();
					System.out.println("Digite a Dia do seu nascimento");
				int dia = lerTeclado.nextInt();
					System.out.println("Digite a Mes do seu nascimento");
				int mes = lerTeclado.nextInt();
					System.out.println("Digite a Ano do seu nascimento");
				int ano = lerTeclado.nextInt();
			
				LocalDate data = LocalDate.of(ano,mes,dia);
				
				Pessoa pessoa1 = new Pessoa();
				pessoa1.setNome(nome);
				pessoa1.setCpf(cpf);
				pessoa1.setDataNasc(data);
				pessoa1.mostrarPessoa();
				break;
				}
			case 2:{
				System.out.println("Voce agora está definindo os dados do Aluno.\n");

					System.out.println("Digite a matricula do Aluno");
						String matricula = lerTeclado.nextLine();
					System.out.println("Digite o nome do Aluno");
						String nome = lerTeclado.nextLine();
					System.out.println("Digite o cpf do Aluno");
						String cpf = lerTeclado.nextLine();
					System.out.println("Digite o Dia de nascimento");
						int dia = lerTeclado.nextInt();
					System.out.println("Digite o Mes de nascimento");
						int mes = lerTeclado.nextInt();
					System.out.println("Digite o Ano de nascimento");
						int ano = lerTeclado.nextInt();
						
					LocalDate data = LocalDate.of(ano,mes,dia);
					
					Aluno aluno1 = new Aluno();
					aluno1.setMatricula(matricula);
					aluno1.setNome(nome);
					aluno1.setCpf(cpf);
					aluno1.setDataNasc(data);
					aluno1.mostrarAluno();
					break;
				}
			case 3:{
			System.out.println("Voce esta definindo os dados do Funcionario.\n");
			
			System.out.println("Digite a matricula do Funcionario");
				String matricula = lerTeclado.nextLine();
			System.out.println("Digite o nome do Funcionario");
				String nome = lerTeclado.nextLine();
			System.out.println("Digite o cpf do Funcionario");
				String cpf = lerTeclado.nextLine();
			System.out.println("Digite o Dia de nascimento");
				int dia = lerTeclado.nextInt();
			System.out.println("Digite o Mes de nascimento");
				int mes = lerTeclado.nextInt();
			System.out.println("Digite o Ano de nascimento");
				int ano = lerTeclado.nextInt();
			System.out.println("Qual o salario do Funcionario");
				double salario = lerTeclado.nextDouble();
			System.out.println("Digite o Dia de Admissao");
				int dia1 = lerTeclado.nextInt();
			System.out.println("Digite o Mes de Admissao");
				int mes1 = lerTeclado.nextInt();
			System.out.println("Digite o Ano de Admissao");
				int ano1 = lerTeclado.nextInt();
				
			LocalDate data = LocalDate.of(ano,mes,dia);	
			LocalDate data1 = LocalDate.of(ano1,mes1,dia1);
			
			Funcionario funcionario1 = new Funcionario();
			funcionario1.setNome(nome);
			funcionario1.setCpf(cpf);
			funcionario1.setDataNasc(data);
			funcionario1.setSalario(salario);
			funcionario1.setDataAdmissao(data1);
			funcionario1.mostrarFuncionario();
			break;
			}
			case 4:{			
			System.out.println("Voce esta definindo os dados do ChefeDeDepartamento.\n");
			
			System.out.println("Digite a matricula do ChefeDeDepartamento");
				String matricula = lerTeclado.nextLine();
			System.out.println("Digite o nome do ChefeDeDepartamento");
				String nome = lerTeclado.nextLine();
			System.out.println("Digite o cpf do ChefeDeDepartamento");
				String cpf = lerTeclado.nextLine();
			System.out.println("Digite o Dia de ChefeDeDepartamento");
				int dia = lerTeclado.nextInt();
			System.out.println("Digite o Mes de nascimento");
				int mes = lerTeclado.nextInt();
			System.out.println("Digite o Ano de nascimento");
				int ano = lerTeclado.nextInt();
			System.out.println("Qual o salario do ChefeDeDepartamento");
				double salario = lerTeclado.nextDouble();
			System.out.println("Digite o Dia de Admissao");
				int dia1 = lerTeclado.nextInt();
			System.out.println("Digite o Mes de Admissao");
				int mes1 = lerTeclado.nextInt();
			System.out.println("Digite o Ano de Admissao");
				int ano1 = lerTeclado.nextInt();
			System.out.println("Qual o valor da Gratificacao");
				double gratificacao = lerTeclado.nextDouble();
			System.out.println("Digite o Dia da Promocao");
				int dia2 = lerTeclado.nextInt();
			System.out.println("Digite o Mes da Promocao");
				int mes2 = lerTeclado.nextInt();
			System.out.println("Digite o Ano da Promocao");
				int ano2 = lerTeclado.nextInt();
			
			LocalDate data = LocalDate.of(ano,mes,dia);	
			LocalDate data1 = LocalDate.of(ano1,mes1,dia1);	
			LocalDate data2 = LocalDate.of(ano2,mes2,dia2);
			
			ChefeDepartamento chefedepartamento1 = new ChefeDepartamento();		
			chefedepartamento1.setNome(nome);
			chefedepartamento1.setCpf(cpf);
			chefedepartamento1.setDataNasc(data);
			chefedepartamento1.mostrarChefeDepartamento();		
			break;
			}
		}
		}while(opcao!=0);
	*/}
}