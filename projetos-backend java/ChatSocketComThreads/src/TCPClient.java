
import java.net.*;
import java.io.*;

public class TCPClient {
	
	public static void main (String args[]) {
	// arguments supply message and hostname of destination
	Socket s = null;
	    try{
	    	int serverPort = 7896;
		   	s = new Socket("localhost",serverPort);
		   	
		   	EnviarMSG enviar = new EnviarMSG(s);
		    Thread eThread = new Thread(enviar);
		    eThread.start();
		   	
		   	ReceberMSG receber = new ReceberMSG(s);
		    Thread rThread = new Thread(receber);
		    rThread.start();
		    
		    
			      
	    } catch (UnknownHostException e){System.out.println("Sock:"+e.getMessage()); 
	    } catch (EOFException e){ System.out.println("EOF:"+e.getMessage());
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		} 
	    
  	}
	
}
