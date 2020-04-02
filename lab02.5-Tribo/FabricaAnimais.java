
public class FabricaAnimais {
	private static FabricaAnimais fabricaAnimais;
	private FabricaAnimais() {
		
	}
	
	public static FabricaAnimais FabricaAnimaisgetInstance()  {
		if(fabricaAnimais == null) {
			fabricaAnimais = new FabricaAnimais();
		}
		return fabricaAnimais;
		
	public Andavel fabricaAnimal(String nome,String especie) {
		if (especie.equals("Pato")) {
			return new Pato(nome);
		}else if (especie.equals("Cachorro")) {
			return new Cachorro(nome);
		}
		return null;
	}
	}
}
