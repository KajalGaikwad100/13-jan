package ArrayPrograms;

public class Array15 {

	public static void main(String[] args) {
		int[] number= {10,20,30,40,50};
		System.out.println("number of length is"+number.length);

		int sum=0;
		int average=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		System.out.println("sum is"+sum);
	
average=sum/number.length;
System.out.println("average is"+average);

}
}