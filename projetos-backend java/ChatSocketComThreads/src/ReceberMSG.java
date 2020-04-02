import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceberMSG implements Runnable {
	private Socket s;
	private DataInputStream in;
	public ReceberMSG(Socket socket) throws IOException {
		this.s = socket;
		this.in = new DataInputStream(this.s.getInputStream());
	}
	@Override
	public void run() {
		while(true) {
			String resposta;
			try {
				resposta = in.readUTF();
				System.out.println("Mensagem: " + resposta );
			} catch (IOException e) {
				System.out.println("IOException: " + e.getMessage());
			}
			
		}
		
	}
}
