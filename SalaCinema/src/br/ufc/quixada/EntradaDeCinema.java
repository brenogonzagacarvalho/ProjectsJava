package br.ufc.quixada;

public class EntradaDeCinema {
	private String tituloDoFilme;
	private int horario;
	private int sala;
	private int poltrona;
	private boolean disponivel;
	private double valorOriginal;
	
	
	public EntradaDeCinema(String tituloDoFilme, int horario, int sala, int poltrona, boolean disponivel,
			int valorOriginal) {
		
		this.tituloDoFilme = tituloDoFilme;
		this.horario = horario;
		this.sala = sala;
		this.poltrona = poltrona;
		this.disponivel = disponivel;
		this.valorOriginal = valorOriginal;
	}
	public String toString() {
		String tituloDoFilme = "";
		tituloDoFilme = "Nome do Filme é :"+this.tituloDoFilme+"\n"+ "O horario do filme será : "+ this.horario +"horas"+"\n"+"Na sala :"+this.sala +"\n"+"Sua poltrona é a : "+this.poltrona;  
		return tituloDoFilme;
	}
	public double calculaValorComDesconto(int ano,int mes,int dia, int numCarteira) {
		int dataNascimento = 2018 - ano;
		double valorComDesconto = 0;
		
		if(dataNascimento < 12) {
			valorComDesconto = valorOriginal/2; 
		}else if (dataNascimento >=12 && dataNascimento <=15) {
			valorComDesconto = (valorOriginal) - (valorOriginal*0.4);
		}else if (dataNascimento >=16 && dataNascimento <=20) {
			valorComDesconto = (valorOriginal) - (valorOriginal*0.3);
		}else if (dataNascimento > 20) {
			valorComDesconto = (valorOriginal) - (valorOriginal*0.2);
		}
		return valorComDesconto;
	}
	public void realizarVenda() {
		
		this.disponivel = false;
	
	}
		
	public String getTituloDoFilme() {
		return tituloDoFilme;
	}


	public int getHorario() {
		return horario;
	}


	public int getSala() {
		return sala;
	}


	public int getPoltrona() {
		return poltrona;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public double getValorOriginal() {
		return valorOriginal;
	}
	
}
