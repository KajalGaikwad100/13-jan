package Assignment;

public class factorpositive {

	public static void main(String[] args) {
		getfactors(15);
	}
public static void getfactors(int num)
{
	int i;
	
	for (i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.println("Factors is"+i);
		}
	}
}
}
