package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {
	
	

	

	@Test
	public void testConstructorRightName() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testAddNotaCorecta() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAddNotaUnica() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	
	
	

}
