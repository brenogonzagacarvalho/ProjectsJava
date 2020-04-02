package br.ufc.quixada;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scan = new Scanner(System.in);
		TCPClient client = new TCPClient();
		client.sendRequest(scan.nextLine());
		System.out.println(client.getResponse());
		
	}

}
