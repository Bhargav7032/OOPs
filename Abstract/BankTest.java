package Abstract;
public class BankTest {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("......<<..SBI..>>.........");
		Bank bank = new SBI();
		bank.personalloan();
		bank.Homeloan();
		bank.Cardloan();
		bank.RateofRto();

		
		System.out.println();
		System.out.println("......<<..Aixs..>>.........");
		Bank bank1 = new Aixs();
		bank1.personalloan();
		bank1.Homeloan();
		bank1.Cardloan();
		bank1.RateofRto();
		
		
		System.out.println();
		System.out.println("......<<..ICIC..>>.........");
		Bank bank2 = new ICIC();
		bank2.personalloan();
		bank2.Homeloan();
		bank2.Cardloan();
		bank2.RateofRto();
	  

	}

}
