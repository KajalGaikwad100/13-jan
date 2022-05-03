package Assignment;

public class Cons {
int rollNo;
double Salary;
	Cons(){
		System.out.println("My First Constructor");
	}
	Cons(int c,double d)
	{
		rollNo =c;
		Salary=d;
	}
	
	void Display() 
	{
		System.out.println(rollNo + " " +Salary );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c2=new Cons();

		Cons c1=new Cons(23,45000.45);
		c1.Display();
	}

}
