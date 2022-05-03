package Assignment;


public class FirstClass
{
	
	
  static int a=12;
  int b;
  
  static 
  {
	  System.out.println("My name is static block");
  }
  {
	  System.out.println("My name is non-static block");
  }

  //method overloading
  
  public static float Sum()
  {
	  int num=5, sum=0,i;
	  for(i=0;i<=num;i++)
	  {
		  sum=sum+i;
	  }
	  System.out.println("Sum Of Natural number is"+sum);
	  return sum;
	   }

  void Sum(int num1)
  {
	 int sum=0;
	 int rem;
	 int rev;
	 for(int i=0;i<=num1;i++)
	 {
		 rem=num1%10;
		 sum=sum+rem;
		 num1=num1/10;
		 
	 }
	 System.out.println("Sum of Digit is"+sum);
	 
  }
 
	  public static void main(String[] args) 
	  	{
	  		System.out.println("Program starts");

	        System.out.println(FirstClass.a);//Static global variable will print
	        int b=20;           //b initialize
	        System.out.println(b);//b print
	        FirstClass f1=new FirstClass();//non static block will print
	        f1.Sum(561);//non static method sum will p
	        System.out.println(FirstClass.Sum());
	        SecondClass s1=new SecondClass();
	        s1.main(args);
	        
	  	}
}
  class SecondClass
  {
	 int c=30;
     int d=200;
     
     static 
     {
     System.out.println("Static block of second class");

   }
     {
    	 System.out.println(" Non Static block of second class");

     }
      int Operations(int number1)
      {
    	  int rev=0,rem;
    	  while(number1!=0)
    	  {
    		  rem=number1%10;
    		  rev=rev*10+rem;
    		  number1=number1/10;
    		  
    	  }
    	  System.out.println("Reverse number is"+rev);
    	  return rev;
      }
      void Operations()
      {
    	  int rev=0;
    	  int num=151;
    	  int rem;
    	  int temp;
    	  temp=num;
    	  while(num!=0)
    	  {
    		  rem=num%10;
    		  rev=rev*10+rem;
    		  num=num/10;
    	  }
    	  if(temp==rev)
    	  {
    		  
    	  
    	  System.out.println("It is palindrome number");
  }
    	  else
    	  {
        	  System.out.println("It is not palindrome number");

    	  }
   
    	
    }
      
      public static void main(String[] args) 
  	{
  		
       SecondClass f2=new SecondClass();
        System.out.println(f2.c);
        System.out.println(f2.d);
        f2.Operations(123);
        f2.Operations();
        System.out.println("Program Ends");
        
  	}
	
     }


