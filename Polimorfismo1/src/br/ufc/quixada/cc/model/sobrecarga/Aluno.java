package br.ufc.quixada.cc.model.sobrecarga;

public class Aluno {
    private String nome;
    private String instituicao;
    private int idade;
    
    public Aluno() {
        this("Sem nome", "UFC", 18);
    }
    
    public Aluno(String nome) {
        this(nome, "UFC", 18);
    }
    
    public Aluno(String nome, String instituicao) {
        this(nome, instituicao, 18);
    }
    
    public Aluno(String nome, String instituicao, int idade) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.idade = idade;
    }
}
