package br.ufc.qx.lista1;

public class Autor {

	private String nome;
	private String email;
	private char genero;
	
	public Autor(String nome, String email, char genero) {
		this.nome = nome;
		this.email = email;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public char getGenero() {
		return genero;
	}

	
	
}
