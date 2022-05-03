package Stringprogram;

public class String9 {

	public static void checkpalindrome(String str)
	{
		String str1=str;
		String Temp="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			Temp=Temp+str1.charAt(i);
		}
		if(Temp.equals(str1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String9.checkpalindrome("NuN");

String s3="Kajal";
String s4="Thube";

System.out.println("Enter string "+s3.length());
System.out.println("Enter characters from:"+s3.charAt(2));
System.out.println("Substring from:"+s3.substring(3));
System.out.println("Substring from:"+s3.substring(1,4));

System.out.println("String first is" +s3);
System.out.println("String first is" +s4);
System.out.println("Concat of string is  "+s3.concat(s4));
System.out.println("String first is" +s3);
System.out.println("String first is" +s4);

String s5="Try Try dont cry";
System.out.println("Index of try starts from: "+s5.indexOf("Try"));
System.out.println("Index of try starts from :"+s5.indexOf('T',1));


System.out.println("Index of try starts from :"+s5.indexOf("Try",3));
 System.out.println("Convert in lowercase :"+s3.toLowerCase());
 
 System.out.println("Convert in uppercase :"+s3.toUpperCase());
 
 System.out.println("Trim the string:"+s5.trim());
 String s6=s3.replace('a','x');
 System.out.println("Replace the sting:-"+s6);

String s7=" ";
System.out.println("Check string is empty"+s7.isEmpty());
String s8="";
System.out.println("Check string is empty"+s8.isEmpty());

String s9=new String();

System.out.println("Check string is empty"+s9.isEmpty());


	}

}
