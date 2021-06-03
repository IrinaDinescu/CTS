package ro.ase.cts.test.fake;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.test.suite.categorii.TesteGetPromovabilitate;
import ro.ase.cts.test.suite.categorii.TesteNormale;
import ro.ase.cts.test.suite.categorii.TesteUrgente;

public class GrupaTestWithFake {

	
	@Category({TesteNormale.class, TesteGetPromovabilitate.class})
	@Test
	public void promovabilitateTest() {
		
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);

		
		Assert.assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	
	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	@Test
	public void PromovobalitateCuRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	
  
}
