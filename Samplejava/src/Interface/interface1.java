package Interface;

interface i1
{
	abstract void Display();
	void Draw();
	
}
interface i2 extends i1
{
	void Shape();
	
}
class interface1 implements i1,i2
{
	public void Display()
	{
		System.out.println("I am Display ");
	}
	public void Draw()
	{
		System.out.println("I am Draw ");
	}
	public void Shape()
	{
		System.out.println("I am Shape ");
	}


	public static void main(String args[]) {
		interface1 obj = new interface1();
		obj.Display();
		obj.Draw();
		obj.Shape();
}
}
