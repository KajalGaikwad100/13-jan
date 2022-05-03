package Casting;


class A1
{
	void Test1()
	{
		System.out.println("I am Test1");
	}
}
class B1 extends A1
{
	void Test2()
	{
		System.out.println("I am Test2");
	}
}
class C1 extends B1
{
	void Test3()
	{
		System.out.println("I am Test3");
	}
}
public class Typecasting1 {

	public static void main(String[] args) {
		B1 b=new B1();
		b.Test2();
		
		b.Test1();
		System.out.println("************");
		C1 c=new C1();
		c.Test1();
		c.Test2();
		c.Test3();
		System.out.println("************");
	A1 a=new B1();
	//a.Tast2();
	a.Test1();
	B1 b2=new C1(); //implicit upcasting
	b2.Test2();
	b2.Test1();
	A1 a2=(A1)new B1();//explicit upcasting
	a2.Test1();
	
	}

}
