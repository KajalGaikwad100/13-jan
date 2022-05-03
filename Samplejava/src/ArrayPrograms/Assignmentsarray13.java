//sort the array element
package ArrayPrograms;

import java.util.Arrays;

public class Assignmentsarray13 {

	public static void main(String[] args) {
int arr[]= {5,4,3,2,1};
 System.out.println(arr.length);
 System.out.println("elements of array is");
 for(int i=0;i<arr.length;i++)
 {
	 System.out.print(" "+arr[i]);
 }
 System.out.println();
 Arrays.sort(arr);
 for(int n:arr)
 {
	 System.out.print(" "+n);
 }
	}

}
