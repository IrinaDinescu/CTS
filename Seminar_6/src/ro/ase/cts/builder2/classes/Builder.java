package ro.ase.cts.builder2.classes;

public class Builder implements IBuilder{
	
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	
	
	
	
	public Builder setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}





	public Builder setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}





	public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}





	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}





	public Builder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}





	public Builder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	
	





	public Builder() {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = 0;
	}





	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(
				this.mancareInclusa, this.scaunErgonomic, this.muzicaAmbientala, this.bauturaRacoritoare,
				"gen", 4);
		return rezervare;
	}
	

}
