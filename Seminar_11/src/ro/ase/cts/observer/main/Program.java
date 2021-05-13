package ro.ase.cts.observer.main;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
		ClientAbonat clientPopescu = new ClientAbonat("Popescu");
		ClientAbonat clientVasilescu = new ClientAbonat("Vasilescu");
		ClientAbonat clientIonescu = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClient(clientIonescu);
		sala.aboneazaClient(clientPopescu);
		sala.aboneazaClient(clientVasilescu);
		
		sala.anuntaMeci();



	}

}
