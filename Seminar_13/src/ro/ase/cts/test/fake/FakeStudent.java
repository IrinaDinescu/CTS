package ro.ase.cts.test.fake;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class FakeStudent implements IStudent {
	
	private String nume;
	private float medie;
	private boolean areRestante;
	
	
	public FakeStudent() {
		
	}
	

	public FakeStudent(String nume, float medie, boolean areRestante) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestante = areRestante;
	}

	public float getMedie() {
		return medie;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public boolean isAreRestante() {
		return areRestante;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

	@Override
	public String getNume() {
		return nume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		return areRestante;
	}

}
