package ro.ase.cts.decorator;

public class Card implements ICard{

    public String detinatorCard;
	
	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
		
	}

	@Override
	public void platesteOnline() {
		
		
	}

	@Override
	public void platesteFizic() {
		
		
	}

	public String getDetinatorCard() {
		return detinatorCard;
	}
	
	
	

}
