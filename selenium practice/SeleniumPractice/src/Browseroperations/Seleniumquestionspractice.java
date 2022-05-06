package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumquestionspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maxamize browser
		driver.manage().window().maximize();
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
		
			
				
				List<WebElement> search1 = driver.findElements(By.cssSelector("div.mkHrUc>ul>div>ul>li"));
				System.out.println("selenium search count is "+search1.size());
				for(WebElement searchoption:search1)
				{
					String option=searchoption.getText();
					System.out.println("suggested selenium interview question is phones name  is:"+option);
				}
			}

		
		//List<WebElement> questionsfield=driver.findElements(By.className("csi"));
		
	}


