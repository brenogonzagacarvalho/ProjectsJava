package br.quixada.ufc.model;

public class Corrida {
	private String partida;
	private String destino;
	private float precoKm;
	private float precoCorrida;
	
	public Corrida() {
		this.partida = partida;
		this.destino = destino;
		this.precoKm = precoKm;
		this.precoCorrida = precoCorrida;
		
	}
	
	public Corrida(String partida, String destino, float precoKm, float precoCorrida){
		this.partida = partida;
		this.destino = destino;
		this.precoKm = precoKm;
		this.precoCorrida = precoCorrida;	
		
	}
	
	public float calcularValorCorrida(int distancia, float valorCorrida) {
			valorCorrida = (distancia *precoKm) + 5;
			
			System.out.println("O valor da corrida foi de :" + valorCorrida);
		return valorCorrida;
	}
	public float valorTotalCorrida(float valorCorrida, float valorSolicitarDesconto) {
		
		 float valorTotalCorrida = (valorCorrida - valorSolicitarDesconto);
		 System.out.println("O valor total da corrida foi de : "+valorTotalCorrida);
		 
		 return valorTotalCorrida;
		
	}
	
	public String getPartida() {
		return partida;
	}
	public String getDestino() {
		return destino;
	}
	public float getPrecoKm() {
		return precoKm;
	}
	public float getPrecoCorrida() {
		return precoCorrida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setPrecoKm(float precoKm) {
		this.precoKm = precoKm;
	}
	public void setPrecoCorrida(float precoCorrida) {
		this.precoCorrida = precoCorrida;
	}
	
	public String toString() {
		return "Corrida [partida=" + partida + ", destino=" + destino + ", precoKm=" + precoKm + ", precoCorrida="
				+ precoCorrida + "]";
	}

}
