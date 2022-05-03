package Day1;

public class Practice {
	int a = 5; // Non Static Globle Variable
	static int b = 10; // Static Globle Variable

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Practice p1 = new Practice(); // Creation of object to access non-static global variable.
		System.out.println(p1.a); // for printing a
		System.out.println(b); // its Static global variable no need o create object.

		b = 15;
		System.out.println(b);
		int a = 20;
		System.out.println(a);

		getmultnum(10, 20); // calling static method
		System.out.println(getmultnum(10, 20));// print on console
		getmultnum();
		// System.out.println();//print on console
		p1.Display();
		p1.getmultnum1(30, 30);

		NewClass p2 = new NewClass();
		p2.myMethod1(20, 20);

		System.out.println(Function.Myconcepts(10, 10));

	}

	public static int getmultnum(int num1, int num2) {

		int res = num1 * num2;
		System.out.println("the result is" + res);

		return res;
	}

	public static int getmultnum() {
		int c = 20, d = 20;
		int res1 = c * d;
		System.out.println("Mulipication is" + res1);

		return res1;
	}

	void Display() {
		System.out.println("This is my Practice Program");

	}

	public int getmultnum1(int r, int s) {
		int res2 = r * s;
		System.out.println(res2);
		return res2;

	}
}

class NewClass {
	int myMethod1(int var1, int var2) {
		int res3 = var1 + var2;
		System.out.println("Addition is" + res3);

		return res3;

	}

}

class Function {
	public static double Myconcepts(int s, double y) {
		double res5 = s / y;
		System.out.println("division is" + res5);
		return res5;

	}
}
