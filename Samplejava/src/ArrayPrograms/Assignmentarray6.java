//java programs to print reverse array 
package ArrayPrograms;

public class Assignmentarray6 {

	public static void main(String[] args) {
int arr[]={1,2,3,4,5};
System.out.println("elements of array is");
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
System.out.println();
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(" "+arr[i]);
}
	}

}
