package ro.ase.acs.simplefactory.farmacie.main;

import ro.ase.acs.simplefactory.farmacie.Categorie;
import ro.ase.acs.simplefactory.farmacie.CategorieFactory;
import ro.ase.acs.simplefactory.farmacie.CategoriiMedicamente;
import ro.ase.acs.simplefactory.farmacie.Durere;

public class Program {
	
	public static CategoriiMedicamente getTipCategorie(){
		return CategoriiMedicamente.raceala;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategorieFactory factory = new CategorieFactory();
		try {
			Categorie durere = factory.creareCategorie(CategoriiMedicamente.durere, 5);
			Categorie body = factory.creareCategorie(CategoriiMedicamente.body, 10);
			Categorie categorie = factory.creareCategorie(getTipCategorie(), 15);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
