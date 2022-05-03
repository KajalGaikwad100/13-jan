package Day1;

public class Prime2{
	public static void main(String[] args)
	{
		int i=0,num=14;
		int count=0;
		
		System.out.println("Program Starts");
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			} 
		}
			if(count==2)
			{
			System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not prime number");
			}
		}
	

	}

