package ro.ase.cts.main;
import ro.ase.cts.classes.*;
import ro.ase.cts.readers.*;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {
	
	public static List<Aplicant> citesteAplicanti( AplicantReader reader) throws FileNotFoundException, NumberFormatException{
		
		return reader.citesteAplicanti();
	}
	

	public static void main(String[] args) {
			
		
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

