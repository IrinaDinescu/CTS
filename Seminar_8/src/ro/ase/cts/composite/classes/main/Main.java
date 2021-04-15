package ro.ase.cts.composite.classes.main;

import ro.ase.cts.composite.classes.IOptiuniMeniu;
import ro.ase.cts.composite.classes.Item;
import ro.ase.cts.composite.classes.Sectiune;

public class Main {
	
	public static void main(String[] args) {
		
		IOptiuniMeniu meniu = new Sectiune("Meniu restaurant");
		
		IOptiuniMeniu optiune1 = new Sectiune("bauturi");
		IOptiuniMeniu optiune2 = new Sectiune("desert");
		
		IOptiuniMeniu item1 = new Item("frappe");
		IOptiuniMeniu item2 = new Item("apa plata");
		IOptiuniMeniu item3 = new Item("papanasi");
		
		try {
			
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			
			optiune2.adaugaNod(item3);
			
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			meniu.descriere();
			
			optiune1.stergeNod(item1);
			optiune2.adaugaNod(item1);
			
			meniu.descriere();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
