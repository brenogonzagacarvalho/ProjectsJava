package br.ufc.qx.lista1;

public class Livro {

	private String nome;
	private Autor autor;
	private double preco;
	private int qtdEstoque;
	
	public Livro(String nome, Autor autor){
		this.nome = nome;
		this.autor = autor;
		preco = 10;
		qtdEstoque = 1000;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getDetalhes(){
		String detalhes =  this.nome + "[Autor: " + autor.getNome() + 
				" email:" + autor.getEmail() +"]" +
				"preco " + preco + ", estoque " +  qtdEstoque;
		
		return detalhes;
	}
	
	
}















