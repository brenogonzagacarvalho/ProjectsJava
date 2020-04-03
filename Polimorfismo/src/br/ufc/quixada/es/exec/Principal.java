package br.ufc.quixada.es.exec;

import br.ufc.quixada.es.model.Aluno;
import br.ufc.quixada.es.model.Aviao;
import br.ufc.quixada.es.model.Barco;
import br.ufc.quixada.es.model.Brinquedo;
import br.ufc.quixada.es.model.Calculadora;
import br.ufc.quixada.es.model.Carro;

public class Principal {
	public static void main(String[] args) {
	
		int soma1 = Calculadora.soma(46,54);
		int soma2 = Calculadora.soma(50,50,30);
		System.out.println(soma1);
		System.out.println(soma2);
	
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Breno");
		Aluno a3 = new Aluno("Gonzaga","UFC");
		Aluno a4 = new Aluno("Carvalho","UFC",18);
		Brinquedo a = new Aviao();
		a.mover();
		Brinquedo c = new Carro();
		c.mover();
		Brinquedo b = new Barco();
		b.mover();
				
	}
}
