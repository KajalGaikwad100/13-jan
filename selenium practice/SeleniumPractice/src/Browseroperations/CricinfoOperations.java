package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoOperations {

	public static void main(String[] args) {
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path3);
		ChromeDriver Cdriver=new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cdriver.get("https://www.espncricinfo.com/");
	String expectedurl="https://www.espncricinfo.com/";
		
	String Actualurl=Cdriver.getCurrentUrl();
	if(expectedurl.equals(Actualurl))
	{
		System.out.println("cricinfo open successfully");
	}
	else
	{
		System.out.println("cricinfo not open successfully");

	}
	List<WebElement> Menu2=Cdriver.findElements(By.cssSelector(".ds-popper-wrapper>a"));
	System.out.println("Main menu are:"+Menu2.size());
	for(int i=0;i<Menu2.size();i++)
	{
		System.out.println(Menu2.get(i).getText());
	}
	}

}
