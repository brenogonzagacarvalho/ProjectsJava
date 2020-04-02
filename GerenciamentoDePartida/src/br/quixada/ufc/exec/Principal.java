package br.quixada.ufc.exec;

import br.ufc.quixada.model.Jogador;
import br.ufc.quixada.model.Partida;
import br.ufc.quixada.model.Time;

public class Principal {

	public static void main(String[] args) {
		Jogador jog1 = new Jogador();
		Jogador jog2 = new Jogador();
		Jogador jog3 = new Jogador();
		Jogador jog4 = new Jogador();
		Jogador jog5 = new Jogador();
		
		Time time1 = new Time("Brasil");
		Time time2 = new Time("Argentina");
		time1.addJogador(jog1);
		time1.addJogador(jog2);
		time1.addJogador(jog3);
		time1.addJogador(jog4);
		time1.addJogador(jog5);
		
		time2.addJogador(jog1);
		time2.addJogador(jog2);
		time2.addJogador(jog3);
		time2.addJogador(jog4);
		time2.addJogador(jog5);
		Partida partida1 = new Partida();
		partida1.gerarResultado(time1,time2);
		
		
		
	}

}
