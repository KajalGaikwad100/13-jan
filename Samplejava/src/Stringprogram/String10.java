package Stringprogram;

public class String10 {

	public static void main(String[] args) {
String s="Kajal Gaikwad";
System.out.println("Original string is :"+s);
String starr[]=s.split(" ");
for(String str:starr)
{
	System.out.println(str);
}
for(int i=starr.length-1;i>=0;i--)
{
	System.out.print(" "+starr[i]);
}

	}

}
