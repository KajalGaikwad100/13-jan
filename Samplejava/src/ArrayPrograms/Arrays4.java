package ArrayPrograms;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		int[] num1= {10,90,30,40};
		for(int i=0;i<num1.length;i++)
		{
			System.out.println(num1[i]);
		}
		System.out.println("***************");
		for(int j:num1)
		{
			System.out.println(j);
		}
	System.out.println("Printing clone of the array");
	int[] cnum1=num1.clone();
	
	for(int j:cnum1)
	{
		System.out.println(j);
	}
	System.out.println("***************");
System.out.println("Are both equal");
System.out.println(Arrays.equals(num1, cnum1));
System.out.println("***************");


int num3[]=Arrays.copyOf(num1, num1.length);
System.out.println(num3.length);
System.out.println("***************");

for(int j:num3)
{
	System.out.println(j);
}
System.out.println("***************");

int num4[]=Arrays.copyOfRange(num1, 0, 3);
System.out.println(num4.length);
for(int i=0;i<num4.length;i++)
{
	System.out.println(num4);
}
System.out.println("***************");
Arrays.sort(num1);
System.out.println("Sorting arrays is");
for(int j:num1)
{
	System.out.println(j);
}
	}

}
