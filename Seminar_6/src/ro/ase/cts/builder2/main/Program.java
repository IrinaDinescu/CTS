package ro.ase.cts.builder2.main;

import ro.ase.cts.builder2.classes.Builder;
import ro.ase.cts.builder2.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.setBauturaRacoritoare(true);
		builder.setMancareInclusa(true);
		
		Rezervare rezervare1 = builder.setCodRezervare(5).build();
		Rezervare rezervare2 = builder.setCodRezervare(6).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}
