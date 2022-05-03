/*How to find sum of all digits of a number in java?
Write a java program to find sum of all digits of a given number.*/
package PracticeProgram;

public class Practice12 {

	public static void main(String[] args) {
int arr[]= { 1,2,3,4,5};
int sum=0;
System.out.println("Array length are  "+arr.length);
System.out.println("*******************");
for(int i=0;i<arr.length;i++)
{
	sum=sum+arr[i];
}
	System.out.println("Sum of array is "+sum);
}
}