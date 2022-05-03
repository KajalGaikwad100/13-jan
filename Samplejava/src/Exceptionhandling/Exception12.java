package Exceptionhandling;

public class Exception12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println("Inside the try block");

			// below code throws divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("I am inside finally block");
			int k=10/0;
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}

	

}
