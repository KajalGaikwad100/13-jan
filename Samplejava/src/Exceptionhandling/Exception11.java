package Exceptionhandling;

public class Exception11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// catch won't be executed
		catch (ArithmeticException e) {
			System.out.println("Exception handled...");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	

	}

}
