package br.ufc.quixada.es.model;

public class Retangulo extends FiguraGeometrica{
	
	private double ladoMaior;
	private double ladoMenor;
	
	public Retangulo() {
		super();
	}
	public Retangulo(String cor, boolean filled, double ladoMaior, double ladoMenor) {
		super(cor, filled);
		this.ladoMaior = ladoMaior;
		this.ladoMenor = ladoMenor;
	}
	public double getLadoMaior() {
		return ladoMaior;
	}
	public double getLadoMenor() {
		return ladoMenor;
	}
	public void setLadoMaior(double ladoMaior) {
		this.ladoMaior = ladoMaior;
	}
	public void setLadoMenor(double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}@Override
	public boolean preenchido(boolean filled) {
		return filled = true;
	}@Override
	public double calcularArea(double area){		
		return area = (ladoMenor*ladoMaior); 
	}@Override
	public double calcularPerimentro(double perimentro) {
		return perimentro = (ladoMaior+ladoMenor);
	}
	
	
	
}
