package Assignment;

public class ThisStatement {

	ThisStatement()
	{
		this(20);
		System.out.println("Zero parameterised constructor");
	}
	ThisStatement(int age)
	{

		System.out.println("int one  parameterised constructor");
	}
	ThisStatement(char c,double p)
	{
		this();
		System.out.println("two parameterised constructor");
	}
	
	
	public static void main(String[] args) {
		ThisStatement t1=new ThisStatement('a',45.55);
		ThisStatement t2=new ThisStatement(40);

	}

}
