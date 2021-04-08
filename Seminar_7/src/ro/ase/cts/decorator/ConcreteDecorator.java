package ro.ase.cts.decorator;

public class ConcreteDecorator extends AbstractDecorator{

	public ConcreteDecorator(ICard card) {
		super(card);
		
	}

	@Override
	public void platesteContactLess() {
		System.out.println(super.getCard().getDetinatorCard() + " plateste contactless ");
		
	}


	
	
	

}
