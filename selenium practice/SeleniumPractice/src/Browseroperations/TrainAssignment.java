package Browseroperations;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class TrainAssignment {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://etrain.info/current-booking");
//	driver.switchTo().frame(driver.findElement(By.cssSelector(".google_esf")));
//	Actions act=new Actions(driver);

		WebElement search =driver.findElement(By.id("cbafi1"));
		search.sendKeys("PUNE");
		WebElement search1 =driver.findElement(By.xpath("//*[@id=\"suggest_row1\"]"));

		search1.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

		WebElement dest =driver.findElement(By.id("cbafi2"));
		dest.sendKeys("LOK");
		WebElement dest1 =driver.findElement(By.xpath("//*[@id=\"suggest_row5\"]"));

		dest1.click();
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".google_esf")));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

		WebElement searchbtn =driver.findElement(By.xpath("//*[@id=\"cbasbmtbtn\"]"));
		
		searchbtn.click();
		/*List<WebElement> Trainlist=driver.findElements(By.xpath("//table/tbody/tr"));
System.out.println(Trainlist.size());
for(int i=0;i<Trainlist.size();i++)
{
	System.out.println(Trainlist.get(i).getText());
}*/
		List<WebElement> allTrainDetails=driver.findElements(By.xpath("//tr[@class='udborder lrborder']"));
		
		for(int i=0;i<allTrainDetails.size();i++) {
			System.out.println("*** "+allTrainDetails.get(i).getText()+" ****");
		}
	}

}
