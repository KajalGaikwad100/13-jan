package Browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class SauceDemoassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.saucedemo.com/");
		
/*
		WebElement activeObject=driver.switchTo().activeElement();
		activeObject.sendKeys(Keys.TAB);
		String activeObjectPlaceholder=activeObject.getAttribute("placeholder");
		String expectedActiveObject="Username";
		if (activeObjectPlaceholder.equals(expectedActiveObject)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is unsucessful");
		}
		//login in actitime application without identifying any object
		activeObject.sendKeys("locked_out_user",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("secret_sauce",Keys.ENTER);*/

	String cred=driver.findElement(By.tagName("div")).getText();
		System.out.println(cred);
		
	cred=cred.replace("( Username : ", "");
		cred=cred.replace(" | Password : ", " ");
		cred=cred.replace(" :", "");
		//System.out.println(cred);
		String[] loginDetails=cred.split(" ");
		//System.out.println(cred);

		driver.findElement(By.id("user-name")).sendKeys(loginDetails[0]);
		driver.findElement(By.id("password")).sendKeys(loginDetails[1]);
		
		/*String []loginDetails=cred.split(" ");
		driver.findElement(By.id("user-name")).sendKeys(loginDetails[1]);
		driver.findElement(By.id("password")).sendKeys(loginDetails[2]);
		driver.findElement(By.id("login-button")).click();
		*/
	
	}

}
