//left rotate the element
package ArrayPrograms;

public class AssignmentArray2 
{

	
	public static void main(String[] args)
	{
int arr[]= {1,2,3,4,5};
System.out.println("Number of length is"+arr.length);
System.out.println("Original aray is");
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
System.out.println();
System.out.println("after result");
int n=2;
for(int i=0;i<n;i++) 
{
	int j,first;
	first=arr[0];
for(j=0;j<arr.length-1;j++)

{

	arr[j]=arr[j+1];
}
arr[j]=first;
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
}
}