package Browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumassignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",Path3);
ChromeDriver cdriver=new ChromeDriver();
cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

cdriver.get("https://demo.actitime.com");
String tit1=cdriver.getTitle();
System.out.println("Current url title is"+cdriver.getTitle());
System.out.println("Current url length is"+tit1.length());
String ExpectedTitle="actiTIME - Login";
String ActualTitle=cdriver.getTitle();
if(ExpectedTitle.equals(ActualTitle))
{
	System.out.println("expected and actual title is same");
}
else
{
	System.out.println("Page not found or page title got changed");

}
System.out.println("Current url is"+cdriver.getCurrentUrl());

WebElement userinputfield=cdriver.findElement(By.id("username"));
userinputfield.sendKeys("admin");
userinputfield.clear();
userinputfield.sendKeys("admin");

WebElement Passwordinputfield=cdriver.findElement(By.name("pwd"));
Passwordinputfield.sendKeys("manager");
//Passwordinputfield.clear();
//Passwordinputfield.sendKeys("Password");

WebElement Logininputfield=cdriver.findElement(By.id("loginButton"));
Logininputfield.click();
//Logininputfield.clear();
WebElement logoutButton=cdriver.findElement(By.id("logoutLink"));
//explicit wait
WebDriverWait wait=new WebDriverWait(cdriver,20);
wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
cdriver.findElement(By.id("logoutLink")).click();

//Logininputfield.sendKeys("Login");

//cdriver.close();
	}

}
