package ro.ase.cts.template.main;

import ro.ase.cts.template.classes.Spectator;
import ro.ase.cts.template.classes.SpectatorPeluza;

public class Program {

	public static void main(String[] args) {
		Spectator spectator = new Spectator();
		SpectatorPeluza  sp = new SpectatorPeluza();
		
		spectator.intrareSpectatorPeStadion();
		sp.intrareSpectatorPeStadion();

	}

}
