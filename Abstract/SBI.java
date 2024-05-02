package Abstract;

public class SBI  extends Bank{

	@Override
	public void personalloan() {
	System.out.println("personalloan 10.5%");
		
	}

	@Override
	public void Cardloan() {
		System.out.println("cardlloan 16.0%");
		
	}

	@Override
	public void Homeloan() {
		System.out.println("Homeloan 14.0%");
		
	}

}
