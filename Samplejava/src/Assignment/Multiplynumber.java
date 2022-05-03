package Assignment;

public class Multiplynumber {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		float res2=Multiplynumber.getMultiplication(10,15);
		System.out.println("Multiplication is"+res2);

	}
	public static float getMultiplication(float a,float b)
	{
		float res=a*b;
		return res;
	}

}
