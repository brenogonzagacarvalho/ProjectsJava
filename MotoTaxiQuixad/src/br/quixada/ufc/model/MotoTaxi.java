package br.quixada.ufc.model;

public class MotoTaxi {
	private String nome;
	private String cnh;
	private String placa;
	private float nota;
	
	
	public MotoTaxi() {
		this.nome = nome;
		this.placa = placa;
		this.cnh = cnh;
		this.nota = nota;
		
	}
	public MotoTaxi(String nome, String cnh, String placa , float nota) {
		this.nome = nome;
		this.placa = placa;
		this.cnh = cnh;
		this.nota = nota;
	}
	
	public void realizarCorrida(Cliente cliente,Corrida corrida) {
		System.out.println("O Nome do Moto Taxi é : " +getNome());
		
		System.out.println("A placa da moto é  : " +getPlaca());
		
		System.out.println("O Nome do Cliente é : " +cliente.getNome());
		
		System.out.println("A partida dessa corrida é : " +corrida.getPartida());
		
		System.out.println("O Destino é : " +corrida.getDestino());
		
	}
	public String getNome() {
		return nome;
	}
	public String getCnh() {
		return cnh;
	}
	public String getPlaca() {
		return placa;
	}
	public float getNota() {
		return nota;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "MotoTaxi [nome=" + nome + ", cnh=" + cnh + ", placa=" + placa + ", nota=" + nota + "]";
	}

}

