
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
	Socket clientSocket;

	public Connection (Socket aClientSocket) {
	    	clientSocket = aClientSocket;
			this.start();
	    }
	public void run(){
	    try {			                 // an echo server
	    ReceberMSG receber = new ReceberMSG(clientSocket);
	    Thread rThread = new Thread(receber);
	    rThread.start();
	    
	    EnviarMSG enviar = new EnviarMSG(clientSocket);
	    Thread eThread = new Thread(enviar);
	    eThread.start();
	    	
	    } catch(EOFException e) {System.out.println("EOF:"+e.getMessage());
	    } catch(IOException e) {System.out.println("IO:"+e.getMessage());
	    }
	}

}

