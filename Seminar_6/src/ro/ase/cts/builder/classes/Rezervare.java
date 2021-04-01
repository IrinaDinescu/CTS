package ro.ase.cts.builder.classes;

import ro.ase.cts.builder.classes.Builder;
import ro.ase.cts.builder.classes.Rezervare;

public class Rezervare {
	
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public static class Builder implements IBuilder{
		
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
	
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public void setGenMuzica(String getMuzica) {
		this.genMuzica = getMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", getMuzica=" + genMuzica + ", codRezervare="
				+ codRezervare + "]";
	}
	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzicaAmbientala,  String getMuzica,
			int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = getMuzica;
		this.codRezervare = codRezervare;
	}
	
	

}
