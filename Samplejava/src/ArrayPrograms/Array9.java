package ArrayPrograms;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {

		int []num1=new int[3];
		
		num1[0]=50;
		num1[1]=20;
		num1[2]=30;
	
		for(int i=0;i<num1.length;i++)
		{
			System.out.println(num1[i]);
		}
		System.out.println("***************");
		int num2[]=num1.clone();
		for(int i: num2)
		{
			System.out.println(i);
		}
		System.out.println("Are both equals");
		System.out.println(Arrays.equals(num1, num2));
		 int num3[]= Arrays.copyOf(num1,2);
		 for(int i:num3)
		 {
			 System.out.println(i);
		 }
			System.out.println("***************");

		 Arrays.sort(num1);
		 for(int i:num1)
		 {
			System.out.println(i);
		 }
		 int num4[]=Arrays.copyOfRange(num1, 2, 3);
		 for(int i:num4)
		 {
			 System.out.println(i);
		 }
		 
	}

}
