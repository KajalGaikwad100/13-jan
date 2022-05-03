package Assignment;

public class NumberofDigit {

	public static void main(String[] args) {
		NumberofDigit n1=new NumberofDigit();
		n1.Display(34556);

	}
void Display(int num) 
{
	int i,count=1;
	
	for(i=1;i<num;i++)
	{
		
		num=num/10;
		count++;
	}
		System.out.println("Number of Digits"+count);
	
}
}
