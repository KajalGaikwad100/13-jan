package Day1;

public class Overloading {

	public static void main(String[] args) 
	{
		
		System.out.println("Program Starts");
		Overloading o1=new Overloading();
		o1.Display(20,20);
		o1.Display('A');
		System.out.println("Program Ends");
		}
	void Display(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void Display(char grade)
	{
		System.out.println("Grade is" + grade);


}
}
