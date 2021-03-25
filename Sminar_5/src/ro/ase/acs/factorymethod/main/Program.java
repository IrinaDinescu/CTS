package ro.ase.acs.factorymethod.main;

import ro.ase.acs.factorymethod.Categorie;
import ro.ase.acs.factorymethod.FactoryBody;
import ro.ase.acs.factorymethod.FactoryCategorie;
import ro.ase.acs.factorymethod.FactoryDurere;
import ro.ase.acs.factorymethod.FactoryGripa;

public class Program {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie =  factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printeazaCategorie(getTipFactory(), 10);
		
	

	}

}
