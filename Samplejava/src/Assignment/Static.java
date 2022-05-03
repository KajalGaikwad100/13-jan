package Assignment;


public class Static {
	
	static
	{
		System.out.println("ABCD");
	}
	
	{
		System.out.println("Non Static Method");
	}

	public static void main(String[] args)
	{
		System.out.println("Program starts");

		Static s1=new Static();	
System.out.println("Program ends");
	}
	static
	{
		System.out.println("ABCD");
	}
	{
		System.out.println("Non Static Method");
	}

}
