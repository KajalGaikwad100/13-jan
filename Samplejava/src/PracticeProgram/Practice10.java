/*Armstrong number program in java
Write a java program to check whether a given number is Armstrong number or not.
A number is called an Armstrong
number if it is equal to sum of its digits each raised to the power of number 
of digits in it. For example: 153, 9474, 54748
are some Armstrong numbers.*/
package PracticeProgram;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int temp=num;
int rev=0,rem=0,res=0;
while(num>0)
{
	rem=num%10;
	res=res+(rem*rem*rem);
	num=num/10;
}
if(res==temp)
{
	System.out.println("number is armstrong");
}
else
{
	System.out.println("Number is not armstrong");
}
}

}
