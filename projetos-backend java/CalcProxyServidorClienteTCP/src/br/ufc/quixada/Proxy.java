package br.ufc.quixada;

import java.io.IOException;
import java.net.Socket;

public class Proxy {
	 private TCPClient client;
	
	 public Proxy() {
		 client = new TCPClient("localhost", 6789);
	    }
	     
	    public double add(double op1, double op2) {
	        String a = Double.toString(op1);
	        String b = Double.toString(op2);
	        client.sendRequest(a + " + " + b);
	        String resultado = client.getResponse();
	        double rfinal = Double.parseDouble(resultado);
	        return rfinal;
	    }
	     
	    public double sub(double op1, double op2) {
	        String a = Double.toString(op1);
	        String b = Double.toString(op2);
	        client.sendRequest(a + " - " + b);
	        String resultado = client.getResponse();
	        double rfinal = Double.parseDouble(resultado);
	        return rfinal;
	    }
	     
	    public double mult(double op1, double op2) {
	        String a = Double.toString(op1);
	        String b = Double.toString(op2);
	        client.sendRequest(a + " * " + b);
	        String resultado = client.getResponse();
	        double rfinal = Double.parseDouble(resultado);
	        return rfinal;
	    }
	     
	    public double div(double op1, double op2) {
	        String a = Double.toString(op1);
	        String b = Double.toString(op2);
	        client.sendRequest(a + " / " + b);
	        String resultado = client.getResponse();
	        double rfinal = Double.parseDouble(resultado);
	        return rfinal;
	    }
	     
	    public void close() {
	        client.close();
	    }
	}
