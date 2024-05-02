package methodoverriding;

public class AXIS  extends Bank{
	int getRateofInterest() {
		return 10;
	}
public static void main(String[] args) {
	Bank bank=new Bank();
	bank.getRateOfInterest();
	
	ICIC ic = new ICIC() ;
	ic.getRateOfInterest();
	
	SBI sbi=new SBI();
	sbi.getRateOfInterest();
	
	AXIS ax=new AXIS();
	ax.getRateofInterest();
	
	System.out.println("BANK INTEREST : "+ bank.getRateOfInterest());
	System.out.println("ICIC INTEREST : "+ ic.getRateOfInterest());
	System.out.println("SBI  INTEREST : "+ sbi.getRateOfInterest());
	System.out.println("AXIS INTEREST : "+ ax.getRateOfInterest());

}
}

