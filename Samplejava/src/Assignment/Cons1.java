package Assignment;

public class Cons1 {

	Cons1()
	{
		System.out.println("I am Constructor of class Cons1");
	}
	void Display()
	{
		System.out.println("I am Display Of Class Cons1");
	}
	public static void main(String[] args) 
	{
 System.out.println("Main Class started");
 Cons1 C1=new Cons1();
 C1.Display();
 A a1=new A();
 a1.Display();
 System.out.println(a1.i);
 B b1=new B();
 b1.Display();
 System.out.println(b1.j);
	}

}
	class A
	{
		int i=20;
		 
		A()
		{
			System.out.println("I am  Consructor of Class A");
		}
		void Display()
		{
			System.out.println("I am Display Of Class A");
		}
	}
	class B
	{
		int j=22;
		 
		B()
		{
			System.out.println("I am  Consructor of Class B");
		}
		void Display()
		{
			System.out.println("I am Display Of Class B");
		}
	
	

}

