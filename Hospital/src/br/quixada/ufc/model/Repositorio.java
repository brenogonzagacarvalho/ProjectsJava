package br.quixada.ufc.model;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
	private List<Paciente> ListaDePaciente = new ArrayList<>();
	private List<Medico> ListaDeMedico = new ArrayList<>();
	
	public boolean addPaciente(Paciente p) {
		return ListaDePaciente.add(p);
		
	}public boolean addListaDeMedico(Medico m) {
		return ListaDeMedico.add(m);
		
	}
	public Paciente getPaciente(String nome) {
		for(int i=0;ListaDePaciente.size();i++) {
			if(ListaDePaciente.get(i))
		}
	}
}
