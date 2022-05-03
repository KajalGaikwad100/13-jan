package Exceptionhandling;

public class Exception19 {

	public static void main(String[] args) throws InterruptedException,UserDefinedException
	{
		// TODO Auto-generated method stub
		setSleep(900);
checknumber(0);
	}
	 static void setSleep(long time) throws InterruptedException {
	    	Thread.sleep(time);
	    }
	    	
static void checknumber(int num)throws UserDefinedException
{
	if(num<0)
	{
		throw new UserDefinedException("Number is less than 0");
	}
	
	else
	{
		System.out.println("Number is"+num);
	}
	
	
	
	
	
	
	
	
	}
	}

