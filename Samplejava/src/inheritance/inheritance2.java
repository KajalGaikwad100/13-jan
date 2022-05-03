package inheritance;



class F
{
	F()
	{
		System.out.println("i am Constructor of class F");
	}
	void Display()
	{
		System.out.println("I am display of class F");   
	}
	
}
class D extends F
{
	D()
	{
		System.out.println("i am Constructor of class D");

	}
	void Display()
	{
		super.Display();
		System.out.println("I am display of class D");   
	}
}
public class inheritance2 {

	public static void main(String[] args) {
	D b1=new D();
	b1.Display();

	}

}
