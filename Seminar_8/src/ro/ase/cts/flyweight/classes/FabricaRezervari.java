package ro.ase.cts.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String, FlyweightAbstract> clienti;

	public FabricaRezervari(Map<String, FlyweightAbstract> clienti) {
		super();
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	
	public FlyweightAbstract getClient(String email) {
		FlyweightAbstract client = clienti.get(email);
		if(client == null) {
			client = new Client("Alisa", "0214207609", email);
			clienti.put(email, client);
			
		}
		return client;
	}
	
	
	

}
