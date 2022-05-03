package Scanner;

import java.util.Scanner;

public class Scannerclass4 {

	public static void main(String[] args) {

		Scanner scref=new Scanner(System.in);
		int no;
		double sal;
		char ch;
		String str;
		
		System.out.println("get no from console");
		no=scref.nextInt();
		System.out.println("Get Salary from console");
		sal=scref.nextDouble();
		System.out.println("Get character from console");
		ch=scref.next().charAt(0);
		System.out.println("get String from console");
		str=scref.next();
		System.out.println("no is:"+no);
		System.out.println("sal is:"+sal);
		System.out.println("ch is:"+ch);
		System.out.println("str is:"+str);

	}

}
