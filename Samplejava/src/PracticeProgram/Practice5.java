// How to create a pyramid of numbers in java?
//Write a java program to create a pyramid of numbers in different patterns.
package PracticeProgram;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
for(i=0;i<=8;i++)
{
	for(j=8-i;j>=0;j--)
	{
		
System.out.print(" ");
	}
	for(j=1;j<=i;j++)
	{
System.out.print(" 1");
}
	System.out.println( );
}
}
}