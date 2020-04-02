package br.ufc.qx.lista1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor nicolas = new Autor("Nicolas Sparks", "nicolas@gmail.com", 'M');
		
		Livro livro = new Livro("A ultima musica", nicolas);
		
		System.out.println(livro.getDetalhes());
		
		livro.setPreco(60);
		livro.setQtdEstoque(50);
		
		System.out.println(livro.getDetalhes());
		
	}

}
