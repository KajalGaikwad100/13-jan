package Wrapperclass;

public class Wrapperclass3 {
	public static void main(String[] args) {
		
		Double doubleObj=25.2566;//autoboxing
		System.out.println("doubleObj: "+doubleObj);
		//only boxed object can be unboxed
		double salary=doubleObj.doubleValue();//unboxing 
		System.out.println(salary);
		
		System.out.println(doubleObj==salary);
		
		Character cobj='G';
		System.out.println("Character is"+cobj);
		char name=cobj.charValue();
		System.out.println(name);
		
		Boolean val=false;
		boolean val1=val.booleanValue();
		System.out.println(val1);
		
		
	}

}
