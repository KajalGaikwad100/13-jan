package Abstaction;

abstract class Animal
{
	public abstract void AnimalSound();
	public void Sleep()
	{
		System.out.println("Kajal");
	}
}
class Tiger extends Animal
{
	public void AnimalSound()
	{
		System.out.println("The tiger says aaa ");
	}
}
class Dog extends Animal
{
	public void AnimalSound()
	{
		System.out.println("The tiger says bbb");

	}

}
public class Abstraction1 {

	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.AnimalSound();
t1.Sleep();
Dog d1=new Dog();
d1.AnimalSound();
d1.Sleep();
	}

}
