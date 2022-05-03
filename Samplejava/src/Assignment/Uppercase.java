package Assignment;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uppercase U1=new Uppercase();
		U1.Display();
	}
	void Display() 
	{
		char i;
		for(i='A';i<='Z';i++)
		{
			System.out.print(" " +i);
		}
	}

}
