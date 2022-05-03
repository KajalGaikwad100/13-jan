package inheritance;
class Fruits
{
	int fruitage;
	Fruits()
	{
		System.out.println("I am cons of class Fruit");
		fruitage=5;
	}
	public void Display()
	{
		System.out.println("I am Display of Class fruitage");
	}
}
class Mango extends Fruits
{
	int fruitage;
	Mango()
	{
		System.out.println("I am Cons of mango");
		 fruitage=7;
	}
	public void Display()
	{
		super.Display();
		System.out.println("I am Display of Class Mango");
		super.Display();
	}
}
public class Inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mango m1=new Mango();
m1.Display();
System.out.println(m1.fruitage);
Fruits f1=new Fruits();
f1.Display();
System.out.println(f1.fruitage);
	}

}
