package br.quixada.ufc.model;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
	private String diagnostico;
	private List<Medico> ListaDeMedicos = new ArrayList<>();
	
	public Paciente(String nome, String diagnostico) {
		super(nome);
		this.diagnostico = diagnostico;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public boolean addMedico(Medico m) {
		boolean encontrou = false;
		for(int i=0; i<ListaDeMedicos.size();i++){
			if(ListaDeMedicos.get(i).getEspecialidade().equals(m.getEspecialidade())){
					encontrou = true;
					break;
				}
			}
			if(encontrou == false) {
					ListaDeMedicos.add(m);
					return true;
			}else {
				return false;
		}
	}
}


