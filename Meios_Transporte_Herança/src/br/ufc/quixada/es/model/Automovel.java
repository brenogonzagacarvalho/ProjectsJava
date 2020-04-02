package br.ufc.quixada.es.model;

public class Automovel extends Terrestre {
	
	
	private String cor;
	private int numPortas;
	private String placa;
	
	public Automovel() {
		super();
	}
	
	
	public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
		super(capacidade, numRodas);
		this.cor = cor;
		this.numPortas = numPortas;
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
