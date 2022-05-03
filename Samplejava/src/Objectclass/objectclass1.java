package Objectclass;


	class Demo{
		void display() {
			System.out.println("I am display()..");
		}
	}
	public class objectclass1 extends Demo{

		static int last_roll = 100;
		int roll_no;

		// Constructor
		objectclass1()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }

		// Driver code
		public static void main(String args[])
		{
			objectclass1 s = new objectclass1();

			// Below two statements are equivalent
			System.out.println(s);//s.toString() -->string representation of an object
			System.out.println(s.toString());//string representation of an object
			Demo d1=new Demo();
			System.out.println(d1);
			System.out.println(d1.toString());		
			Demo d2=new objectclass1();
			System.out.println(d2);
		}
	
	
	}