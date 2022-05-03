package Exceptionhandling;



	class UserDefinedException extends Exception {
		public UserDefinedException(String str) {
			// Calling constructor of parent Exception
			super(str);
		}
	

	//Class that uses above MyException  
		public static class Exception15 {

		public static void validateAge(int age) throws UserDefinedException {
			if (age < 18) {
				// throw Arithmetic exception if not eligible to vote
				throw new UserDefinedException("Person is not eligible to vote");
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}

		public static void main(String args[]) {
			try {
				// throw an object of user defined exception
				throw new UserDefinedException("This is user-defined exception");
			} catch (UserDefinedException ude) {
				System.out.println("Caught the exception");
				// Print the message from MyException object
				System.out.println(ude);
				// System.out.println(ude.getMessage());
				// ude.printStackTrace();
			}
			try {
				validateAge(25);
			} catch (UserDefinedException e) {
				System.out.println(e);
			}
		}
	}
	}