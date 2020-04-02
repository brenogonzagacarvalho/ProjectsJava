package br.ufc.quixada.es.model;

public class Circulo extends FiguraGeometrica {
	private double raio;
	
	public Circulo() {
		super();
	}
	public Circulo(String cor, boolean filled, double raio) {
		super(cor, filled);
		this.raio = raio;
		
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double calcularArea(double area){		
		return area = (getRaio()*getRaio())*(3.14);
		
	}
	@Override
	public double calcularPerimentro(double perimentro) {
		return perimentro = (2 * (3.14)* getRaio());
	}
	@Override
	public boolean preenchido(boolean filled) {
		
		return false;
	}		

}
