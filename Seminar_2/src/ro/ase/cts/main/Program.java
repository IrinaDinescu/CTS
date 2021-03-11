package ro.ase.cts.main;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Proiect;
import ro.ase.cts.classes.Student;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException
	{
		return reader.citesteAplicanti();
	}

	public static void main(String[] args) {
		
	
		
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
	    
		
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			Proiect proiect = new Proiect(80);
			for(Aplicant angajat : listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(proiect);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
