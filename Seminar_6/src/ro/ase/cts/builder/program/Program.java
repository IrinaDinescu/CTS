package ro.ase.cts.builder.program;

import ro.ase.cts.builder.classes.Builder;
import ro.ase.cts.builder.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new Builder().setCodRezervare(2).setBauturaRacoritoare(true).build();
		
		System.out.println(rezervare);

	    Rezervare rezervare2 = new Builder().setCodRezervare(3).setMancareInclusa(true).build();
	    
	    System.out.println(rezervare2);
	    
	    Rezervare.Builder rezervare3 =
	    		new Rezervare.Builder().setBauturaRacoritoare(true);

	}

}
