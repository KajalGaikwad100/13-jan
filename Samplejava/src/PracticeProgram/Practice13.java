//How to find second largest number in an integer array?
//Write a java program to find second largest number in an array of numbers.
package PracticeProgram;

public class Practice13 {

	public static void main(String[] args) {
int arr[]= {3,7,9,1,6};
int temp;
int size=arr.length;
int max=arr[0];
System.out.println("Array elements are "+arr.length);
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
		if(arr[i]>arr[j]);
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}	
System.out.println("Second largest elemnts are "+arr[size-2]);
	}

}
