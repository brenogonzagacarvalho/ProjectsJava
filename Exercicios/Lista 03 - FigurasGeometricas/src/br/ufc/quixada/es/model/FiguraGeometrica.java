package br.ufc.quixada.es.model;

public abstract class FiguraGeometrica {
	private String cor;
	private boolean filled;
	
	public FiguraGeometrica(String cor, boolean filled) {
		super();
		this.cor = cor;
		this.filled = filled;
	}
	public FiguraGeometrica() {
		super();
	}
	public String getCor() {
		return cor;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double calcularArea(double area);
	public abstract double calcularPerimentro(double perimentro);
	public abstract boolean preenchido(boolean filled);
}
