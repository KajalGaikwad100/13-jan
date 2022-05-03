package Assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		getPrimenumber(12);
	}
	public  static void getPrimenumber(int num1)
	{
	   int i=2;
	    
	   for(i=2;i<=num1;i++)
	   {
		   if(num1%i==0)
		   {
			   System.out.println("It is not prime number");
			   break;
		   }
		   else
		   {
			   System.out.println("it is prime number");
			   break;
		   }
		   
	   }
	  
}
}