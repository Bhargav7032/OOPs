package MethodOverload;

public class Cal {
   private int  sum(int a,int b) {
	return a+b;
   }
   private int  sum1(int a,int b,int c) {
		return a+b+c;
	   }
   
   private int sum2(int a,int b,int c, int d) {
	   return a*b*c*d;
   }
   public static void main(String[] args) {
	   Cal c=new Cal();
	   System.out.println(c.sum(23, 24));
	   System.out.println(c.sum1(23, 43, 45));
       System.out.println(c.sum2(4, 5, 6, 10));
	  
}
}
