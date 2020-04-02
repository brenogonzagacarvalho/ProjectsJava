package br.quixada.ufc.model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{
	private String especialidade;
	private List<Paciente> ListaDePacientes = new ArrayList<>();

	public Medico(String nome, String especialidade) {
		super(nome);
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public boolean addPaciente(Paciente p) {
		boolean encontrou = false;
		for(int i=0; i<ListaDePacientes.size();i++){
			if(ListaDePacientes.get(i).getNome().equals(p.getNome())){
					encontrou = true;
					break;
				}
			}
			if(encontrou == false) {
					ListaDePacientes.add(p);
					return true;
			}else {
				return false;
		}
	}
}