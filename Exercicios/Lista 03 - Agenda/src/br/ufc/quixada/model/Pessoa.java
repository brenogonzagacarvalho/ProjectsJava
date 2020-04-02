package br.ufc.quixada.model;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String email;
	
	public Pessoa () {
		
	}
	public Pessoa(String nome,String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + this.nome + ", endereco=" + this.endereco + ", email=" + this.email + "]";
	}
	
	
}
