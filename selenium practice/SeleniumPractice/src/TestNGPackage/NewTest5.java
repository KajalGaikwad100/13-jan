package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class NewTest5 {
  @Test
  
  public void loginLogoutInActitimeApplication() {
  		
		SeleniumUtility utility = new SeleniumUtility();

  		WebDriver driver=utility.setUp("chrome", "https://demo.actitime.com/login.do");
  		System.out.println("Before login page title: "+driver.getTitle());
  		//identify the required element from the UI and perform required action 0-30
  		driver.findElement(By.id("username")).sendKeys("admin");
  		//identify the required element from the UI and perform required action 0-30
  		driver.findElement(By.name("pwd")).sendKeys("manager");
  		//identify the required element from the UI and perform reqiored action
  		driver.findElement(By.id("loginButton")).click(); //0-30

  		WebElement logoutButton=driver.findElement(By.id("logoutLink"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
  		System.out.println("After login page title: "+driver.getTitle());
  		
  		logoutButton.click();
  	
  		driver.close();
  }
  
  }

