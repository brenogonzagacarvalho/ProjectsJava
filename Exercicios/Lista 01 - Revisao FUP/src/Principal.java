import java.util.Scanner;


		public class Principal {
	
			public static Scanner input = new Scanner(System.in);
			public static void main(String[] args) {
				int opcao;
				int a, b, n, temp;
				do {
					System.out.println("----------LISTA 01 - POO----------");
					System.out.println("----------MENU-------------");
					System.out.println("0- Fechar Menu");
					System.out.println("1- Funcao o receber dois numero e verifica qual o menor");
					System.out.println("2- Funcao o receber dois numero e verifica qual o maior");
					System.out.println("3- Funcao o retorna seu nome");
					System.out.println("4- Funcao o escreve seu nome e sobrenome");
					System.out.println("5- Funcao o media de duas notas, conceito A ou nao?");
					System.out.println("6- Funcao o fatorial de n");
					System.out.println("7- Funcao o um numero é primo ou nao?");
					System.out.println("8- Funcao o Conceito A,B ou reprovado?");
					System.out.println("9- Funcao o calculadora basica");
					System.out.println("10- Funcao o Do Safadao");
					opcao = input.nextInt();
					switch(opcao) {
						case 1:{
							System.out.println("Digite um numero:");
							a = input.nextInt();
							System.out.println("Digite um numero:");
							b = input.nextInt();
							System.out.println(maior(a, b));
							break;
						}
						case 2:{
							System.out.println("Digite um numero:");
							a = input.nextInt();
							System.out.println("Digite um numero:");
							b = input.nextInt();
							System.out.println(menor(a, b));
							break;
						}
						case 3:{
							System.out.println(nome());
							break;
						}
						case 4:{
							nomeSobrenome();
							break;
						}
						case 5:{			
							System.out.println("digite um nota:");
							a = input.nextInt();
							System.out.println("digite uma nota:");
							b = input.nextInt();
							if(media(a,b,7)==true)
								System.out.println("Conceito A");
							else {
								System.out.println("Nao foi conceito A");
							}
							break;
						}
						case 6:{			
							System.out.println("digite um numero:");
							n = input.nextInt();
							System.out.println("o fatorial de "+n+" é "+fatorial(n));
							break;
						}
						case 7:{			
							System.out.println("digite um numero:");
							n = input.nextInt();
							if(primo(n)==true) {
								System.out.println(n +" é um numero primo");
							}
							else {
								System.out.println(n +" nao é um numero primo");
							}
							break;
						}
						case 8:{			
							System.out.println("digite um nota:");
							a = input.nextInt();
							System.out.println("digite uma nota:");
							b = input.nextInt();
							if(media(a,b,7)==true)
								System.out.println("Conceito A");
							else {
								a = (a+b)/2;
								System.out.println("Esse Aluno foi para a AF, digite a sua nota:");
								b = input.nextInt();
								if(media(a,b,4)==true)
									System.out.println("Conceito B");
								else {
									System.out.println("Reprovado");
								}
							}
							break;
						}
						case 9:{			
							calculadora();
							break;
						}
						
						case 10:{			
							
							break;
						
						}
					}
				}while(opcao!=0);
			}
											//FIM DA MAIN METODOS A BAIXOOOO
			
			public static int menor (int a, int b) {
				if(a<b) {
					return a;
				}
				return b;
			}
			
			public static int maior (int a, int b) {
				if(a>b) {
					return a;
				}
				return b;
			}
			
			
			public static String nome() {
				String nome = "Breno";
				return nome;
			}	
			
			public static void nomeSobrenome() {
				for(int i = 0; i<100; i++) {
					if(i%2 == 0)
					System.out.println("Breno");
					else
					System.out.println("Gonzaga de Carvalho");
				}
			}	
			
			public static boolean media (int a, int b, int notaAprovado) {
				int media = (a+b)/2;
				if(media >= notaAprovado) {
					return true;
				}
				return false;
			}
			
			public static int fatorial(int n){
				int i, fat = 1;
				for(i=1 ; i <= n ; i++){
					fat *=  i;
				}
				return fat;
			}
			
			public static boolean primo(int n){
				int i;
				for(i=2 ; i<n ; i++){
					if(n%i == 0)
					return false;
				}
				return true;
			}	
			
			public static void calculadora() {
				int opcao;
				int a, b;
				do {
					System.out.println("Bem Vindo a Calculadora DE POO");
					System.out.println("0-sair:");
					System.out.println("1-soma:");
					System.out.println("2-subtracao:");
					System.out.println("3-divisao");
					System.out.println("4-multiplicacao:");
					opcao = input.nextInt();
					switch(opcao) {
					case 1:{
						System.out.println("digite um numero:");
						a = input.nextInt();
						System.out.println("digite um numero:");
						b = input.nextInt();
						System.out.println("a soma de " +a+ " com "+b+" é "+(a+b));
						break;
					}
					case 2:{
						System.out.println("digite um numero:");
						a = input.nextInt();
						System.out.println("digite um numero:");
						b = input.nextInt();
						System.out.println("a subtracao de " +a+ " com "+b+" é "+(a-b));
						break;
					}
					case 3:{
						System.out.println("digite um numero:");
						a = input.nextInt();
						System.out.println("digite um numero:");
						b = input.nextInt();
						System.out.println("a divisao de " +a+ " com "+b+" é "+(a/b));
						break;
					}
					case 4:{
						System.out.println("digite um numero:");
						a = input.nextInt();
						System.out.println("digite um numero:");
						b = input.nextInt();
						System.out.println("a multiplicacao de " +a+ " com "+b+" é "+(a*b));
						break;
					}
					default:{
						System.out.println("programa encerrado");
						opcao = 0;
					}
				}
			}
				
				while(opcao!=0);	
				
			}
			public int somatorio (int n) {
				int i;
				int soma = 0;
				for(i = 1; i <= n; i++) {
					soma += i;
				}
				return soma;
			}
			public void wesley_safadao(int dia, int mes, int ano){
				
				double safadeza = somatorio(mes) + (ano/100) * (50-dia);
				double anjo = 100 - safadeza;
				System.out.println(String.format("%.2f",safadeza) + "% safado e " + String.format("%.2f", anjo) + "% anjo");
			}
			
		}
	


