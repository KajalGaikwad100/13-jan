package Browseroperations;

	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Calenderhandling {

		public static void main(String[] args) {
			String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", Path3);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
						 driver.get("https://www.makemytrip.com/");
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
			driver.findElement(By.cssSelector("label[for='departure']")).click();
			driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

		}

	}

