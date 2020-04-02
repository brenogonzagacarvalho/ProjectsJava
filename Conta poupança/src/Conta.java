import java.util.Scanner;

public class Conta {

	static String dono; 
	static int numero;
	static double saldo;
	static double rendimento = 0.5;
	
				
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Conta chamada = new Conta(); 		
		
		int opcao;
		
		do{
			opcao = scan.nextInt();
			System.out.println("Digite nome do titular da conta");
			dono = scan.next();
			System.out.println("Digite numero da conta");
			numero = scan.nextInt();
			System.out.println("Qual seu saldo? ");
			saldo = scan.nextDouble();
			System.out.println("1 - Ver seu saldo.");
			System.out.println("2 - Mostrar Detalhes da conta.");
			System.out.println("3 - Realizar Deposito.");
			System.out.println("4 - Ver o redimento do saldo");
			
			switch(opcao){
		
			
			case 1:
				chamada.verSaldo();
			break;
			
			case 2:
				chamada.mostrarDetalhes();	
			break;
			
			case 3:
				chamada.realizarDeposito();
			break;
				
			case 4:
				chamada.atualizarSaldo();
			break;
			
			case 5:
			break;
			
			default : 
				System.out.println("Opcao digitada invalida!");
	        }	
		
		}while(opcao != 5);
		
	}


void verSaldo(){
	System.out.println("Seu saldo é :" + saldo);
}

void mostrarDetalhes(){
	System.out.println("Titular da conta é :" + dono);
	System.out.println("Seu saldo é :" + saldo);
	System.out.println("Numero da sua conta é :" + numero);
	System.out.println("Seu rendimento foi de:" + rendimento);
}

double atualizarSaldo(){
	saldo = saldo + saldo*rendimento;
	System.out.println(saldo);
	return saldo;
	}
void realizarDeposito(){
	Scanner scan = new Scanner(System.in);
	double aplicacao;
	aplicacao =  scan.nextDouble();
	saldo +=aplicacao;
	}
}
	