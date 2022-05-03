package Day1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetReverseNumber(123);
	}
public static void GetReverseNumber(int num)
{
	int rev=0;
	System.out.println("Original Number is"+num);
	
	while(num!=0)
	{
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	
	}
	System.out.println("Reversed Number is"+rev);
}
}
