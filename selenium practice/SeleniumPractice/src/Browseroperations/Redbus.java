package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maxamize browser
		driver.manage().window().maximize();
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		WebElement FromField=driver.findElement(By.id("src"));
		FromField.click();
		FromField.sendKeys("Pune");
		WebElement ToField=driver.findElement(By.id("dest"));
		//ToField.click();
		ToField.sendKeys("Goa");
		//WebElement CalenderField=driver.findElement(By.id("txtOnwardCalendar"));
		//CalenderField.click();
		//WebElement NextField=driver.findElement(By.cssSelector("div.rb-calendar-month>ul>li[class='rb-next active']"));
		//NextField.click();\\
		WebElement element3 = driver.findElement(By.id("txtOnwardCalendar"));
		element3.click();
		
		WebElement element4 = driver.findElement(By.cssSelector("div.rb-calendar-month>ul>li[class='rb-next active"));
		element4.click();
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[1]"));
		element5.click();
		
		WebElement element6 = driver.findElement(By.cssSelector(".selected"));
		element6.click();
		WebElement element7 = driver.findElement(By.cssSelector(".fl.button"));
		element7.click();
		
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[4]/label[1]"));
		element8.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(element9));
		element9.click();

		List<WebElement> BusName = driver.findElements(By.xpath("//*[@id=\"result-section\"]/div/ul"));
		System.out.println(BusName.size());
		for(int i=0;i<BusName.size();i++) {
			System.out.println(BusName.get(i).getText());
		}
		

		//WebElement element4 = driver.findElement(By.cssSelector(".next"));
		//element4.click();
		//WebElement element5 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[1]"));
		//element5.click();
		//driver.findElement(By.cssSelector(".wd:nth-child(2)")).click();

	//	WebElement DateField1=driver.findElement(By.xpath(".w"));
		//DateField1.click();
		//WebElement dateField=driver.findElement(By.cssSelector("div.main-calendar>div.rb-calendar-month>ul"

	}

}
