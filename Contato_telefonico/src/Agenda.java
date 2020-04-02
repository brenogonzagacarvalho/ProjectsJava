import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Agenda {
	String nome;
	int telefone;
	
	public Agenda(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	Map<String,Integer> contatos = new TreeMap<>();
		
	public  String toString() {
		for(Entry<String,Integer>entry : contatos.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
			
		}
		return "" + contatos;
	}
}

