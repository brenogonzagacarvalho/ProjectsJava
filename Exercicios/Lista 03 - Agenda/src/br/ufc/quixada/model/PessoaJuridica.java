package br.ufc.quixada.model;

public class PessoaJuridica extends Pessoa {
	
	private String inscEstadual;
	private String razaoSocial;
	private int cnpj;
	
	public PessoaJuridica() {
		super();
		
	}
	public PessoaJuridica(String nome, String endereco, String email,String inscEstadual,String razaoSocial, int cnpj ) {
		super(nome,endereco,email);
		this.inscEstadual = inscEstadual;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getInscEstadual() {
		return inscEstadual;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	@Override
	public String toString() {
		return "Nome = "+this.getNome()+", Inscriçao Estadual = "+this.inscEstadual +", Razao Social = " + this.razaoSocial +", CNPJ = "+this.cnpj +", Endereco = " + this.getEndereco()+", Email = " + this.getEmail();
	}
	
}
