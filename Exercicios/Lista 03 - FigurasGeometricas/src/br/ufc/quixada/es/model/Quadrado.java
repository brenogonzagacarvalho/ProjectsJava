package br.ufc.quixada.es.model;

public class Quadrado extends FiguraGeometrica {
	private double tamLado;
	
	public Quadrado() {
		super();
	}
	
	public Quadrado(String cor, boolean filled, double tamLado) {
		super(cor, filled);
		this.tamLado = tamLado;
		
	}
	public double getTamLado() {
		return tamLado;
	}
	public void setTamLado(double tamLado) {
		this.tamLado = tamLado;
	}@Override	
	public double calcularArea(double area){		
		return area = (tamLado*tamLado); 
	}@Override
	public double calcularPerimentro(double perimentro) {
		return perimentro = (tamLado+tamLado);
	}@Override
	public boolean preenchido(boolean filled) {
		return filled = true;
	}
	
}
