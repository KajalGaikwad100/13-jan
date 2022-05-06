package Browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		String Path="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		ChromeDriver Cdriver=new ChromeDriver();
	Cdriver.get("https://demo.actitime.com/login.do");
	String getsourcecode=Cdriver.getPageSource();
	System.out.println("Application source code"+getsourcecode);
	System.out.println("Application source code length"+getsourcecode.length());
	String title1=Cdriver.getTitle();
System.out.println("Application current url is"+Cdriver.getCurrentUrl());
System.out.println("Application nname is:"+	Cdriver.getTitle());
	System.out.println("Application title length is"+title1.length());
//Cdriver.close();
	WebElement Usernamefield=Cdriver.findElement(By.id("username"));
	Usernamefield.sendKeys("admin");
	
	WebElement Passwordfield=Cdriver.findElement(By.name("pwd"));
	Passwordfield.sendKeys("manager");
	
	WebElement Loginfield=Cdriver.findElement(By.id("loginButton"));
	Loginfield.click();
	Cdriver.close();
	
	}

}
