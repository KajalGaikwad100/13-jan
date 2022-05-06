package TestNGPackage;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Exampleparam6 {
		@BeforeMethod
		public void enterAppUrl() {
			System.out.println("app url is entered");
		}
		@Test(priority=1)
		public void verifyLogin() {
			System.out.println("Successfully login..");
		}	
		@AfterMethod
		public void logout() {
			System.out.println("logout from the application");
		}
		@Test(priority=2)
		public void createTask() {
			System.out.println("Task created Successfully");
		}
		
		@BeforeTest
		public void openBrowser() {
			System.out.println("Browser is opened..");
		}
		@AfterTest
		public void closeBrowser() {
			System.out.println("Browser is closed..");
		}
	}

	/**
	@BeforeMethod/@AfterMethod--> it gets executed for each and every @Test method
	*/