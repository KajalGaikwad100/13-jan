package Browseroperations;

	import org.openqa.selenium.By;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Redbus2 {

		public static void main(String[] args) {
			
			String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", Path3);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
			driver.get("https://www.redbus.in/");
			driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
			driver.findElement(By.cssSelector(".selected")).click();
			driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
			driver.findElement(By.cssSelector("li.sub-city:nth-child(4)")).click();
			driver.findElement(By.cssSelector(".next")).click();
			driver.findElement(By.cssSelector(".wd:nth-child(2)")).click();
			driver.findElement(By.cssSelector("#search_btn")).click();
			driver.findElement(By.cssSelector("li.checkbox:nth-child(4)")).click();
		
		}

	}

