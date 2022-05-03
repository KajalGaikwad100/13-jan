//Write a Java Program to reverse a String?
package PracticeProgram;

public class Practice3 {

	public static void main(String[] args) {
String str="Gaikwad";
System.out.println("Original string is"+str);
String temp=" ";
for(int i=str.length()-1;i>=0;i--)
{
	temp=temp+str.charAt(i);
}
System.out.println("Reversed string is"+temp);

	}

}
