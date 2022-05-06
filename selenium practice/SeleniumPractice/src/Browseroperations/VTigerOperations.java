package Browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VTigerOperations {

	public static void main(String[] args) {
		String Path="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		ChromeDriver Cdriver=new ChromeDriver();
	Cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
String title1=Cdriver.getTitle();
//String ExpectedTitle=
System.out.println("Current url title is: "+title1);
WebElement UsernameField=Cdriver.findElement(By.id("username"));
UsernameField.clear();
UsernameField.sendKeys("Admin");
WebElement PasswordField=Cdriver.findElement(By.id("password"));
PasswordField.clear();
PasswordField.sendKeys("Test@123");
WebElement SigninField=Cdriver.findElement(By.className("buttonBlue"));
SigninField.click();

Cdriver.findElement(By.className("fa-user")).click();


Cdriver.findElement(By.linkText("Sign Out")).click();

//UsernameField.sendKeys("Test@123");


	}

}
