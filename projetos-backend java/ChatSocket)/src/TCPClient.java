
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main (String args[]) {
	// arguments supply message and hostname of destination
	Socket s = null;
	    try{
	    	int serverPort = 7896;
		   	s = new Socket("127.0.0.1",serverPort);
			
		   	while(true) {
		   		enviarMSG(s);	
			}
	    
	    } catch (UnknownHostException e){System.out.println("Sock:"+e.getMessage()); 
	    } catch (EOFException e){ System.out.println("EOF:"+e.getMessage());
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		} finally { if(s!=null) { try { s.close(); } catch (IOException e){System.out.println("close:"+e.getMessage()); } }
		}
	    
  	}
	public static void enviarMSG(Socket s) throws IOException{
  		Scanner c = new Scanner (System.in);
  		String MSG = c.nextLine();
  		DataOutputStream out = new DataOutputStream( s.getOutputStream());		
  		out.writeUTF(MSG); 
  		receberMSG(s);
	}		
	public static void receberMSG(Socket s) throws IOException {
		
		DataInputStream in = new DataInputStream( s.getInputStream());
		String data = in.readUTF();	
		System.out.println("Servidor: "+ data);
		
		}
	}

