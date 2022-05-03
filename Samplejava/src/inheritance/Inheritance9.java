package inheritance;
 
class Grandfather
{
	Grandfather()
	{
		System.out.println("I am cons of Grandfather ");
	}
	void MyHome()
	
	{
		System.out.println(" i have my home");
	}
}
class Father extends Grandfather

{
	
	Father(double d)
	{
		super();
		System.out.println("i am cons of father");
	}
	void MyCar()
	{
	
		System.out.println("I have my car");
	}
}
class Child extends Father

{
	
	Child()
	{
		super(12.35);
		System.out.println("i am cons of Child");
	}
	void MyBike()
	{
		
		System.out.println("I have my Bike");
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1. MyBike();
		c1.MyCar();
		c1.MyHome();
		Father f1=c1;
		f1.MyHome();
		f1.MyCar();
		Grandfather g1=c1;
		g1.MyHome();
		Grandfather g2=new Father(12.24);
		g2.MyHome();
	}

}
