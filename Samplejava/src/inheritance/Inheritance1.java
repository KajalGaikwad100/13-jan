package inheritance;



class A {
A(){
	
}

	static int a = 25;
	int b = 45;
	double c = 56.6;

}

class B extends A{
		B() {
		super();
	}

	static int x = 65;
	int y = 65;
	double z = 34.78;

}

class C extends B {
C() {
	super();
}
	

	static int p = 87;
	int q = 23;
	double r = 78.8;
}

public class Inheritance1 {

	public static void main(String[] args) {
		System.out.println("program start");
		// access static member of class A
		System.out.println("static variable of class A a= " + A.a);
		// access static member of class B
		System.out.println(" Static variable of class B b=" + B.x);
		// access static member of class C
		System.out.println("static variable of class C p= " + C.p);
		System.out.println("......................................");

//access non static members of class A,B,C
		C c1 = new C();
		System.out.println("with class C refer b= " + c1.a);
		System.out.println("with class C refer c= " + c1.b);
		System.out.println("with class C refer y= " + c1.y);
		System.out.println("with class C referz= " + c1.z);
		System.out.println("with class C refer q= " + c1.q);
		System.out.println("with class C refer r= " + c1.r);

		B b1 = new B();
		System.out.println("with class B refer b= " + c1.a);
		System.out.println("with class C refer c= " + c1.b);
		System.out.println("with class C refer y= " + b1.y);
		System.out.println("with class C referz=" + b1.z);

	}

}