//Write a program that will read a float type value from the keyboard and print the following output.
//->Small Integer not less than the number.
//->Given Number.
//->Largest Integer not greater than the number.
package PracticeProgram;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
	double i=32.45;
	System.out.println("Small Integer not less than the number"+Math.ceil(i));
	System.out.println("Given number"+i);
	System.out.println("Largest number not greater than the number"+Math.floor(i));

	}

}
