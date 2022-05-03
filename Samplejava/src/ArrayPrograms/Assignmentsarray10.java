//print the of array smallest number
package ArrayPrograms;

public class Assignmentsarray10 {

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

int min = arr[0];
for (int i = 1; i < arr.length; i++) {
	if (min > arr[i]) {// 
		min = arr[i];
	}
}
System.out.println("Min number in array is: "+min);
}

	}


