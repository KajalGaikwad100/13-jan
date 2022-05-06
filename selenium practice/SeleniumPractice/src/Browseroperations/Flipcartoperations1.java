package Browseroperations;


		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Flipcartoperations1 {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//maxamize browser
				driver.manage().window().maximize();
				//implicitWait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");
				//use findelements...method to find multiple element
			//	List<WebElement> Meanu = driver.findElements(By.cssSelector("button._2KpZ6l._2doB4z"));
				WebElement Meanu = driver.findElement(By.className("_2doB4z"));
				Meanu.click();
				List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector("div[class='_37M3Pb']>div"));
				System.out.println("count element is " + FlipcartMenu.size());
				for(WebElement option1:FlipcartMenu)
				{
					String option=option1.getText();
					System.out.println("All features name  is:"+option);
				}
			}

		}
	


