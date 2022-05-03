package Day1;

public class Palindrome2 {

	public static void main(String[] args) {
		
		getPalindrome(151);
	}
 public static void getPalindrome(int num)
 {
	 int rev=0,rem;
	 int original_num=num;
	 System.out.println("Original number is"+num);
	 
	 while(num!=0)
	 {
		 rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
	 }
	 if(original_num==rev)
	 {
		 System.out.println("Not Palindrome number");
	 }
	 else
	 {
		 System.out.println(" Palindrome number");
	 }
 }
}
