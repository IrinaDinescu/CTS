package ro.ase.cts.decorator;

public abstract class AbstractDecorator implements ICard {
	private ICard card;
	
	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();
		
	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();
		
	}
	
	public abstract void  platesteContactLess();

	public ICard getCard() {
		return card;
	}
	
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	}

}
