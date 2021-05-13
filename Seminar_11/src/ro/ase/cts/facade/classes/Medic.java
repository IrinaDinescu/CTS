package ro.ase.cts.facade.classes;

public class Medic {
	
	private String nume;
	private String specializare;
	
	public Medic(String string, String string2) {
		this.nume = string;
		this.specializare = string2;}

	public boolean esteNecesaraInternarea(Pacient pacient) {
		return pacient.isInRegula();
	}

}
