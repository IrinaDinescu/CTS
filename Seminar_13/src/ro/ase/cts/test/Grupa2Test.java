package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class Grupa2Test {


	Grupa grupa;
	
	
	
	@Before
	public void setUp() {
		
		grupa = new Grupa(1010);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		// TODO Auto-generated method stub

	}
	
	@Test(timeout = 100)
	public void performancePromovabilitate() {
		
		
		grupa.getPromovabilitate();
		
	}

}
