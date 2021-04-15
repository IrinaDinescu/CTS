package ro.ase.cts.composite.classes;

public class Item implements IOptiuniMeniu {
	
	
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	String numeItem;

	@Override
	public void adaugaNod(IOptiuniMeniu optiune) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Ex");
	}

	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Ex");
	}

	@Override
	public IOptiuniMeniu getNod(int index) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Ex");
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		
	}
}