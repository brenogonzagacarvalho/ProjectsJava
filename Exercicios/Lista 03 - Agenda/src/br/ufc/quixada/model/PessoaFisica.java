package br.ufc.quixada.model;

public class PessoaFisica extends Pessoa{
	private int cpf;
	private String dataNasc;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String email,int cpf, String dataNasc, String estadoCivil) {
		super(nome, endereco, email);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.estadoCivil = estadoCivil;
	}
	public PessoaFisica() {
		super();
		
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		return "Nome = "+this.getNome()+", CPF = " + this.cpf +", Data De Nascimento = "+this.dataNasc+", Estado Civil = "+this.estadoCivil+", Endereco = " + this.getEndereco()+", Email = "+this.getEmail();
	}
	
}
