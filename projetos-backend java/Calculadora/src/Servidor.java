import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import br.ufc.quixada.Calculadora;



public class Servidor {
	public static void main(String[] args) throws IOException {
		
		Calculadora c = new Calculadora();
		ServerSocket Servidor = new ServerSocket(5000);
	
		Socket Cliente = Servidor.accept();
		System.out.println("Nova conexão com o cliente " +Cliente.getInetAddress().getHostAddress());
		Scanner teclado = new Scanner(Cliente.getInputStream());
		
	while (teclado.hasNextLine()) {
	
		System.out.println(teclado.nextLine());
		String entrada [] = teclado.nextLine().split( " " );
		
		switch(entrada[1]){
		
		case "+":
			c.soma(Float.parseFloat(entrada[0]), Float.parseFloat(entrada[2]));
		case "-":
			c.subtrair(Float.parseFloat(entrada[0]), Float.parseFloat(entrada[2]));
		case "*":
			c.multiplicar(Float.parseFloat(entrada[0]), Float.parseFloat(entrada[2]));
		case "/":
			c.dividir(Float.parseFloat(entrada[0]), Float.parseFloat(entrada[2]));
		}
		
	}
	
	teclado.close();
	Servidor.close();
	Cliente.close();
	
	}
}