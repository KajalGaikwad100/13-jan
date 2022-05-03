package Assignment;

public class Swapnumbers {

	public static void main(String[] args) 
	{
		getswapnumbers(10,20);
	}
public static int getswapnumbers(int a,int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("swapping of numbers is a="+a);
	System.out.println("swapping of numbers is b="+b);

return temp;
	
}
}
