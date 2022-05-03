package Abstaction;

abstract class Shape
{
	abstract void Draw();
	void Circle()
	{
		System.out.println("The circle shape");
	}
}
class Rectangle extends Shape
{
	void Draw()
	{
		System.out.println("the rectangle shape");
	}
}
class Abstraction3
{
	public static void main(String[]args)
	{
		Rectangle r1=new Rectangle();
		r1.Draw();
		r1.Circle();
		//Shape S1=new Shape();
	}
}