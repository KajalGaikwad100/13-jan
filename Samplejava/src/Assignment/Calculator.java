package Assignment;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCalculator('-',4,8);
	}
public static void getCalculator(char op,int num1,int num2)
{
	
	int res;
	switch(op)
	{
	case '-' :
		res=num1-num2;
		System.out.println("Substraction is"+res);

	
	case '+' :
		res=num1+num2;
		System.out.println("Addition is"+res);
	

	case '%' :
		res=num1%num2;
		System.out.println("Modulous is"+res);
	
		
		case '/' :
			res=num1/num2;
			System.out.println("Division is"+res);
			
			//default :
			//	System.out.println("Unknown Operations");
	
				
		}
	

}
}
