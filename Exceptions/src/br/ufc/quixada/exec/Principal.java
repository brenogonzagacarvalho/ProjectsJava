package br.ufc.quixada.exec;

import java.util.Scanner;

import br.ufc.quixada.exception.DivisionZeroException;
import br.ufc.quixada.model.Calculadora;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while (true){
			System.out.println("Digite o numerador");
			int a = scan.nextInt();
			System.out.println("Digite o denominador");
			int b = scan.nextInt();
		
		Calculadora calc = new Calculadora();
		try {
			calc.div(1,0);
		}catch (DivisionZeroException e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
