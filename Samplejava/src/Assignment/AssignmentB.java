package Assignment;

public class AssignmentB
        {
        static int age = 25; // declare static globalvariable
		double salary = 45000.1;// decalre non static globalvariable

		static {
			System.out.println("static block A");// static block
		}
		{

			System.out.println("non static block B");// non static block
		}

		void test1(int year)
		{ // leap year using non static method

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				System.out.println("leap year");
			} else 
			{
				System.out.println("not leap year");
			}
		}

		public static void scope(int a) 
		{// no is even or odd program by static using methods

			if (a % 2 == 0) 
			{
				System.out.println("even no");
			} 
			else 
			{
				System.out.println(" odd no");

			}

		}

		void display() 
		{// method overloading(non static)
			char i;
			for (i = 'A'; i <= 'Z'; i++) 
			{
				System.out.print("" + i);
			}
		}

		public static void display(int a, int b, int c)
		{// method overloading (static)
			if (a > b && a > c)
			{
				System.out.println(" a is largest no ");
			}
			if (b > a && b > c)
			{
				System.out.println("b is largest no ");
			} else
			{
				System.out.println("c is largest no");
			}

		}
        
		public static void main(String[] args) 
		{
			System.out.println("static global variable age=" +age);
			//AssignmentB b1 = new AssignmentB();
			//System.out.println("non static global variable salary=" +AssignmentB.salary);
			//b1.test1(2022);
			//AssignmentB.scope(24);
			//b1.display();
			//System.out.println(".........");
			//AssignmentB.display(100, 200, 300);

			//System.out.println(".............................");
		//	Assignment C = new Assignment();
          //  C.main(args);
		}
}
	/*class Assignment
	{

		static String name = "laxmikant"; // declare static globalvariable
		char blodgroup = 'B';// decalre non static globalvariable

		static 
		{
			System.out.println("BLOCK STATIC ..1...");// static block
		}
		{

			System.out.println("BLOCK NON STATIC...2...");// non static block
		}

		void getswapnumber(int a, int b) 
		{
			int temp;
			temp = a;
			a = b;
			b = temp;

			System.out.println("swap of a: " + a);
			System.out.println("swap of b: " + b);
		}

		static void getreverse(int num) 
		{
			int rev = 0;
			while (num != 0) 
			{
				rev = rev * 10 + num / 10;
				num = num / 10;
			}
			System.out.println("reverse no of 1234 is: " + rev);
		}

		public static void checkno(int num) 
		{
			if (num > 0)
			{
				System.out.println("no is positive");
			} else 
			{
				System.out.println("no is negative");
			}
		}

		void checkno() 
		{
			char i;
			for (i = 'a'; i <= 'z'; i++)

			{
				System.out.println("  " + i);
			}
		}

		public static void main(String[] args) 
		{
			
			System.out.println("static global variable NAME=" + Assignment.name);
			Assignment C1 = new Assignment();
			System.out.println("non static global variable blood group=" + C1.blodgroup);
			C1.getswapnumber(10, 20);
			Assignment.getreverse(1234);
			C1.checkno();
			System.out.println(".........");
			Assignment.checkno(20);

		}
	}*/