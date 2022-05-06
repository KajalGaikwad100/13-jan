package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaOperations {

	public static void main(String[] args) {
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path3);
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();

		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://www.gsmarena.com");
		String ExpectedURL="https://www.gsmarena.com/";
		String Actualurl=cdriver.getCurrentUrl();
		if(ExpectedURL.equals(Actualurl))
		{
			System.out.println("Flipacrt open successfully");
		}
		else
		{
			System.out.println("Flipacrt not open  successfully");

		}
			WebElement Menu = cdriver.findElement(By.cssSelector("a.pad-single.pad-finder"));
			System.out.println(Menu.getText());
		List<WebElement> Menu1 = cdriver.findElements(By.cssSelector("ul>li"));
		System.out.println("Size of menu is"+Menu1.size());
		System.out.println("List of mobile phone is");
		for(int i=0;i<Menu1.size();i++)
		{
		System.out.println(Menu1.get(i).getText());
		}

			
	}

}
