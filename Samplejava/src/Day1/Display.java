package Day1;

public class Display {

public	void Display1()
	{
		System.out.println("Method without Parameter");
		
	}
public	void Display2(int a)
	{
		System.out.println("Method with Parameter"+a);

	}
public static void main(String[] args) 
 {
	 Display d1=new Display();
	 d1.Display1();
	 d1.Display2(5);
			 

	}

}
