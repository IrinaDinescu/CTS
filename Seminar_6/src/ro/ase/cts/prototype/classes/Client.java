package ro.ase.cts.prototype.classes;

public class Client implements AbstractPrototype{
	
	private int codClient;
	private String nume;
	private int varsta;
	
	
	// validarea inputului
	public Client(int codClient, String nume, int varsta) {
		super();
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}


	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", varsta=" + varsta + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	


	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public AbstractPrototype copiaza() {
		Client client = new Client();
		client.codClient = this.codClient;
		client.varsta = this.varsta;
		client.nume = this.nume;
		
		return client;
		
		
	}
	
	
	
	

}
