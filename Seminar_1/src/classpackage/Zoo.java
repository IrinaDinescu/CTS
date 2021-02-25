package classpackage;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals;
	private Zookeeper zookeper;
	

	public Zoo() {
		super();
		animals = new ArrayList<>();
		zookeper = new Zookeeper("Gigi");
	}

	public Zoo(List<Animal> animals, Zookeeper zookeper) {
		super();
		this.animals = animals;
		this.zookeper = zookeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeeper getZookeper() {
		return zookeper;
	}

	public void setZookeper(Zookeeper zookeper) {
		this.zookeper = zookeper;
	}
	
	public void addAnimal(Animal a) {
		animals.add(a);
	}
	
	public void feedAllAnimals() {
		for(Animal a : animals) {
			zookeper.feed(a);
		}
	}
	
	
	

}
