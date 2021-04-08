package ro.ase.cts.main;

import ro.ase.cts.adapter.classes.AdapterCreditClase;
import ro.ase.cts.adapter.classes.AdapterCreditObj;
import ro.ase.cts.adapter.classes.InterfaceCredit;
import ro.ase.cts.adapter.classes.Leasing;

public class Program {
	
	public static void oferInfoCredit(InterfaceCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
	
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferInfoCredit(adapter, "Ionel", 423.4f);
		
		AdapterCreditClase adapterClase = new AdapterCreditClase();
		oferInfoCredit(adapterClase, "Gigel", 322.32f);

	}

}
