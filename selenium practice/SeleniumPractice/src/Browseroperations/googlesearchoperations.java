package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path3);
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		cdriver.get("https://www.google.com");
		cdriver.findElement(By.className("gLFyf")).sendKeys("Selenium Interview Questions");
		List<WebElement> Search=cdriver.findElements(By.cssSelector("li.sbct>div"));
		System.out.println(Search.size());
		for(int i=0;i<Search.size();i++)
		{
			System.out.println(Search.get(i).getText());
		}
	//<List>WebElement googlesearch=cdriver.findElements(By.className("L3eUgb"));
	//	googlesearch=	sendKeys("Selenium Interview Questions");
	}

}
