package Encapsulation;

public class Student {
private int rollnumber;
private	String Name; 
private	boolean isAttended;
	
	public Student(int rollnumber) {
		this.rollnumber=rollnumber;
	}
	
public int getRollnumber() {
		
	return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

public void setStudentAttended(boolean flag) {
	if (isAttended) {
		
	}
	isAttended=flag;
	System.out.println("teacher assined attendence to student");
}
public boolean getStudentAttendence() {
	System.out.println("teacher acessed  student");
	return isAttended;
}
}
