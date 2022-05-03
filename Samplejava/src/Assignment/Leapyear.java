package Assignment;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkleapyear(1001);
	}
public static void checkleapyear(int year)
{
	if(year%4==0)
	{
		System.out.println("Its a leap year");
	}
	else
	{
		System.out.println("Its not leap year");

	}
}
}
