package ro.ase.cts.lazy;

public class ClinicaVeterinaraLazy {
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	
	private static ClinicaVeterinaraLazy instanta = null;

	private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	public static ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget) {
		if(instanta == null) {
			instanta = new ClinicaVeterinaraLazy(nume, adresa, numarMedici, buget);
			
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinaraLazy [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici
				+ ", buget=" + buget + "]";
	}
	
	
	
	
	

}
