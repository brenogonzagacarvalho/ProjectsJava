package ufc.quixada.pptls;

public class Jogo {
	private int placarJogador;
	private int placarCPU;
	private Jogador jogador;
	private CPU cpu;
	private boolean sair;
	
	public Jogo() {
		placarCPU = 0;
		placarJogador = 0;
		sair = false;
	}
	public void mostrarPlacar() {
		System.out.println("Jogador " + placarJogador + " X "+ placarCPU + " CPU");
	}

	public void vencedorRodada(){
		boolean entradaValida = true;
		jogador = new Jogador();
		cpu = new CPU();
		String entradaJogador = jogador.jogar();
		entradaValida = this.validarEntrada(entradaJogador);
		while(!entradaValida) {
			System.out.println("Nao entendi!");
			entradaJogador = jogador.jogar();
			entradaValida = this.validarEntrada(entradaJogador);
		}
		String entradaCPU = cpu.jogar();
		if(entradaJogador.equals("pedra")) {//JOGADOR PEDRA
			
			if (entradaCPU.equals("papel")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("tesoura")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else if (entradaCPU.equals("spock")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("lagarto")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else {
				System.out.println("Empatou!!!");
			}
		}else if(entradaJogador.equals("papel")) {//JOGADOR PAPEL
			
			if (entradaCPU.equals("tesoura")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("spock")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else if (entradaCPU.equals("lagarto")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("pedra")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else {
				System.out.println("Empatou!!!");
			}
		}else if(entradaJogador.equals("tesoura")) {//JOGADOR TESOURA
			
			if (entradaCPU.equals("spock")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("lagarto")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else if (entradaCPU.equals("pedra")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("papel")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else {
				System.out.println("Empatou!!!");
			}
		}else if(entradaJogador.equals("spock")) {//JOGADOR SPOCK
			
			if (entradaCPU.equals("papel")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("tesoura")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else if (entradaCPU.equals("lagarto")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("pedra")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else {
				System.out.println("Empatou!!!");
			}
		}else if(entradaJogador.equals("lagarto")) {//JOGADOR LAGARTO
			
			if (entradaCPU.equals("tesoura")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("spock")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else if (entradaCPU.equals("pedra")) {
				placarCPU++;
				System.out.println("CPU ganhou!");
			}else if (entradaCPU.equals("papel")) {
				placarJogador++;
				System.out.println("Você ganhou!");
			}else {
				System.out.println("Empatou!!!");
			}
		}else if(entradaJogador.equals("sair")) {
			this.sair = true;
			
		}
		
	}

	public void mostrarInstrucoes(){
		System.out.println("Instruções: escreva “pedra”, “papel”, “tesoura”, “lagarto” ou “spock” para dar o lance.");
	
	}

	public void msgBemVindo() {
		System.out.println("Bem-vindo :: Vamos jogar!");
		
		}
	public boolean validarEntrada(String entrada) {
		if(entrada.equals("pedra")) {
			return true;
			
		}else if(entrada.equals("papel")) {
			return true;
			
		}else if(entrada.equals("tesoura")) {
			return true;
			
		}else if(entrada.equals("lagarto")) {
			return true;
			
		}else if(entrada.equals("spock")) {
			return true;
					
		}else if(entrada.equals("sair")) {
			return true;
				
		}else{
			return false;
		}
	}
	public boolean getSair() {
		return this.sair;
	}
}