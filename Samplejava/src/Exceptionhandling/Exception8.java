package Exceptionhandling;

import java.util.Scanner;

public class Exception8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts from here...");
		// 1. abnormal statements
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scn.nextInt();
		int[] empIds = new int[size];
		try {
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled.." + e);
		}
		System.out.println("Programs ends here...");
	}
	}


