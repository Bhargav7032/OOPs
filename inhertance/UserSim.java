package inhertance;

public class UserSim {

	public static void main(String[] args) {
		
		System.out.println(" <.....TwoGsim.....> ");
		TwoGsim sim= new TwoGsim();
		sim.Calling();
		sim.Sms();
		
		System.out.println(" <.....ThreeGsim.....> ");
		
		ThreeGsim threesim=new ThreeGsim();
		threesim.Sms();
		threesim.Calling();
		threesim.Gprs();
		
		System.out.println(" <.....ForeGsim.....> ");
		
		ForeGsim foresim=new ForeGsim();
		foresim.Calling();
		foresim.Sms();
		foresim.Gprs();
		foresim.Hplus();
		foresim.Votle();
		
		System.out.println(" <.....FiveGsim.....> ");
		
		FiveGsim fivesim=new FiveGsim();
		fivesim.Calling();
		fivesim.Sms();
		fivesim.Gprs();
		fivesim.Hplus();
		fivesim.Votle();
		fivesim.fiveG();
		fivesim.fiveGpuls();
	}

}
