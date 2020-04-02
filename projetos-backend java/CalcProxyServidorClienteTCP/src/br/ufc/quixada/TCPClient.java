package br.ufc.quixada;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    private Socket s = null;

     
    public TCPClient(String host, int serverPort) {
    	try {
            s = new Socket(host, serverPort);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    public void sendRequest(String request) {
        try{
             
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
             
            out.writeUTF(request);                       
             
        } catch (UnknownHostException e) {
            System.out.println("TCPCliente UnknownHostException: " + e.getMessage());
        } catch (EOFException e) { 
            System.out.println("TCPCliente EOFException: " + e.getMessage());
        } catch (IOException e){ 
            System.out.println("TCPCliente IOException: " + e.getMessage());
        } 
    }
     
    public String getResponse() {
        String response = null;
        try{
             
            DataInputStream in = new DataInputStream(s.getInputStream());
             
            response = in.readUTF();             
             
        } catch (UnknownHostException e) {
            System.out.println("TCPCliente UnknownHostException: " + e.getMessage());
        } catch (EOFException e) { 
            System.out.println("TCPCliente EOFException: " + e.getMessage());
        } catch (IOException e){ 
            System.out.println("TCPCliente IOException: " + e.getMessage());
        }
        return response;
    }
     
    public void close() {
        if(s!=null) { 
            try { 
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                out.writeUTF("close");
                s.close(); 
            } catch (IOException e){
                System.out.println("IOException: " + e.getMessage()); 
            } 
        }
    }
}



