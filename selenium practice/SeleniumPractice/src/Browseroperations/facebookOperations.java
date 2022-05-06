package Browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookOperations {

	public static void main(String[] args) {
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path3);
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		cdriver.get("https://www.facebook.com");
		WebElement device=cdriver.findElement(By.cssSelector("._6ltg>a"));
		device.click();
		WebElement DayField=cdriver.findElement(By.name("birthday_day"));
		DayField.click();
		Select Selectday=new Select(DayField);

		System.out.println("Is it multiselect dropdownlist:"+Selectday.isMultiple());
		List<WebElement> options=Selectday.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		System.out.println("Is it enable:"+DayField.isEnabled());
		System.out.println("Already selected date is"+Selectday.getFirstSelectedOption().getText());

		//Selectday.selectByIndex(0);
		//Selectday.selectByValue("18");
		Selectday.selectByVisibleText("18");
		
		

		WebElement MonthField=cdriver.findElement(By.name("birthday_month"));
		MonthField.click();
		
		Select Selectmonth=new Select(MonthField);
		System.out.println("Multiple month is sElected or not:"+Selectmonth.isMultiple());
		
	List<WebElement> options1=Selectmonth.getOptions();
	System.out.println("All month is"+options1.size());
	for(int i=0;i<options1.size();i++)
	{
		System.out.println(" "+options1.get(i).getText());
	}
	System.out.println("Month field is enabled or not"+MonthField.isEnabled());
	System.out.println("Already selected month is"+Selectmonth.getFirstSelectedOption().getText());
	//Selectmonth.selectByIndex(8);
	//Selectmonth.selectByValue("September");
	Selectmonth.selectByVisibleText("Sep");
	
	
	
	
		WebElement YearField=cdriver.findElement(By.id("year"));
		YearField.click();
		

		Select Selectyear=new Select(YearField);
		System.out.println("Multiple month is sElected or not:"+Selectyear.isMultiple());
		
List<WebElement> options2=Selectyear.getOptions();
	System.out.println("All month is"+options2.size());
	for(int i=0;i<options2.size();i++)
	{
		System.out.println(" "+options2.get(i).getText());
	}
	System.out.println("Month field is enabled or not"+YearField.isEnabled());
	System.out.println("Already selected year is"+Selectyear.getFirstSelectedOption().getText());
	//Selectyear.selectByIndex(0);
	//Selectyear.selectByValue("1997");
	Selectyear.selectByVisibleText("1997");
	
	}

}
