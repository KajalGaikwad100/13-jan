//Copy all the elements from one element to another
package ArrayPrograms;

import java.util.Arrays;

public class AssinmentArray1 {

	public static void main(String[] args) {
int num1[]=new int[3];
num1[0]=25;
num1[1]=95;
num1[2]=45;
System.out.println("Length of array is"+num1.length);
for(int i:num1)
{
	System.out.println(i);
}
int num2[]=Arrays.copyOf(num1, 3);
System.out.println("After coping all the element in num2");
for(int j:num2)
{
	System.out.println(j);
}
	}

}
