package ro.ase.cts.chain;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cont contCurent = new ContCurent(1500, "Madalin", null);
		Cont contEconomii = new ContEconomii(2500, "Madalin", null);
		Cont contCredit = new ContCredit(3200, "Madalin", null);
		Cont contIndisponobil = new ContIndisponibil("Madalin");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponobil);
		
		contCurent.plateste(3500);
		
		
		

	}

}
