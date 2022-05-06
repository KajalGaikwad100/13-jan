package Browseroperations;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PhoneDemo2 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//maxamize browser
			driver.manage().window().maximize();
			//implicitWait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.demoblaze.com/");
			//use findelements...method to find multiple element
			List<WebElement> Phones = driver.findElements(By.cssSelector(".card-block>h4>a"));
			System.out.println("count element is " + Phones.size());
			List<String> L1 = new ArrayList<String>();
			L1.add("Nokia lumia 1520");
			L1.add("Nexus 6");
			L1.add("Samsung galaxy s7");
			L1.add("Iphone 6 32gb");
			L1.add("Sony xperia z5 ");
			L1.add("HTC One M9");
			L1.add("Sony vaio i5");
			L1.add("Sony vaio i7");
			L1.add("Iphone 6 32gb");
			
				//Logic to get one by one element from the list and performing validation on that
			
			for(int i=0;i<Phones.size();i++) {
			WebElement cat=Phones.get(i);
			System.out.println(""+cat.getText());
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
		//	System.out.println(""+cat.getText().equals(L1.get(i)));
			}

		}

	
}
