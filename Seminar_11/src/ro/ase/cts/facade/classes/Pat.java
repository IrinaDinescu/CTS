package ro.ase.cts.facade.classes;

public class Pat {
	
	private int nrPat;
	private boolean liber;
	
	public Pat(int nrPat, boolean liber) {
		super();
		this.nrPat = nrPat;
		this.liber = liber;
	}

	public int getNrPat() {
		return nrPat;
	}

	public void setNrPat(int nrPat) {
		this.nrPat = nrPat;
	}

	public boolean isLiber() {
		return liber;
	}

	public void setLiber(boolean liber) {
		this.liber = liber;
	}
	
	

}
