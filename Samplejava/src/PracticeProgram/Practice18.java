/*How to check whether given number is binary or not?
Write a java program to check whether given number is binary or not. \
A binary number is a number which contains only
0 or 1. For example : 101101, 110010110, 10010011 are binary numbers.*/
package PracticeProgram;

public class Practice18 {

	public static void main(String[] args) {
int num=101010;
int temp=num;
int rem=0;
while(num<0)
{
	rem=num%10;
}

if(rem>=1)
{
	System.out.println("Given number is not binary number");
}
else
{
	num=num/10;
	}

	}

}
