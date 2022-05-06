package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class SortabeFrame {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/sortable/\r\n");
		
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.switchTo().frame(0);

		Actions act=new Actions(driver);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		//WebElement dest=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
		//WebElement src=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
List<WebElement> list1=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
System.out.println(list1.size());
for(int i=list1.size();i>0;i--)
{
	Thread.sleep(2000);
	WebElement dest=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
	WebElement src=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));

			act.dragAndDrop(dest, src).build().perform();
		
		//get your control back to main page
		//driver.switchTo().defaultContent();
		//driver.findElement(By.cssSelector(".logo>a")).click();
}
		
	}
	}

