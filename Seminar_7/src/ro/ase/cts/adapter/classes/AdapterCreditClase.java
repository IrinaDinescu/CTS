package ro.ase.cts.adapter.classes;

public class AdapterCreditClase extends Leasing implements InterfaceCredit{

	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
		
	}
	
	public AdapterCreditClase() {
		super();
		
	}

}
