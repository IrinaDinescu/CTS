package classpackage;

public class Giraffe extends Animal{
	
	private float inaltime;
	
	
	public Giraffe(String nume, float greutate, float h) {
		super(nume, greutate);
		this.inaltime = h;
	}
	
	public Giraffe(String name, float greutate) {
		super(name, greutate);
	}

	public float getInaltime() {
		return inaltime;
	}

	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}
	
	
		
	
	
	

}
