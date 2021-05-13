package ro.ase.cts.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect{
	
	private List<Observer> observeri;
	private String numeSala;
	
	
	public Sala(String numeSala) {
		super();
		this.observeri = new ArrayList();
		this.numeSala = numeSala;
	}
	@Override
	public void aboneazaClient(Observer observer) {
		observeri.add(observer);
		
	}
	@Override
	public void dezaboneazaClient(Observer observer) {
		observeri.remove(observer);
		
	}
	@Override
	public void trimiteMesasj(String mesaj) {
		for(Observer obs : observeri) {
			obs.recptionareMesaj(numeSala + ": " + mesaj);
		}
		
	}
	
	public void anuntaMeci() {
		trimiteMesasj("Urmeaza un meci de fotbal");
	}
	

}
