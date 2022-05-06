package Browseroperations;

                          
		import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Opearations3 {

		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//creating an object of chromedriver class and upcasting it to WebDriver interface
			WebDriver driver=new ChromeDriver();
			//enter required application url
			driver.get("https://www.google.com/");
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement searchInputField=driver.findElement(By.name("q"));
			searchInputField.sendKeys("Selenium Testing");
			//to identify multiple web elements
			List<WebElement> suggList=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));
			//get the count of identify element
			int suggCount=suggList.size();
			System.out.println(suggCount);
			//to access one by one list element
			for(int i=0;i<suggCount;i++) {
				System.out.println(suggList.get(i).getText());
			}
			//close current browser
			driver.close();		
		}
	}
