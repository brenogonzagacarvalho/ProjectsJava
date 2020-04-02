package br.ufc.quixada.model;

import br.ufc.quixada.exception.DivisionZeroException;

public class Calculadora {
	public int soma(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int div(int a,int b) throws DivisionZeroException {
		if(b == 0) {
			throw new DivisionZeroException("Nao pode fazer divisao por 0");
		}else {
			return a/b;	
		}
		
	}
	public int mult(int a,int b) {
		return a*b;
	}
}
