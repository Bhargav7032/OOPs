package methodoverriding;

public class Bike extends Vehicle {
	void run() {
   System.out.println("Bike is running safely");
	}
public static void main(String[] args) {
//	Vehicle vehicle=new Vehicle();
//	vehicle.run();
	Bike bike =new Bike();
	bike.run();
	
	
	
}
}
