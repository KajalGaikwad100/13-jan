package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class Moneycontrolassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.moneycontrol.com/mutualfundindia/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

List<WebElement> largecapfund=driver.findElements(By.xpath("//*[@id=\"tbequity\"]/div/div/div[1]/div/table[1]/tbody/tr[1]/td[2]"));
System.out.println("Larger cap fund list and rank:");
for(int i=0;i<largecapfund.size();i++)
{
	System.out.println(largecapfund.get(i).getText());
}
	}


//td/a[@class='robo_medium']//following::div[1]

}

		/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

List<WebElement> largecapfund=driver.findElements(By.xpath("//*[@id=\\\"tbequity\\\"]/div/div/div[1]/div/table[1]/tbody"));
System.out.println("Larger cap fund list and rank:");
for(int i=0;i<largecapfund.size();i++)
{
	System.out.println(largecapfund.get(i).getText());
}
	}

}*/
//td/a[@class='robo_medium']//following::div[1]

//*[@id="tbequity"]/div/div/div[1]/div/table[1]/tbody/tr[1]/td[2]
//*[@id="tbequity"]/div/div/div[1]/div/table[1]/tbody/tr[1]/td[2]


//*[@id="tbequity"]/div/div/div[1]/div/table[1]/tbody/tr[1]/td[1]/td[2]
//*[@id="tbequity"]/div/div/div[1]/div/table[1]/tbody/tr[1]/td[2]
//*[@id="tbequity"]/div/div/div[1]/div/table[1]/tbody
//*[@id="tbequity"]/div/div/div[1]/div/table[1]