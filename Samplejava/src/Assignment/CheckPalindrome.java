package Assignment;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkpalindrome("WOW");
	}
public static void checkpalindrome(String str)
{
	int i;
	String rev="";

	System.out.println("original_string"+str);
	for( i=str.length()-1;i>=0;i--)
			
	{
		rev=rev+str.charAt(i);
		 }
		 if(str.equals(rev))
		 {
			 System.out.println("Palindrome String");
		 }
		 else
		 {
			 System.out.println("Not Palindrome String");
			 
		 }
	
}
}
