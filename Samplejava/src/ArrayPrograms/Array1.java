package ArrayPrograms;

import java.util.Arrays;

public class Array1 
{
	


	public static void main(String[] args) {
		int[] num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		int[] num2= {50,60};
		{
		System.out.println(num2.length);
		
		}
		System.out.println("**************************");
		int[] num3=Arrays.copyOf(num2, 5);
		System.out.println("size of num2 : "+num3.length);
		for(int i=0;i<num3.length;i++) {
			System.out.println("element in index "+i+": "+num3[i]);
		}
		
		int[] num4=new int[5];
	
num4=Arrays.copyOf(num2,5);
System.out.println(num4.length);
System.out.println(num4[0]);
System.out.println(num4[1]);
System.out.println(num4[2]);
System.out.println(num4[3]);
System.out.println(num4[4]);




for(int j=0;j<num2.length;j++)
{
	System.out.println(num[j]);
}
	}

}
