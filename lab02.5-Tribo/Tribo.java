import java.util.ArrayList;

public class Tribo {
	private ArrayList<Andavel> animais; 
	private ArrayList<Indio> indios; 
	private Cacique cacique; 
	public Tribo() { 
		animais = new ArrayList<Andavel>(); 
	} 
	public void adicionaAnimal(String nome, String especie, Cacique caique) { 
		if(this.cacique.equals(cacique)) {
			
		
		animais.add(FabricaAnimal.getInstance().); 
	} 
	}public boolean estouNestaTribo(Tribo tribo){ 
		ArrayList<Animal> animais = tribo.getAnimais(); 
		boolean achou=false; 
		Iterator<Animal> it = animais.iterator(); 
		while ((it.hasNext()) && (!achou)){ 
			if (it.next().equals(this)){ 
				achou = true; 
			} 
		} 
		return achou; 
	} 
	
	public int getNumPatas() { 
		int result = 0; 
		for (Andavel a : animais) { 
			
				result += a.getNumPatas(); 
				} 
		} 
		return result; 
	} 
	public ArrayList<Andavel> getAnimais() { 
		return animais; 
	} 
	public void setAnimais(ArrayList<Andavel> animais) { 
		this.animais = animais; 
	} 
	public void removeAnimal(Andavel animal) { 
		this.animais.remove(animal); 
	} 
	public void addIndio(Indio indio) { 
		this.indios.add(indio); 
	} 
	public ArrayList<Indio> getIndios() { 
		return indios; 
	} 
	public void setCacique(Cacique cacique) { 
		this.cacique = cacique; 
	} 
	public Cacique getCacique() { 
		return this.cacique; 
	} 
}
