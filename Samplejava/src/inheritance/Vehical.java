package inheritance;

class vehicle2 {
	public void wheels() {
		System.out.println("I have wheels");
	}
}
// first child class of vehicle class
class bike2 extends vehicle2 {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}
// second child class of vehicle class
class Car2 extends vehicle2 {
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}
// third child class of vehicle class
class scooter2 extends vehicle2 {
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class Vehical {
	public static void main(String[] args) {
		scooter2 sc = new scooter2(); // object of scooter class
		sc.wheels();
		sc.countwls();
		Car2 c = new Car2(); // object of car class
		c.wheels();
		c.countwlc();
		bike2 b = new bike2();// object of bike class
		b.wheels();
		b.countwl();
	}
}