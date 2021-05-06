package ro.ase.cts.command;

public class Program {
	
	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Alisa"), 500));
		manager.invoca(new Retragere(new ContBancar("Oana"), 200));

		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Cosmina"), 100));
		manager.executaComanda();
	}
}
	


