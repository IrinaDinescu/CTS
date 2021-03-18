package ro.ase.cts.eu;

import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Diagrama {
	private String nume;
	private int numarNiveluri;
	private String tip;
	
	private static Diagrama instanta  = null;

	private Diagrama(String nume, int numarNiveluri, String tip) {
		super();
		this.nume = nume;
		this.numarNiveluri = numarNiveluri;
		this.tip = tip;
	}
	
	public static synchronized Diagrama getInstance(String nume, int numarNiveluri, String tip) {
		if(instanta == null) {
			instanta = new Diagrama(nume, numarNiveluri, tip);
			
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Diagrama [nume=" + nume + ", numarNiveluri=" + numarNiveluri + ", tip=" + tip + "]";
	}
	
	
	
	
	

}
