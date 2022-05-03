package Assignment;

public class ReverseNumWhile {

	public static void main(String[] args) {
		getreversenum(123);
	}
	public static void getreversenum(int num)
	{
		int i;
		int digit;
		int rev=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed number is"+rev);
		
	}

}
