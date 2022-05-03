package Casting;

class A2 {
	void test1() {
		System.out.println("Running test1()");
	}
}
class B2 extends A2 {
	void test2() {
		System.out.println("Running test2()");
	}
}
class C2 extends B2 {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class Typecasting2
{
	public static void main(String[] args) {
		System.out.println("Program starts");
//		C2 c2=new C2();
//		c2.test1();
//		c2.test2();
//		c2.test3();
//		B2 b2=new B2();
//		b2.test1();
//		b2.test2();
//		A2 a2=new A2();
//		a2.test1();
		
		B2 b1 = new C2();//auto up casting
		b1.test1();
		b1.test2();
		//b1.test3();
		
		C2 c2=new C2();
		B2 b4=c2;//implicit up casting
		B2 b2=(B2)c2;//explicit up casting---->B2 b2=(B2)new C2();
				//or
		//B2 b3=(B2)new C2();//explicit up casting-
		b2.test1();
		b2.test2();
		
		
		A2 a1=new C2();//implicit/auto upcasting
		A2 a2=new B2();//implicit/auto upcasting
		
		B2 x1=new B2();
		A2 a3=x1;//implicit/auto upcasting
		A2 a4=(A2)x1;//explicit upcasting
		A2 a5=(A2)new B2();
		System.out.println("Program ends");

	}
}