	package br.ufc.quixada.es;
	
	public class Aluno {
		private String nome;
		private String curso;
		private int idade;
		private float ira;
		
	
	public Aluno(String nome, String curso, int idade, float ira) {
		this.nome = nome;
		this.curso = curso;
		this.idade = idade;
		this.ira = ira;
		}
	public Aluno() {
				
		}
				
	public void estudar(String materia) {
		System.out.println(this.nome+" esta estudando "+materia);
		}
				
	public void matricular(String disciplina) {
				System.out.println(this.nome+" se matriculou em "+disciplina);
		}
		
		public String getNome() {
			return nome;
			
		}
		public String getCurso() {
			return curso;
		}
		public int getIdade() {
			return idade;
		}
		public float getIra() {
			return ira;
		}
		public void setNome(String nome) {
			if(nome.startsWith("http://")|| nome.startsWith("ssh: ")) {
				System.out.println("String maliciosa detectada");
			}else {
				this.nome = nome;
			}
		}
		public void setCurso(String curso) {
			if(curso.equals("ES")) {
				
			}else if(curso.equals ("DD")) {
				 
			}else if(curso.equals("CC")) {
				
			}else if(curso.equals("EC")) {
				
			}else if(curso.equals("SI")) {
				
			}else if(curso.equals("Redes")) {
				
			}else {
				System.out.println("Seu curso não existe no Campus!");
			}			
			this.curso = curso;
		}
		public void setIdade(int idade) {
			if(idade < 0) {
			}else {
				System.out.println("Idade certa!");
			
			this.idade = idade;
			}
		}
		public void setIra(float ira) {
			if(ira>10 || ira < 0) {
				System.out.println("Ira acima ou abaixo do permitido!");
			}else {
			this.ira = ira;
		}
	}
		public String toString() {
			String modelo = "";	
			modelo = "Nome do Aluno: "+this.nome+"\n"+"A idade do aluno: "+this.idade + "\n" + "O curso do Aluno: " + this.curso+"\n"+"O ira desse aluno é:" + this.ira;
		return modelo;
		}
		
		
	}