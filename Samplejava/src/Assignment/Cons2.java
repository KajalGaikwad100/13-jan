package Assignment;

public class Cons2 {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		C b1=new C(15);
		System.out.println(b1.i);
		C b2=new C(0.32);
		System.out.println(b2.i);


	}

}
class C
{
	double i=10.25;
	C(double j)
	{
		System.out.println("I am Class C constructor");
		i=j;
	}
}