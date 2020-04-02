package br.ufc.quixada.es;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();	
		aluno1.setNome("Breno");
		aluno1.setCurso("EngenhariaDeSoftware");
		aluno1.setIdade(22);
		aluno1.setIra(6.7f);
		System.out.println(aluno1);
	}

}
