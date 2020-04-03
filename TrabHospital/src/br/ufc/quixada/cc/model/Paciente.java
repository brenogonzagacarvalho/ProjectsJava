package br.ufc.quixada.cc.model;

import java.util.List;

public class Paciente {
    private String id;
    private String diagnostico;
    private List<Medico> Minecraft;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public Paciente() {
        
    }
    
    public Paciente(String id, String diagnostico) {
        
    }
}
