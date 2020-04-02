package br.ufc.qx.lista01;

public class Circulo {

	private double raio;
	private String cor;
	
	public Circulo(){
		this(1, "red");
	}
	
	public Circulo(double raio, String cor){
		this.raio = raio;
		this.cor = cor;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(raio, 2);
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDetalhes(){
		return "Circulo[" + raio + ", " + cor +"]";
	}
	
	
}











