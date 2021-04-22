package ro.ase.cts.state2.main;

import ro.ase.cts.state.classes.Masa;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		
		masa.ocupaMasas();
		
		masa.elibereazaMasa();

	}

}
