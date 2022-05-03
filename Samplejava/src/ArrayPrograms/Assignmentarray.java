//second largest element in array
package ArrayPrograms;

public class Assignmentarray {

	public static void main(String[] args) {
		int temp,size;
int arr[]= {7,2,3,4,5};
size=arr.length;
System.out.println(arr.length);
System.out.println("Elements of an array");
for(int i=0;i<size;i++)
{
	System.out.print(" "+arr[i]);
}
for(int i=0;i<size;i++)
{
	for(int j=i+1;j<size;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}
System.out.println("second largest element is"+arr[size-2]);
	}

}
