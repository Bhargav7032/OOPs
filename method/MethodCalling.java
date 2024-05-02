package method;

public class MethodCalling {
	
	 //Method Block//
	
	public void method() {
		System.out.println("Method Block");
	}

	   //Instance Block//
	    
{
	System.out.println("Instance Block");
}

      //Constructor Block//

   public void methodCalling(){
	System.out.println("Constructor Block");
	}
   
       //static Block//
   
   static{
	   System.out.println("static Block");
   }
   
  public static void main(String[] args) {
		MethodCalling mc = new MethodCalling();
		mc.methodCalling();
		mc.method();
	
}
}

