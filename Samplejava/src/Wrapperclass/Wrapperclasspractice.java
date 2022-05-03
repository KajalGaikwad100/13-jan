package Wrapperclass;

public class Wrapperclasspractice {

	public static void main(String[] args)
	 {
		int a=50;
	  Integer s1 = new Integer(50);
	 try{
	

		 Integer s2 = new Integer("guarav");
	 }
	 catch(Exception e)
	 {
		 System.out.println("Number out of bound exception");
	 }
	 
	 // Integer s3 = new Integer('a');
	  
	  int g1 = s1.intValue(); // converting integer to int explicitly
	  System.out.println(g1);

	 }
}
