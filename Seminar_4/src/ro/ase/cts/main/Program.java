package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy cl1 = ClinicaVeterinaraLazy.getInstance(
				"ClinVet", "Str. Independentei", 4, 2333.2f);
		ClinicaVeterinaraLazy cl2 = ClinicaVeterinaraLazy.getInstance(
				"ClinVet", "Str. Libertatii", 5, 2333.2f);
		
		System.out.println(cl1.toString());
     	System.out.println(cl2.toString());
		
		
		
		

	}

}
