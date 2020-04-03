
public class MeuSistema {

public interface PilhaComandos {
public void iniciaPilhaComandos();
public void empilhaComando(Object comando);
public void desempilhaComando();
public void finalizaPilhaComandos();
}

public interface Relatorio {
	public void iniciaRelatorio();
	public void formataRelatorio(Object relatorio);
	public void imprimiRelatorio(Object relatorio);
}

public interface Global {
	public void iniciaDadosGlobais();
	public void finalizaDadosGlobais();
}


}
