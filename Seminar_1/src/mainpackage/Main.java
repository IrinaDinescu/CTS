package mainpackage;

import classpackage.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Zookeeper keeper = new Zookeeper("Gigi");
		Zoo zoo = new Zoo();
		zoo.setZookeper(keeper);
	
		
		Giraffe giraffe = new Giraffe("Girafa", 10, 200);
		Giraffe secondGiraffe = new Giraffe("GirafaDoi", 10);
		
		zoo.addAnimal(giraffe);
		zoo.addAnimal(secondGiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra zebra = new Zebra("Zebra", 15);
		Zebra secondZebra = new Zebra("Zebra", 15, 50);
		
		zoo.addAnimal(zebra);
		zoo.addAnimal(secondZebra);
		
		zoo.feedAllAnimals();
		
		
		
	
		
	
		

	}

}
