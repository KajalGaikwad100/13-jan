package Assignment;

public class PrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrimenumber(3);
	}
	public  static void getPrimenumber(int num1)
	{
	   int i=2;
	    
	   while(i<=num1)
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
	  i++;
	}
}
