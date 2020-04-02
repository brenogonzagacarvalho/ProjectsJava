package br.quixada.ufc.es.exec;

import br.quixada.ufc.es.model.Administrador;
import br.quixada.ufc.es.model.Empregado;
import br.quixada.ufc.es.model.Fornecedor;
import br.quixada.ufc.es.model.Operario;
import br.quixada.ufc.es.model.Vendedor;

public class Principal {
	public static void main(String[] args) {
		Fornecedor f = new Fornecedor(1000,800,"Breno","SaoJoao","897541");
		System.out.println("O saldo do Fornecedor � de: " +f.obterSaldo(1200));
		System.out.println("________________________________________________________________");
		
		Empregado empre = new Empregado("Breno","SaoJoao","9968516",5,1000.0,50.0);
		System.out.println("O salario do Empregado � de:" +empre.calcularSalario());
		System.out.println("________________________________________________________________");
		
		Administrador admin = new Administrador("Breno","SaoJoao","9968516",5,1000.0,50.0,500.0);
		System.out.println("O salario do Administrador � de: " +admin.calcularSalario());
		System.out.println("________________________________________________________________");
		
		Operario op = new Operario("Breno","SaoJoao","9968516",5,1000.0,150.0,300.0,3.0);
		System.out.println("O salario do Operario � de: " +op.calcularSalario());
		System.out.println("________________________________________________________________");
		
		Vendedor vend = new Vendedor("Breno","SaoJoao","9968516",5,1000.0,50.0,350.0);
		System.out.println("O salario do Vendedor � de:" +vend.calcularSalario());
		System.out.println("________________________________________________________________");
		
	}

}
