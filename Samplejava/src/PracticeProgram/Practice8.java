//How do you check the equality of two arrays in java?
//Write a java program to check the equality of two arrays using different methods.
package PracticeProgram;

import java.util.Arrays;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int arr2[]=arr.clone();
int arr1[]=Arrays.copyOf(arr, 5);
System.out.println(arr.length);
System.out.println(arr1.length);
System.out.println(Arrays.equals(arr, arr1));
System.out.println(Arrays.equals(arr, arr2));


	}

}
