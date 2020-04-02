package br.ufc.quixada.model;

import br.ufc.quixada.exec.Imprimivel;

public class Relatorio {
	
	public String gerarRelatorio(Imprimivel obj) {
	return obj.mostrarDados();	
	}
}