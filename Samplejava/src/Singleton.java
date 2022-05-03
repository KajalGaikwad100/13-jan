class Sampleton
{
	private Sampleton()
	{
		System.out.println("Private class constructor");
	}
	static Sampleton obj=new Sampleton();
	public static Sampleton getSampletonobj()
	{
		return obj;
	}
	void Display()
	{
		System.out.println("I am display");
	}
}
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sampleton s1=new Sampleton();//not possible
		Sampleton.getSampletonobj().Display();
	}

}
