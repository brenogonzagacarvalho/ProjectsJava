import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Carro.numeroDeCarro = 10;
		Carro.imprimeNumeroDeCarros();
		
		
		Carro vetor[] = null;
		
		Carro c1 = new Carro();
		c1.marca = "Ferrari";
		c1.ano = 2018;
		c1.velocidade = 100;
		
	
	System.out.println("Marca : "+ c1.marca);	
	System.out.println("Velocidade : "+c1.velocidade);
	System.out.println("Ano : "+c1.ano);
	
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();
	System.out.println("Velocidade : "+c1.velocidade);
	
	c1.frear();
	System.out.println("Velocidade : "+c1.velocidade);
	
	c1.parar();
	System.out.println("Velocidade : "+c1.velocidade);

	Carro c2 = new Carro();
	
	c2.marca = "Mustang";
	c2.ano = 2018;
	c2.velocidade = 100;
	
	System.out.println("Marca : "+ c2.marca);	
	System.out.println("Velocidade : "+c2.velocidade);
	System.out.println("Ano : "+c2.ano);

	for(int i = 0; i<5; i++) {
		c2.acelerar();
	}
		System.out.println("Velocidae :"+c2.velocidade);

		
		Carro c3 = new Carro();
		Scanner scan1 = new Scanner(System.in);
		c3.marca = scan1.nextLine();
		System.out.println("Marca : "+c3.marca);
		c3.ano = scan1.nextInt();
		System.out.println("Ano :"+c3.ano);
		c3.velocidade = scan1.nextDouble();
		System.out.println("Velocidade :"+c3.velocidade);
	
	
		
		
	}

}
