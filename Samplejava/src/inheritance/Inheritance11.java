package inheritance;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		super.move(); // 
		System.out.println("Dogs can walk and run");
	}
}
public class Inheritance11 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); // Animal reference but Dog object
		b.move(); //
	}
}