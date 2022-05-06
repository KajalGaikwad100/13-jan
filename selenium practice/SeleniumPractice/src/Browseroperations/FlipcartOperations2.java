//
package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartOperations2 {

	public static void main(String[] args) {
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path3);
		ChromeDriver Cdriver=new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cdriver.get("https://www.flipkart.com/");
	String expectedurl="https://www.flipkart.com/";
	String Actualurl=Cdriver.getCurrentUrl();
	if(expectedurl.equals(Actualurl))
	{
		System.out.println("Flipacrt open successfully");
	}
	else
	{
		System.out.println("Flipacrt open successfully");

	}
		WebElement Menu = Cdriver.findElement(By.className("_2doB4z"));
		Menu.click();

		List<WebElement> Menu1=Cdriver.findElements(By.cssSelector("div[class='_37M3Pb']>div"));
		System.out.println("Flipacrt main  menu size is:"+Menu1.size());
		System.out.println("Current page url: " + Cdriver.getCurrentUrl());

		for(int i=0;i<Menu1.size();i++)
		{
			System.out.println(Menu1.get(i).getText());
		}
		
	}

}
