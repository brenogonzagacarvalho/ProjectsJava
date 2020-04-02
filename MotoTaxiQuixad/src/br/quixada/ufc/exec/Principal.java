package br.quixada.ufc.exec;

import br.quixada.ufc.model.Cliente;
import br.quixada.ufc.model.Corrida;
import br.quixada.ufc.model.MotoTaxi;

public class Principal {

	public static void main(String[] args) {
		MotoTaxi mototaxi1 = new MotoTaxi("Ricardo", "15151515", "XYZ123",8);
		MotoTaxi mototaxi2 = new MotoTaxi("Emamuel", "13131313", "UIY159",7);
		MotoTaxi mototaxi3 = new MotoTaxi("Douglas", "24242424", "QWE424",10);
		
		Cliente cliente1 = new Cliente("Breno","06045412362","Estudante");
		Cliente cliente2 = new Cliente("Nairton","123456789","Policial");
		Cliente cliente3 = new Cliente("Nilson","159753852","Professor");
		
		Corrida corrida1 = new Corrida("rodoviaria","Bairro_Baviera", 3, 10);
		Corrida corrida2 = new Corrida("rodoviaria","Bairro_SaoJoao", 5, 15);
		Corrida corrida3 = new Corrida("rodoviaria","UFC", 8, 20);
		
		mototaxi1.realizarCorrida(cliente1, corrida1);
		cliente1.solicitarDesconto(15, "Estudante");
		corrida1.calcularValorCorrida(10, 15);
		corrida1.valorTotalCorrida(10, 15);
		/*
		mototaxi2.realizarCorrida(cliente2, corrida2);
		cliente2.solicitarDesconto(12, "Policial");
		corrida2.calcularValorCorrida(8, 12);
		
		mototaxi3.realizarCorrida(cliente3, corrida3);
		cliente3.solicitarDesconto(8, "Professor");
		corrida3.calcularValorCorrida(5, 8);
	*/
	}

}
