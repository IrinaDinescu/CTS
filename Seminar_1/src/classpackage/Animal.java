package classpackage;

public abstract class Animal {
	protected String name;
	protected float greutate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGreutate() {
		return greutate;
	}
	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}
	public Animal(String name, float greutate) {
		super();
		this.name = name;
		this.greutate = greutate;
	}
	
	public Animal() {
		super();
	}
	
	
	

}
