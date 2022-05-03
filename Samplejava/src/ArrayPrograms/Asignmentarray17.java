//remove duplicate element of an array
package ArrayPrograms;

public class Asignmentarray17 {

	public static void main(String[] args) {
int arr[]={2,3,4,6,4,7,3,4};

System.out.println("Length of array is"+arr.length);
System.out.println("Element of the array is");
for(int i=0;i<arr.length;i++)
{
	System.out.print("  "+arr[i]);
}
System.out.println();
for(int i=0;i<arr.length;i++)
{
	int j,first;
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			
		
			System.out.print("  "+arr[j]);
		}
	}
}
	}

}
