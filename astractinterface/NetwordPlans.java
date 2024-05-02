package astractinterface;

public class NetwordPlans implements Network {

	@Override
	public void Aritel() {
		System.out.println("Aritel: Rc 265 unlimited call p/d 1.5 gb p/d 100 sms");
		
	}

	@Override
	public void Vi() {
		System.out.println("Vi: Rc 198 unlimited call p/m 3gb p/m 100 sms");
		
	}

	@Override
	public void jio() {
		System.out.println("jio: Rc 299 unlimited call p/d 2.5 gb p/d 100 sms");

		
	}

	

}
