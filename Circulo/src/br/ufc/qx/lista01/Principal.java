package br.ufc.qx.lista01;

public class Principal {

	public static void main(String[] args) {
		
		Circulo c1, c2, c3;
		
		c1 = new Circulo();
		c2 = new Circulo(10, "azul");
		c3 = new Circulo();
		
		c3.setRaio(5);
		c3.setCor("verde");
		
		System.out.println("Soma da area " +  (c1.getArea() + c2.getArea() + c3.getArea()));
		
		System.out.println(c1.getDetalhes());
		System.out.println(c2.getDetalhes());
		System.out.println(c3.getDetalhes());

	}

}












