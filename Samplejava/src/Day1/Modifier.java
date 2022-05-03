package Day1;

public class Modifier {
	
static int a=10;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		double sum=getAdditionDetails(25,1000);
		System.out.println("Addition is"+sum);

		sum=getAdditionDetails(31,65000);
		System.out.println("Addition is"+sum);

		System.out.println("Program Ends");

		// TODO Auto-generated method stub

	}

	static double getAdditionDetails(int num1,int num2)
	{
		/*System.out.println("Hi Good Morning Everyone");
		System.out.println("I am"+age+"yrs old");
		System.out.println("I am getting"+salary);
		return;*/
		double res=num1+num2;
		return res;



	}
}
