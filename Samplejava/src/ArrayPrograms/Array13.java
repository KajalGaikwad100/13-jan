package ArrayPrograms;

public class Array13 {

	public static void min(int[] arr)
	{
		int min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(min>arr[i])
			 {
				 min=arr[i];
			 }
		 }
		 System.out.println("minimum number is"+min);
		
	}
	static void max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum number is"+max);
	}
	public static void main(String[] args) {
int[] a= {20,72,10,28,11};
Array13.min(a);
Array13.max(a);

	}

}
