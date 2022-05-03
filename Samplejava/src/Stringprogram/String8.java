package Stringprogram;

public class String8 {

	public static void main(String[] args) {

		String str="My name is Kajal";
	System.out.println("Actual String is:"+str);
	String strarr[]=str.split(" ");
	for(String s:strarr)
	{
		System.out.println(s);
	}
	System.out.println("****************");
	String str1="I am living in Panvel";
	String strarr1[]=str1.split(" ",3);
	for(String s1:strarr1)
	{
		System.out.println(s1);
	}
	String str3="I am from nagar";
	System.out.println("Actual string is"+str3);
	String strarr4[]=str3.split(" ");
	String temp="";
	for(int i=strarr4.length-1;i>=0;i--)
	{
		temp=temp+" "+strarr4[i];
	}
	System.out.println("Reverse statement is"+temp);
	
String s4="   I am vishal    ";
System.out.println("Actual string is:"+s4);
System.out.println("Length of string is"+s4.length());
System.out.println(s4.trim());
System.out.println(s4.trim().length());

System.out.println("*************************************************");
String s2="MUMBAI";
String temp1="";
System.out.println("Original string is:"+s2);
for(int i=0;i<s2.length();i++)
{
	System.out.println(s2.charAt(i));
}
//
for(int i=s2.length()-1;i>=0;i--) {
	temp1=temp1+s2.charAt(i);
}
System.out.println("String: "+s2);
System.out.println("Temp1: "+temp1);

}
}