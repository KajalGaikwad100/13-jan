package Assignment;

class D
{
	int i=10;

D()
{
	System.out.println("Running B Cons");
	i=23;
}

}
public class Cons7 {

	public static void main(String[] args) {
System.out.println("Main is Start");
D b1=new D();
System.out.println(b1.i);
System.out.println("---------------");
D b2=new D();
System.out.println(b2.i);


	}

}
