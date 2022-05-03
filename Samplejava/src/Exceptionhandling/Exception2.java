package Exceptionhandling;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		try{
			System.out.println("Enter first num1: ");
			i=scn.nextInt();
			System.out.println("Enter first num2: ");
			j=scn.nextInt();
			k= i/j;//ArithmeticException
			System.out.println("res: "+k);
		}catch(ArithmeticException obj) {
			System.out.println("Exception handled"+obj);
			//obj.printStackTrace();
		}		
		System.out.println("Programs ends here...");
	}

}
