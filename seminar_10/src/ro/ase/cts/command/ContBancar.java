package ro.ase.cts.command;

public class ContBancar {
	
	private String detinator;
	private float suma;
	
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma = 0;
	}
	
	public void constituire(float suma) {
		System.out.println("Contul a fost constiuit");
		this.suma = suma;

	}
	
	public void retragere(float suma) {
		if(this.suma >= suma) {
			this.suma = this.suma - suma;
			System.out.println("O retragere a fost efectuata");
		}else {
			System.out.println("Nu dispuneti de fonduri suficiente!");
			
		}
	}
	
	public void depunere(float suma) {
		this.suma = this.suma + suma;
		System.out.println("Suma a fost depusa");
	}
	
	
	
	
}
