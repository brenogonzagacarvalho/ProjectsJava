import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EnviarMSG implements Runnable {
	
	private Socket s;
	private DataOutputStream out;		
	 

	public EnviarMSG(Socket socket) throws IOException {
			this.s = socket;
			this.out = new DataOutputStream(this.s.getOutputStream());
	}
	
	public void run() {
		while(true) {
			Scanner c = new Scanner (System.in);
	  		String MSG = c.nextLine();
	  		try {
				this.out.writeUTF(MSG);
			} catch (IOException e) {
				System.out.println("IOException: " + e.getMessage());
			}
		}
	}
}
