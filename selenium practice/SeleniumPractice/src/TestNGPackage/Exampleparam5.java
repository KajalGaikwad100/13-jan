package TestNGPackage;



	import org.testng.annotations.Test;

	public class Exampleparam5 {
		@Test(invocationCount=10)
		public void param1() {
			System.out.println("Hello, I am TC8 from Example_Param1 class");
		}	
	}
	/**
	if testng class contains more dn one test method dn all the test method will be executed in
	alphabetical order
	*/
