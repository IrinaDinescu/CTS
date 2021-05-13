package ro.ase.cts.facade.classes;

public class Pacient {
	
	
	private String nume;
	private boolean esteInStareGrava;
	
	
	public Pacient(String nume, boolean esteInStareGrava) {
		super();
		this.nume = nume;
		this.esteInStareGrava = esteInStareGrava;
	}


	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", esteInStareGrava=" + esteInStareGrava + "]";
	}
	
	
	public boolean isInRegula() {
		return esteInStareGrava;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}


	public void setEsteInStareGrava(boolean esteInStareGrava) {
		this.esteInStareGrava = esteInStareGrava;
	}
	
	
	
	
	

}
