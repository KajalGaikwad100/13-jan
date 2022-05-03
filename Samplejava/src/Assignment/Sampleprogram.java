package Assignment;

public class Sampleprogram {

	
	static int age=25;
	static double salary=35000.00;
	
	static
	{
		System.out.println("I am Static Block");
	}
	{
		System.out.println("I am Non Static Block");
	}
	
	public static char Alphabates()
	{
		char i;
		for(i='a';i<='z';i++)
		{
	
			
				System.out.print(" "+i);
			
		}
		return i;
	}
	void Alphabates(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		{
			System.out.println("It is Vowel ");
		}
		else
		{
			
		
		System.out.println("It is Consonent ");

		}
			
			
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampleprogram s1=new Sampleprogram();
		System.out.println(Sampleprogram.Alphabates());
	s1.Alphabates('r');
	}

}
