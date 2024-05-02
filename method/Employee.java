package method;

public class Employee {
	private static String Companyname;
	private static String CompanyAddress;
	
	private int    Empid;
	private String Empname;
	private double  Empsal;
	
	public void disply() {
	System.out.println("EmployeeId:"+Empid+" "+"EmployeeName:"+Empname+" "+"EmployeeSalary:"+Empsal+" "+"CompanyName:"+Companyname+"  "+"CompanyAddress:"+CompanyAddress);
	}
	
public static void main(String[] args) {
	Employee.Companyname="Tcs";
	Employee.CompanyAddress="Hyd";
	Employee emp =new Employee();
	emp.Empid=1002;
	emp.Empname="Bhargav";
	emp.Empsal=20000.00;
	emp.disply();
}
}
