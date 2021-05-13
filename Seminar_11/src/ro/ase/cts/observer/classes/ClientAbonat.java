package ro.ase.cts.observer.classes;

public class ClientAbonat implements Observer{

	
	private String nume;
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}
	@Override
	public void recptionareMesaj(String mesaj) {
		System.out.println("Mesaj receptionat!");
		
	}

}
