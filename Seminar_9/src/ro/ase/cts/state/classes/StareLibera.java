package ro.ase.cts.state.classes;

public class StareLibera implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa a fost eliberata ");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa este deja libera");
		}
		
	}

}
