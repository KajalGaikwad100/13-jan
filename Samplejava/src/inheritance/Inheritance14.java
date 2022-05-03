package inheritance;
class Human {
	int age;
	Human()
	{
		this(25);
		System.out.println("I am cons of human");
		age=22;
	}
	Human(int age)
	{
		System.out.println("I am param Cons of human");
		System.out.println(age);

	}
	// Overridden method
	public void eat() {
		System.out.println("Human is eating");
		System.out.println(age);
	}
}
class Boy extends Human {
	int sal;
	Boy()
	{ 
		
		this(10000);
		sal=15000;
		System.out.println("I am cons of Boy");
	}
	Boy(int sal)
	{ 
		super();
		System.out.println(sal);

		System.out.println("I am param cons of Boy");
	}
	public void eat() {
		super.eat();
		System.out.println("Boy is eating");
		System.out.println(sal);
	}
	// Overriding method
	
}
 
	
public class Inheritance14 {

	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
		Human h1=new Human();
		h1.eat();
		Human h2=new Boy();
	}
}