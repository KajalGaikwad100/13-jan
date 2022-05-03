package inheritance;
 class Company1
 {
	 int age=25;
	 
	 Company1()
{
		 System.out.println(age);
		

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
	 void Display()
	 {
	 	int i;
	 	for(i=0;i<5;i++)
	 	{
	 		System.out.println("KAJAL");
	 	}
	 }
 }
 class Employee extends Company1
 
 {
	 int age;
	 Employee()
	 {
		 System.out.println(age);
		

	 }
	 void Display()
	 {
		 super.Display();
		 System.out.println("I am Display of class Employee");
	 }
 }
public class Inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.Display();
		Company1 c1=new Company1();
		c1.Display(123);
	}

}
/*
//ass Company {
	//global variable
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
}
// child class of Company
class Employee extends Company {
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
}
public class Inheritance10 {

	public static void main(String[] args) {
	}

}*/