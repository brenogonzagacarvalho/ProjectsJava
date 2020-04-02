
public class Pato extends Animal implements Andavel{

	public Pato(String aEspecie, String aNome) {
		super(aEspecie, aNome);
		
	}

	@Override
	public int getNumPatas() {
		// TODO Auto-generated method stub
		return 2;
	}

}
