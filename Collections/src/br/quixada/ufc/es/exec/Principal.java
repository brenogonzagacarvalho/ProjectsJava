package br.quixada.ufc.es.exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		Map<Integer,String> mapHash = new HashMap<>();
		mapHash.put(200, "UFC");
		mapHash.put(150, "Catolica");
		mapHash.get(200);
		
		String a = mapHash.get(200);
		System.out.println(a);
		
		for(Entry<Integer,String>e : mapHash.entrySet()) {
			System.out.println("Chave : "+ e.getKey());
			
		}
		
		/*
		Set<Integer>setHash = new HashSet<>();
		Set<Integer> setTree = new TreeSet<>();
		setTree.add(110);
		setTree.add(111);
		setTree.add(112);
		setTree.add(113);
		setTree.add(-110);
		setHash.add(110);
		setHash.add(111);
		setHash.add(112);
		setHash.add(113);
		setHash.add(-110);
		for(int t : setTree) {
			System.out.println(t);
		}
		for(int h : setHash) {
			System.out.println(h);
			
		}
		
		*/
		
		/*Arrays list
		 * 
		List<String> lista = new ArrayList<>();
		lista.add("Teste");
		lista.add("Prova");
		lista.add("Trabalho");
		lista.remove("Teste");
		String a = lista.get(1);
		System.out.println(a);
		for(String l : lista) {
			System.out.println(l);
			
		}
		*/
		
		/*Vector EStatico
		 * int vetor[] = new int[3];
		
		vetor[0] = 10;
		vetor[1] = 12;
		vetor[2] = 18;
		System.out.println("Tamanho: "+vetor.length);
		
		for (int x : vetor) {
			System.out.println(x);
		}
	*/
	}

}
