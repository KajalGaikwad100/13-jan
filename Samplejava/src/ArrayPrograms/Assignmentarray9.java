//print the of array largest number
package ArrayPrograms;

public class Assignmentarray9 {

	public static void main(String[] args)
	{
		//int max=0;
int arr[]= {1,2,3,4,5,6,7,8,9};
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
System.out.println();
System.out.println("Largest element is");

int max = arr[0];
for (int i = 1; i < arr.length; i++) {
	if (max < arr[i]) {// 
		max = arr[i];
	}
}
System.out.println("Max number in array is: "+max);
}

	}


