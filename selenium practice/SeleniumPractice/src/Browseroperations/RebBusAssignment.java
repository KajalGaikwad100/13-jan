package Browseroperations;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;


	public class RebBusAssignment {

		public static void main(String[] args) {
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
			wait.until(ExpectedConditions.elementToBeClickable(bus));
			bus.click();
		
		}

	}
