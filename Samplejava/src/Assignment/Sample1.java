package Assignment;

public class Sample1{
	int i = 28;

	Sample1() {
		System.out.println("contructor Cons5() is ");
	}

	void dispaly() {
		System.out.println("dispaly method is" );
	}

public static void main(String[] args) {
	System.out.println("Program start");
	Sample1 e1 = new Sample1();
	e1.dispaly();
	System.out.println("class A global variable i=" + e1.i);
	X e2 = new X();
	e2.display();
	System.out.println("class X global variable j=" + e2.j);
	F e3 = new F();
	e3.display();
}
}

class X {

	int j = 65;

	X() {
		System.out.println("contructor X() is");
	}

	void display() {
		System.out.println("dispaly method is " );
	}

}

class F {

	void display() {
		System.out.println("dispaly method of F");

	}

	
}
	