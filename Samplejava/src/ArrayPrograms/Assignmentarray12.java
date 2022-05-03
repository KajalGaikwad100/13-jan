//left rotate element
package ArrayPrograms;

public class Assignmentarray12 
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
	int j,last;
	last=arr[arr.length-1];
  for(j = arr.length-1; j > 0; j--)  

{

	arr[j]=arr[j-1];
}
arr[0]=last;
}
System.out.println();
for(int i=0;i<arr.length;i++)
{
	System.out.print(" "+arr[i]);
}
}
}