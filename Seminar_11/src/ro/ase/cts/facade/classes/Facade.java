package ro.ase.cts.facade.classes;

public class Facade {
	
	public static String verificaPacient(Pacient pacient) {
		
		Medic medic = new Medic("Ion", "Cardiolog");
	
		StringBuilder sb = new StringBuilder();
		if(pacient.isInRegula()) {
			sb.append("Pacientul " + pacient.getNume() + " este in stare grava, trimite catre medic");
		}
		
		if(medic.esteNecesaraInternarea(pacient)) {
			Salon salon = new Salon(20);
			sb.append("Meidcul a decis ca este necesara internarea pacientului");
			if(salon.arePaturiLibere()) {
				sb.append(pacient.getNume() + " poate fi internat in salonul nostru.");
				
			}else {
				sb.append(pacient.getNume() + " nu are locuri disponiile");
			}
			
		}
		
		return sb.toString();
		
	}

}
