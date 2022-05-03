/* How to find intersection of two arrays in java?
Write a java program to find intersection of two arrays or common elements between the two arrays.*/
package PracticeProgram;

public class Practice19 {

	public static void main(String[] args) {
int arr1[]= {1,2,3};
int arr2[]= {2,3,4};
System.out.println("Array 1 elements are"+arr1);
System.out.println("Array 2 elements are"+arr2);
System.out.println("Duplicates elements are");
for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		if(arr1[i]==arr2[j])
		{
			System.out.println(+arr2[j]);
		}
	}
}
	}

}
