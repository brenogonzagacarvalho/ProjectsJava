package br.quixada.ufc.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String tipo;
	
	public Cliente(String nome, String cpf, String tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}
	public Cliente() {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}
	
	
	public double solicitarDesconto(double valor, String tipo) {
		if (tipo == "Estudante");
			valor = (valor*0.5);
		if (tipo == "Idoso");
			valor = (valor*0.5);
		if (tipo == "Policial");
			valor = (valor*0.2);
		if(tipo == "Professor");
			valor = (valor*0.1);
		System.out.println("O valor com Desconto foi de : "+valor);	
		return valor;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo + "]";
	}
}
