
public class Sample3 {
int rollno;

int salary;

	Sample3(int i,int j)
	{
		i=rollno;
	    j=salary;
	}
	void Display()
	{
		System.out.println(rollno+""+salary);
	}
	public static void main(String[] args) {
Sample3 s1= new Sample3(13,30000);

s1.Display();

	}

}
