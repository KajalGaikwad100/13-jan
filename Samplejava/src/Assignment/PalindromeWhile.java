package Assignment;

public class PalindromeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome(121);
	}
	public static void CheckPalindrome(int num)
	{

int rem,temp;
int sum=0;
temp=num;
 System.out.println("Original number is"+num);
	 
	 while(num>0)
	 {
		 rem=num%10;
		 sum=sum*10+rem;
		 num=num/10;
	 }
	 if(temp==sum)
	 {
		 System.out.println("Palindrome number");
	 }
	 else
	 {
		 System.out.println("Not Palindrome number");
	 }
}
}
