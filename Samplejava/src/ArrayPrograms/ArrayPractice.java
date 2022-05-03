package ArrayPrograms;

import java.util.Arrays;

public class ArrayPractice {

	
	public static void main(String[] args) {
int arr[]=new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
System.out.println("Array length is "+arr.length);
System.out.println("****************");
System.out.println("array element is");
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
System.out.println();
System.out.println("********************");

int []arr1= {50,60};
System.out.println("Array length is "+arr1.length);
System.out.println("****************");
System.out.println("array element is");
for(int i=0;i<arr1.length;i++)
{
	System.out.print(" "+arr1[i]);
}
System.out.println();
System.out.println("********************");

int arr3[]=Arrays.copyOf(arr1, 4);
System.out.println("Array length is "+arr3.length);
System.out.println("****************");
System.out.println("array element is");
for(int i=0;i<arr3.length;i++)
{
	System.out.print(" "+arr3[i]);
}
System.out.println();
System.out.println("********************");

int min=arr[0];
for(int i=0;i<arr.length;i++)
{
	if(min>arr[i])
	{
		min=arr[i];
	}
}
	System.out.println("Minimum number is"+min);
	System.out.println();
	System.out.println("********************");
int []arr2= {3,6,89,90,100,6,9};
int max=arr[0];
for(int i=0;i<arr2.length;i++)
{
	if(max<arr2[i])
	{
		max=arr2[i];
	}
}
System.out.println("Maximum number is"+max);
System.out.println();
System.out.println("********************");
Arrays.sort(arr2);
for(int i=0;i<arr2.length;i++)
{
System.out.println("Sorting array is"+arr2[i]);
		}

}
}