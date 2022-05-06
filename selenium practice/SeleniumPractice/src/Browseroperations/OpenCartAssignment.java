package Browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartAssignment {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("firstname")).sendKeys("kajal",Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("thube",Keys.TAB);
		driver.findElement(By.name("email")).sendKeys("kajal@gmail.com",Keys.TAB);
		driver.findElement(By.name("email")).sendKeys("kajal@gmail.com",Keys.TAB);


}

}
