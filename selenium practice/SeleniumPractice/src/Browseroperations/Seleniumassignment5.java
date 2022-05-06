package Browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumassignment5 {

	public static void main(String[] args) {
String Path="D:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", Path);
ChromeDriver cdriver=new ChromeDriver();
cdriver.get("https://demosite.executeautomation.com/Login.html");
String tit1=cdriver.getTitle();
System.out.println("Current url title is"+cdriver.getTitle());
System.out.println("Current url length is"+tit1.length());
String ExpectedURL="https://demo.actitime.Login";
String ActualURL=cdriver.getCurrentUrl();
if(ExpectedURL.equals(ActualURL))
{
	System.out.println("expected and actual url is same");
}
else
{
	System.out.println("Page not found or page title got changed");

}
System.out.println("Current url is"+cdriver.getCurrentUrl());
 
WebElement Usernamefield= cdriver.findElement(By.name("UserName"));
Usernamefield.sendKeys("execution");

WebElement Passwordfield= cdriver.findElement(By.name("Password"));
Passwordfield.sendKeys("admin");

WebElement Loginfield= cdriver.findElement(By.name("Login"));
//Loginfield.click();
//Loginfield.clear();
Loginfield.sendKeys("Login");
Loginfield.click();

//cdriver.close();

//Usernamefield.sendKeys("execution");

	}

}
