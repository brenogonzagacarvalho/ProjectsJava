import java.util.HashMap;

	public class Sistema {
		HashMap<String,Cliente> clientes;
		HashMap<String,Transacoes> tr;
		float saldo;
		int count;
		
		public Sistema(float saldo,int count) {
			this.saldo = saldo;
			this.clientes = new HashMap<String,Cliente>();
			this.tr = new HashMap <String,Transacoes>();
			this.count = 0;	
		}
		public String toString() {
			String saida = " ";
			Cliente cl = clientes.map(id);
				saida += clientes +"\n";
				
				return saida+"Saldo: "+ this.saldo + "\n";
		}
		public void cadastrar(String id) {
			Cliente cl = clientes.get(id);
			if(encontrarClientes(id) == null) {
				clientes.put(id, new Cliente(id));
				
			}
			
		}
		
		public Cliente encontrarClientes(String id){
			for(Cliente cli : clientes) {
				if(cli.id.equals(id)) {
					return cli;
				}
			}
			return null;
		}
		public void emprestar(String id, float valor) {
			Cliente cli = encontrarClientes(id);
			if(cli == null) {
				System.out.println("cliente não existente");
				return;
			}
			if(this.saldo < valor) {
				System.out.println(" valor indisponível ");
				return;
			}
			this.tr.pull(new Transacoes(count,-valor,id));
			count+=1;
			this.saldo -= valor;
			cli.saldo += valor;
		}	
		HashMap<String,Transacoes>historico() {
	        return tr;
	    }
		public void mostrarCliente(String id) {
			for(Cliente c : clientes ){
				if(c.id.equals(id)) {
					System.out.println(tr);		
				}
				System.out.println("cliente náo cadastrado");
				return;
			}
		}	
		public void receber(String key, int valor) {
				Cliente cli =  encontrarClientes(id);
				if(cli == null) {
					System.out.println("cliente não cadastrado");
					return; 
				}
				if(valor > cli.saldo) {
					System.out.println(" fail: valor maior que a divida");
						return;
				}
				cli.saldo -= valor;
				this.saldo += saldo;
			}	
		public void matar(String id) {
			Cliente cli = encontrarClientes(id);
			this.cli.remove(cli);
			this.tr.remove(cli);
			return;
		}
	}
			  
			



