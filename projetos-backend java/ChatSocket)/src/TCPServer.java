
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	
    public static void main (String args[]) {
	try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
		Socket clientSocket = listenSocket.accept();
		while(true) {
			escutar(clientSocket);
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
 } 
    public static void escutar(Socket clientSocket) throws IOException {
    	DataInputStream in;
    	in = new DataInputStream( clientSocket.getInputStream());
    	String data = in.readUTF();
    	System.out.println("Cliente: " + data);
    	enviarMSG(clientSocket);
    }
    public static void enviarMSG(Socket clientSocket) throws IOException{
  		Scanner c = new Scanner (System.in);
  		String MSG = c.nextLine();
  		DataOutputStream out = new DataOutputStream( clientSocket.getOutputStream());		
  		out.writeUTF(MSG); 
  	}
}
