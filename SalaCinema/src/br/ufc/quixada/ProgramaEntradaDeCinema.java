package br.ufc.quixada;

public class ProgramaEntradaDeCinema {
		
		
	public static void main(String[] args) {
	EntradaDeCinema ingresso1 = new EntradaDeCinema("Venon", 19, 5, 12,true,25);
	ingresso1.realizarVenda();
	System.out.println(ingresso1.toString());
	System.out.println("O valor do ticket foi de: "+ingresso1.getValorOriginal()+"$");
	System.out.println("Novo valor com o desconto promocional a idade foi de : "+ingresso1.calculaValorComDesconto(1996,23,3,392584)+"$");
	System.out.println("\n");
	
	EntradaDeCinema ingresso2 = new EntradaDeCinema("Capitã Marvel", 16, 4, 18,true,37);
	ingresso2.realizarVenda();
	System.out.println(ingresso2.toString());
	System.out.println("O valor do ticket foi de: "+ingresso2.getValorOriginal()+"$");
	System.out.println("Novo valor com o desconto promocional a idade foi de : "+ingresso2.calculaValorComDesconto(2011,28,2,420706)+"$");
	System.out.println("\n");
	
	EntradaDeCinema ingresso3 = new EntradaDeCinema("A Freira", 22, 3, 15,true,32);
	ingresso3.realizarVenda();
	System.out.println(ingresso3.toString());
	System.out.println("O valor do ticket foi de: "+ingresso3.getValorOriginal()+"$");
	System.out.println("Novo valor com o desconto promocional a idade foi de : "+ingresso3.calculaValorComDesconto(1995,28,2,420706)+"$");

	}

}
