package Assignment;

public class QotientRem {

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("Qoutient is"+getQou(20,5));
		System.out.println("Remainder is"+getrem(20,4));
		

		System.out.println("Program ends");

	}
	public static int getQou(int a,int b)
	{
		int qoutient=a%b;
		//System.out.println("Quotient is"+qoutient);
		return qoutient;
	}
	public static int getrem(int c,int d)
	{
		int rem=c/d;
		//System.out.println("remainder is"+rem);
		return rem;
	}

}
