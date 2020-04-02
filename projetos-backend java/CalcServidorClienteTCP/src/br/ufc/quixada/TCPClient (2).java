package br.ufc.quixada;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
	private Socket socket;
	private DataOutputStream out;
	private DataInputStream in;
	
	
	public TCPClient() {
	try{
		socket = new Socket("127.0.0.1", 123456);
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());
	}catch (IOException e ) {
		e.printStackTrace();
	}
}
	public void sendRequest(String request) {
		try {
		out.writeUTF(request);	
	
	}catch (IOException e ) {
		e.printStackTrace();
	}
}		
	public String getResponse() throws IOException {
		String data = in.readUTF();	
		return data;
	}
	
}