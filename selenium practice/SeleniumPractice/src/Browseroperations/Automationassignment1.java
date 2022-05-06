package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class Automationassignment1 {


	public static void main(String[] args) throws InterruptedException  {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		System.out.println("************************Mouse operations*******************");
	List<WebElement> mainmanu=driver.findElements(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li"));
	System.out.println("Main menu option count :"+mainmanu.size());
	Actions act=new Actions(driver);
	for(int i=0;i<mainmanu.size();i++) {
System.out.println("***********"+mainmanu.get(i).getText()+"********************");
	act.moveToElement(mainmanu.get(i)).perform();
	
	List<WebElement> submanu=driver.findElements(By.cssSelector(".navbar-nav>li:nth-child("+(i+1)+")>ul>li>a"));
         if(submanu.size()>0)
         {
        	 for(int j=0;j<submanu.size();j++)
        	 {
        		 System.out.println(submanu.get(j).getText());
        	 }
         }else
         {
        	 System.out.println("*****No Sub Menus**************");
         }
	
	}		
	Thread.sleep(2000);

		System.out.println("*************************************************");
		WebElement FirstNamefield=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstNamefield.sendKeys("FName");
		System.out.println("FirstNameField");
		System.out.println(FirstNamefield.isDisplayed());
		System.out.println(FirstNamefield.isEnabled());
		System.out.println(FirstNamefield.isSelected());
		System.out.println("************************************");
		WebElement LastNamefield=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastNamefield.sendKeys("LName",Keys.TAB);
		System.out.println(LastNamefield.isDisplayed());
		System.out.println(LastNamefield.isEnabled());
		System.out.println(LastNamefield.isSelected());
		LastNamefield.click();
		
		System.out.println("************************************");
		WebElement Addressfield=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		Addressfield.sendKeys("abcdefgh",Keys.TAB);
		System.out.println(Addressfield.isDisplayed());
		System.out.println(Addressfield.isEnabled());
		System.out.println(Addressfield.isSelected());
		System.out.println("************************************");

		WebElement Emailfield=driver.findElement(By.xpath("//input[@type='email']"));
		Emailfield.sendKeys("abc@gmail.com");
		System.out.println(Emailfield.isDisplayed());
		System.out.println(Emailfield.isEnabled());
		System.out.println(Emailfield.isSelected());
		System.out.println("************************************");
		
		WebElement Phonefield=driver.findElement(By.xpath("//input[@type='tel']"));
		Phonefield.sendKeys("1234567890");
		System.out.println(Phonefield.isDisplayed());
		System.out.println(Phonefield.isEnabled());
		System.out.println(Phonefield.isSelected());
		System.out.println("************************************");
		WebElement genderfield=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
		genderfield.click();
		System.out.println(genderfield.isDisplayed());
		System.out.println(genderfield.isSelected());
		System.out.println(genderfield.isEnabled());

		System.out.println("************************************");

		WebElement hobbyfield=driver.findElement(By.xpath("(//div/div/input[@id='checkbox1'])[1]"));
		hobbyfield.click();
		System.out.println("Hobby is"+hobbyfield.isSelected());
		System.out.println("Hobby is"+hobbyfield.isDisplayed());
		System.out.println("************************************");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		
	WebElement languages=driver.findElement(By.xpath("//div[@id='msdd']"));
	languages.click();
	WebElement langselect=driver.findElement(By.xpath("//div[@style='display: block;'][1]/ul/*[16]"));
	langselect.click();
		driver.findElement(By.xpath("//body")).click();

		WebElement SkillsField=driver.findElement(By.xpath("//div/div/select[@id='Skills']"));
		SkillsField.click();
		Select skills=new Select(SkillsField);
		List<WebElement> options1=skills.getOptions();
		System.out.println("All month is"+options1.size());
		for(int i=0;i<options1.size();i++)
		{
			System.out.println(" "+options1.get(i).getText());
		}
		skills.selectByVisibleText("Java");
		driver.findElement(By.xpath("//body")).click();
System.out.println("**********************Country****************************");
		WebElement CountryField=driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		CountryField.click();
		WebElement SearchField=driver.findElement(By.xpath("//*[@id=\"country\"]/option[6]"));
		SearchField.click();
		driver.findElement(By.xpath("//body")).click();
		System.out.println("******************Country********************************");

	
		System.out.println("********************Date Of Birth******************************");

		WebElement YearField=driver.findElement(By.id("yearbox"));
		YearField.click();
		

		Select Selectyear=new Select(YearField);
		System.out.println("Multiple month is sElected or not:"+Selectyear.isMultiple());
		
List<WebElement> options3=Selectyear.getOptions();
	System.out.println("All month is"+options3.size());
	for(int i=0;i<options3.size();i++)
	{
		System.out.println(" "+options3.get(i).getText());
	}
	System.out.println("Month field is enabled or not"+YearField.isEnabled());
	System.out.println("Already selected year is"+Selectyear.getFirstSelectedOption().getText());
	//Selectyear.selectByIndex(0);
	//Selectyear.selectByValue("1997");
	Selectyear.selectByVisibleText("1997");
	
	driver.findElement(By.xpath("//body")).click();

	WebElement MonthField=driver.findElement(By.xpath("(//select[@type='text'])[4]"));
	MonthField.click();
	
	Select Selectmonth=new Select(MonthField);
	System.out.println("Multiple month is sElected or not:"+Selectmonth.isMultiple());
	
List<WebElement> options4=Selectmonth.getOptions();
System.out.println("All month is"+options4.size());
for(int i=0;i<options4.size();i++)
{
	System.out.println(" "+options4.get(i).getText());
}
System.out.println("Month field is enabled or not"+MonthField.isEnabled());
System.out.println("Already selected month is"+Selectmonth.getFirstSelectedOption().getText());
//Selectmonth.selectByIndex(8);
//Selectmonth.selectByValue("September");
Selectmonth.selectByVisibleText("September");

WebElement DayField=driver.findElement(By.id("daybox"));
DayField.click();
Select Selectday=new Select(DayField);

System.out.println("Is it multiselect dropdownlist:"+Selectday.isMultiple());
List<WebElement> options5=Selectday.getOptions();
System.out.println("Option count is:"+options5.size());
//Get dropdown option names
for(int i=0;i<options5.size();i++) {
	System.out.println("Option "+i+": "+options5.get(i).getText());
}
System.out.println("Is it enable:"+DayField.isEnabled());
System.out.println("Already selected date is"+Selectday.getFirstSelectedOption().getText());

//Selectday.selectByIndex(0);
//Selectday.selectByValue("18");
Selectday.selectByVisibleText("18");
driver.findElement(By.xpath("//body")).click();

System.out.println("******************Password********************************");

WebElement Passwordfield=driver.findElement(By.id("firstpassword"));
Passwordfield.click();
Passwordfield.sendKeys("123456");
WebElement confirmPasswordfield=driver.findElement(By.id("secondpassword"));
confirmPasswordfield.click();
confirmPasswordfield.sendKeys("123456");

WebElement Submitbutton=driver.findElement(By.id("submitbtn"));
System.out.println("Submit buttton is cliackable or not"+Submitbutton.isDisplayed());
System.out.println("Submit buttton is cliackable or not"+Submitbutton.isEnabled());

//WebElement Refreshbutton=driver.findElement(By.id("Button1"));
//Refreshbutton.click();
//System.out.println("Refresh buttton is cliackable or not"+Submitbutton.isDisplayed());

//driver.navigate().refresh();

	}

}
