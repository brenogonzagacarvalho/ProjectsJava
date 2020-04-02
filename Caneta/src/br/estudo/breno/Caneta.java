	package br.estudo.breno;
	
	public class Caneta {
		public String modelo;
		public String cor;
		public double ponta;
		protected int carga;
		protected boolean tampada;
			
	
		 public Caneta(String modelo,String cor,double ponta, int carga,boolean tampada) {
				
				this.tampar();
				this.modelo = "BIC";
				this.cor = "Azul";
				this.ponta = 0.5;
				this.carga = 100;
				
		 }
		
		public void status() {
			
			System.out.println("SOBRE MINHA CANETA");
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Cor: " + this.cor);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Carga: " + this.carga +"%");
		}
		 
		 public String getModelo() {
			return modelo;
		}
	
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
	
		public String getCor() {
			return cor;
		}
	
		public void setCor(String cor) {
			this.cor = cor;
		}
	
		public double getPonta() {
			return ponta;
		}
	
		public void setPonta(double ponta) {
			this.ponta = ponta;
		}
	
		public int getCarga() {
			return carga;
		}
	
		public void setCarga(int carga) {
			this.carga = carga;
		}
	
		public boolean isTampada() {
			return tampada;
		}
	
		public void setTampada(boolean tampada) {
			this.tampada = tampada;
		}
	
		public void escrever() {
			 System.out.println("Vc estar escrevendo!");
		 }
		 
		public void rabiscar() {
			 System.out.println("A caneta esta rabiscando!");
			 
		 }
		 
		 public void pintar() {
			 
		 }
		 
		 public void tampar() {
			 this.tampada = true;
		 }
		 
		 public void destampar() {
			 this.tampada = false;
		 }
		 
		
	}