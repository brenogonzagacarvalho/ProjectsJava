
public class Carro {

	public String marca;
	public int ano;
	public double velocidade;
	public static int numeroDeCarro;
	
	
	
public static int contarCarrosDeUmAno(Carro vetor[], int ContAno) {
	
	int cont = 0;
	
	for(Carro c : vetor) {    // so pode ser usado em LISTA, CONJUNTO E MAPAS
		if(c.ano == ContAno) cont++;
		
	}
	
	return cont;
}

public static void imprimeNumeroDeCarros() {
	
	System.out.println("Numero de Carros : "+numeroDeCarro);
}
	
public void acelerar() {
	
	this.velocidade += 10;
	
}

public void parar() {
	
	this.velocidade = 0;
	
}

public void frear() {
	
	this.velocidade-=10; 
		
	
	}


}