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
	
	@Test
	public void testCalculeazaMedieNotaUnica() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);	
	}
	
	@Test
	public void testCalculeazaMedieMaiMulteNote() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 3;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		float medie = (nota1 + nota2 + nota3)/3.0f;
				
		assertEquals(medie, student.calculeazaMedie(), 0.01);	
	}
	
	@Test
	public void testCalculeazaMedieFaraNotaAdaugata() {
		Student student = new Student();

		
		assertEquals(0, student.calculeazaMedie(), 0.01);	
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCalculeazaGetNota() {
		Student student = new Student();
		
		int nota = 0;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}
	
	@Test
    public void testCalculeazaGetNotaJU3() {
        Student student=new Student();
        int nota=9;
        try {
            int x=student.getNota(-1);
            fail("Testul a esuat pt ca !IndexOutOfBoundsException");

        }
        catch (IndexOutOfBoundsException err) {

        }
        
    }
	
	@Test
	void testVerificaRestanta() {

		Student student = new Student();

		int nota1 = 2;
		int nota2 = 1;
		int nota3 = 3;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertTrue(student.areRestante());

	}
	
	@Test
	void testVerificaRestantaFalse() {

		Student student = new Student();

		int nota1 = 2;
		int nota2 = 1;
		int nota3 = 3;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertFalse(student.areRestante());

	}
	
	
	
	
	
	

}
