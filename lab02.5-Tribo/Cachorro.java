public class Cachorro extends Animal implements Andavel{

	public Cachorro(String aEspecie, String aNome) {
		super(aEspecie, aNome);
		
	}

	@Override
	public int getNumPatas() {
		// TODO Auto-generated method stub
		return 4;
	}

}
