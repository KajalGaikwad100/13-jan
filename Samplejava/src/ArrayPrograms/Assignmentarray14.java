//sort the element is descending order
package ArrayPrograms;

public class Assignmentarray14 {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5};
System.out.println(arr.length);
System.out.println("Original array is");
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
//System.out.println();
System.out.println();
System.out.println("Elements in descending order");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(" "+arr[i]);
}

	}

}
