package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.test.stub.StudentStub;
import ro.ase.cts.test.suite.categorii.TesteGetPromovabilitate;

public class TestCaseStubPromovabilitateGrupa {
	
	private IStudent  studentStub = new StudentStub();
	
	@Before 
	public void setUp() throws Exception {
	}

	
	@Category({ TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

	

}
