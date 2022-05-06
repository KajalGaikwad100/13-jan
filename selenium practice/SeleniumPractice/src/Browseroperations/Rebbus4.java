package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class Rebbus4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
		/*System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maxamize browser
		driver.manage().window().maximize();
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		//driver.get("https://www.redbus.in/");
		WebElement FromField=driver.findElement(By.id("src"));
		FromField.click();
		FromField.sendKeys("Pune");
		WebElement ToField=driver.findElement(By.id("dest"));
		//ToField.click();
		ToField.sendKeys("Goa");
		WebElement element3 = driver.findElement(By.cssSelector(".db.text-trans-uc"));
		element3.click();
		WebElement element4 = driver.findElement(By.cssSelector(".next"));
		element4.click();
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[1]"));
		element5.click();
		
		WebElement element6 = driver.findElement(By.cssSelector(".selected"));
		element6.click();
		WebElement element7 =driver.findElement(By.id("search_btn"));
		element7.click();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

		WebElement closepath = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/i"));
		closepath.click();

		WebElement element8 = driver.findElement(By.xpath("//label[@title='After 6 pm']"));
		element8.click();

		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element9 = driver.findElement(By.xpath("(//label[@class='cbox-label'])[7]"));
		wait.until(ExpectedConditions.elementToBeClickable(element9));
		element9.click();
		WebElement BusName = driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		System.out.println( BusName.getText());
		/*for(int i=0;i<BusName.getSize();i++)
		{
			System.out.println(" "+BusName.get(i).getText());
		}
System.out.println("Busname size is"+BusName.size());*/
		//WebElement element9 = driver.findElement(By.className("cbox-label"));
		//element9.click();
	}

}
//class="w-15 fl f-12 d-color"