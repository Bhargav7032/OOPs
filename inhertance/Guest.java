package inhertance;

public class Guest {
public static void main(String[]args) {
	
	User user=new User();
	 user.read();
	 
 Developer dev= new Developer();
 dev.write();
 dev.read();
	 
	 Admin admin= new Admin();
	 admin.manage();
	 admin.write();
	 admin.read();
}

}
