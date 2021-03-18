package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.eu.Diagrama;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
//		ClinicaVeterinaraLazy cl1 = ClinicaVeterinaraLazy.getInstance(
//				"ClinVet", "Str. Independentei", 4, 2333.2f);
//		ClinicaVeterinaraLazy cl2 = ClinicaVeterinaraLazy.getInstance(
//				"ClinVet", "Str. Libertatii", 5, 2333.2f);
//		
//		System.out.println(cl1.toString());
//     	System.out.println(cl2.toString());
//     	
//     	cl1.setNume("Clinica 1");
//     	cl2.setNume("Clinica 2");
//     	
//     	System.out.println(cl1.toString());
//     	System.out.println(cl2.toString());
		
		Diagrama d1 = Diagrama.getInstance("Diagrama 1", 5, "Tip 1");
		Diagrama d2 = Diagrama.getInstance("Diagrama 2", 4, "Tip 2");
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
     	
		
		
		
		

	}

}
