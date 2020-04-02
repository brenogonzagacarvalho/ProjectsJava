package br.ufc.quixada;
import java.net.*;
import java.io.*;

public class TCPServer {
	
    public static void main (String args[]) {
	try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
		while(true) {
			Socket clientSocket = listenSocket.accept();
			Connection c = new Connection(clientSocket);
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
  }
}

class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;

	public Connection (Socket aClientSocket) {
	    try {
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out = new DataOutputStream( clientSocket.getOutputStream());
			this.start();
	     } catch(IOException e)  {System.out.println("Connection:"+e.getMessage());}
	}
	public void run(){
	    try {			                 // an echo server
	    	while(true) {
	    		String resposta = null;
		    	String data = in.readUTF();
		    	String[] opcao = data.split(" ");
		    	if(opcao[0].equals("cap")) {
		    		Captalizador cap = new Captalizador();
		    		resposta = cap.processar(data.substring(4));
		    	} else {
		    		Calculadora calc = new Calculadora();
			    	
			    	resposta = calc.calcular(data);
		    	}
		    	out.writeUTF(resposta);
	    	}
	    } catch(EOFException e) {System.out.println("EOF:"+e.getMessage());
	    } catch(IOException e) {System.out.println("IO:"+e.getMessage());
	    }
	}

}

