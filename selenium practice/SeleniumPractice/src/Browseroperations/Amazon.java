package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class Amazon {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.amazon.com/");
		WebElement Keyboard=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none fluid-image-container'])[2]"));
		Keyboard.click();
	
		List<WebElement> Keyboard1=driver.findElements(By.xpath("//div[@id='search']/div/div/div/span/div/div"));
				
System.out.println(Keyboard1.size());
for(int i=0;i<Keyboard1.size();i++)
{
	System.out.println(Keyboard1.get(i).getText());
}
	}

}
