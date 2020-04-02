package br.ufc.quixada;


public class Calculadora {
	
	
	private String  soma(double a, double b) {
		double r = a + b;
		String resposta = Double.toString(r);
		return resposta;
	}
	private String subtrair (double a,double b) {
		double r = a - b;
		String resposta = Double.toString(r);
		return resposta;
	}
	private String dividir (double a,double b) {
		double r = a / b;
		String resposta = Double.toString(r);
		return resposta;
	}
	private String multiplicar (double a,double b) {
		double r = a * b;
		String resposta = Double.toString(r);
		return resposta;
	}

	public String calcular(String data) {
		String[] operacao = data.split(" ");
		double a = Double.parseDouble(operacao[0]);
		double b = Double.parseDouble(operacao[2]);
		
		switch(operacao[1]) {
		case "+":
			return soma (a,b);
			
		case "-":
			return subtrair (a,b);
			
		case "*":
			return multiplicar (a,b);
		
			
		case "/":
			return dividir (a,b);
			
		default:
			return "Invalido";
		}
	}	
}
