
public class ControladorPosts {
	RepositorioPosts repositorioPosts;
	static ControladorPosts controladorPosts;
	
	private ControladorPosts(){
		repositorioPosts = new RepositorioPosts();
	}
	public static ControladorPosts getInstance() {
		if controladorPosts == null {
			controladorPosts = new controladorPosts();
		}
		return controladorPosts;
	}
	public Post addPost(String titulo, String texto) {
		return repositorioPosts.adicionar(titulo , texto);	
	}
}
