package br.ufc.quixada.exec;

import java.util.Scanner;

import br.ufc.quixada.model.Banco;
import br.ufc.quixada.model.ContaBancaria;
import br.ufc.quixada.model.ContaCorrente;
import br.ufc.quixada.model.ContaPoupanca;

public class Principal {
	public static Scanner input = new Scanner(System.in);
			
	public static void main(String[] args) {
		
		Banco b = new Banco();
		int opcao;
		int x;
		int y;
		do {
			System.out.println("----------MENU-------------");				
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Selecionar Conta");
			System.out.println("3 - Remover Conta");
			System.out.println("4 - Gerar Relatorio");
			System.out.println("5 - Fechar Menu");
			opcao = input.nextInt();
			switch(opcao) {
					
				case 1:{ //Criar Conta
					System.out.println("Qual tipo de Conta vc deseja criar?");
					System.out.println("1 - Conta Poupanca \n2 - Conta Corrente");
					x = input.nextInt();
					
						if(x == 1) {
							System.out.println("Digite o Numero da conta");
							int NumCon = input.nextInt();
							ContaBancaria cp = new ContaPoupanca(NumCon,0,2);
							b.adicionarConta(cp);
							System.out.println("Conta Criada Com Sucesso!");
						}
						if(x == 2) {
							System.out.println("Digite o Numero da conta");
							int NumCon = input.nextInt();
							ContaBancaria cc = new ContaCorrente(NumCon,0,400);
							b.adicionarConta(cc);
							System.out.println("Conta Criada Com Sucesso!");
						}
						if(x != 1 && x!= 2) {
							System.out.println("Opcao Invalida!");
						}
							break;
				}
				case 2:{//Selecionar Conta
					int op;
					System.out.println("Digite um numero da conta:");
					x = input.nextInt();
					ContaBancaria cb = b.buscarConta(x);
					if (cb == null) {
						System.out.println("Conta nao inexistente");
						break;
					}
					else {//	MENU OPERAÇOES
						System.out.println("----------MENU DE OPERACOES----------");
						System.out.println("1 - Deposito\n2 - Saque\n3 - Transferir \n4 - Sair\n");
						y = input.nextInt();
					
						if(y == 1) {
							System.out.println("----------MENU DA CONTA----------");
							System.out.println("Sua Conta é?\n"+"1 - Poupanca "+"\n2 - Corrente\n");
							op = input.nextInt();	
						
							if(op == 1 ) {//MENU DEPOSITO
								if(cb instanceof ContaPoupanca) {
									System.out.println("Digite o valor do Deposito.\n");
									double s = input.nextDouble();
									((ContaPoupanca)cb).depositar(s);
									System.out.println("Deposito realizado com sucesso!");
								}else {
									System.out.println("A conta n é Poupanca");
								}
							}
							if(op == 2) {
								if(cb instanceof ContaCorrente) {
									System.out.println("Digite o valor do Deposito.\n");
									double s = input.nextDouble();
									((ContaCorrente)cb).depositar(s);
									System.out.println("Deposito realizado com sucesso!");
								}else {
									System.out.println("A conta n é Corrente");
									}
								}
						}
						if(y == 2) {//MENU SAQUE	
							System.out.println("----------MENU DA CONTA----------");
							System.out.println("Sua Conta é?"+"\n"+"1 - Corrente "+"\n2 - Poupanca\n");
							op = input.nextInt();	
								
							
							if(op == 1 ) {
									System.out.println("Digite o valor do Saque.\n");
									double s = input.nextDouble();
									((ContaCorrente)cb).sacar(s);
									System.out.println("Saque realizado com sucesso!");
								}
								if(op == 2) {
									System.out.println("Digite o valor do Saque.\n");
									double s = input.nextDouble();
									((ContaPoupanca)cb).sacar(s);
									System.out.println("Deposito realizado com sucesso!");
								}
						}
					if(y == 3) {
						System.out.println("Digite o numero da conta que vc quer transferir");
						int s = input.nextInt();
						for (ContaBancaria conta : b.getConta()) {
							if(s == conta.getNumConta()) {
								System.out.println("Digite o valor da transferencia");
								double valor = input.nextDouble();
								cb.transferir(valor, conta);
								System.out.println("Transferencia Com Sucesso");
							}
						}System.out.println("Conta Nao encontrada");
					}
					if(y == 4) {
						System.out.println("Tchau Volte Sempre");
						break;
					}
					if(y != 1 && y!= 2 && y!=3 && y!=4) {
						System.out.println("Opcao Invalida!");
					}
					break;
					}
				}
				case 3:{//Remover conta
					System.out.println("Digite um numero da conta:");
					x = input.nextInt();
					b.removerConta(x);
					break;
				}
					
				case 4:{// GerarRelatorio
					b.gerarRelatorio();
					break;
				}
				case 5:{
						break;
				}
			}//Fechamento SWITCH
				
		}while (opcao!=0);//Fechamento DO
	}
}
