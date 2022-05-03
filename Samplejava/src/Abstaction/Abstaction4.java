package Abstaction;

abstract class Animal20 {
	// Abstract method (does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() 
	{
		System.out.println("Zzz");
	}
}
// Subclass (inherit from Animal)
class Pig10 extends Animal20 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}
//Subclass (inherit from Animal)
class Dog10 extends Animal20{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}
}
class Abstaction4 {
	public static void main(String[] args) {
		Pig10 myPig = new Pig10(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		Dog10 d1=new Dog10();
		d1.animalSound();
		d1.sleep();
	}
}
