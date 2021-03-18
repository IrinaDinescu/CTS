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
	
	public static synchronized ClinicaVeterinaraLazy  getInstance(String nume, String adresa, int numarMedici, float buget) {
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

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setNumarMedici(int numarMedici) {
		this.numarMedici = numarMedici;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}

	public static void setInstanta(ClinicaVeterinaraLazy instanta) {
		ClinicaVeterinaraLazy.instanta = instanta;
	}
	
	
	
	
	

}
