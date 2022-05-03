/*How to find duplicate elements in an array?
Write a java program to find duplicate elements in the given array.*/
package PracticeProgram;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,1,2,3,5,5};

System.out.println("length of array is"+arr.length);
System.out.println("Array elements are");
for(int arr1:arr)
{
	System.out.print(" "+arr1);
}
System.out.println();
System.out.println("Duplicates elements are");
for(int i=0;i<arr.length;i++)
{
	int first,count=1;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			count++;
			System.out.println("  "+arr[j]+"|| "+count);
		}
	}
}
	}

}
