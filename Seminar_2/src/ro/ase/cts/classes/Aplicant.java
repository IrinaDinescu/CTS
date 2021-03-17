package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public int getPunctaj() {
		return punctaj;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public int getNumarProiecte() {
		return numarProiecte;
	}
	
	public void setNumarProiecte(int nr_proiecte, String[] vect) {
		this.numarProiecte = nr_proiecte;
	    this.denumiriProiecte = vect;
	}
	
	
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}

	
	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", numarProiecte=" + numarProiecte + ", denumiriProiecte=" + Arrays.toString(denumiriProiecte) + "]";
	}
	
	
	public void afiseazaStatus(Proiect proiect) {
		System.out.println("Aplicantul " + nume + " " + prenume);
		if(punctaj > proiect.getPragAcceptare()) {
			System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
		}else {
			System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
		}
	}
		

	public abstract float getSumaFinantare();


	
	
	

}
