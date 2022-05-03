package Abstaction;
abstract class Demo1
{
	abstract void run();
	void Display()
	{
		System.out.println("Car is White");
	}
	void Speed(int spd)
	{
		System.out.println("the speed of car is"+spd);
	}
}
class Honda extends Demo1
{
	void run()
	{
		System.out.println("Speed is best");
	}
	void Display()
	{
		System.out.println("Honda is black");
	}
	void Speed(int spd)
	{
		System.out.println("The speed of honda is "+spd);
		super.Speed(120);
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		Honda h1=new Honda();
		h1.run();
h1.Speed(80);
h1.Display();
Demo1 d1=new Honda();
d1.Display();
h1.run();
	}

}
