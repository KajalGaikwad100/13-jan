package Browseroperations;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

import Utilities.SeleniumUtility;


	public class Assignment10 {

		public static void main(String[] args) throws InterruptedException {
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");

			WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
			username.sendKeys("laxmikant");
			System.out.println("username is display= " + username.isDisplayed());
			System.out.println("username is enable=" + username.isEnabled());
			System.out.println("username is selected=" + username.isSelected());
			Actions act = new Actions(driver);

			WebElement lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
			lastname.sendKeys("Mule", Keys.TAB);
			System.out.println("lastname is display= " + lastname.isDisplayed());
			System.out.println("lastname is enable=" + lastname.isEnabled());
			System.out.println("lastname is selected=" + lastname.isSelected());
			lastname.click();

			WebElement Address = driver
					.findElement(By.cssSelector("textarea[class='form-control ng-pristine ng-valid ng-touched']"));
			Address.sendKeys("Chandan nagar,Pune", Keys.ENTER, Keys.TAB);
			System.out.println("Address is display= " + Address.isDisplayed());
			System.out.println("Address is enable=" + Address.isEnabled());
			System.out.println("Address is selected=" + Address.isSelected());
			// input[type='email']

			WebElement Email = driver.findElement(By.cssSelector("input[type='email']"));
			Email.sendKeys("laxmikantmule33@gmail.com", Keys.ENTER, Keys.TAB);
			System.out.println("email is display= " + Email.isDisplayed());
			System.out.println("email is enable=" + Email.isEnabled());
			System.out.println("email is selected=" + Email.isSelected());
			// input[type='tel']

			WebElement MobNo = driver.findElement(By.cssSelector("input[type='tel']"));
			MobNo.sendKeys("9730387934", Keys.ENTER, Keys.TAB);
			System.out.println("MobNo is display= " + MobNo.isDisplayed());
			System.out.println("MobNo is enable=" + MobNo.isEnabled());
			System.out.println("MobNo is selected=" + MobNo.isSelected());
			// input[value='Male']

			WebElement Gender = driver.findElement(By.cssSelector("input[value='Male']"));
			Gender.click();
			System.out.println("Gender is display= " + Gender.isDisplayed());
			System.out.println("Gender is enable=" + Gender.isEnabled());
			System.out.println("Gender is selected=" + Gender.isSelected());
			// input[value='Cricket']

			WebElement Hobbies = driver.findElement(By.cssSelector("input[value='Cricket']"));
			Hobbies.click();
			System.out.println("Hobbies is display= " + Hobbies.isDisplayed());
			System.out.println("Hobbies is enable=" + Hobbies.isEnabled());
			System.out.println("Hobbies is selected=" + Hobbies.isSelected());

			WebElement H4 = driver.findElement(By.xpath("//body"));
			H4.sendKeys(Keys.PAGE_DOWN);
			WebElement lan1 = driver.findElement(By.cssSelector(".ui-autocomplete-multiselect:nth-child(1)"));
			lan1.click();
			List<WebElement> Lan = driver.findElements(By.cssSelector(".ui-autocomplete>li"));
			System.out.println(Lan.size());
			for (int i = 0; i < Lan.size(); i++) {
				System.out.println(Lan.get(i).getText());
			}
			Lan.get(8).click();
			driver.findElement(By.cssSelector("body")).click();;
			
			WebElement SkilloDropdown = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
			Select dropdown = new Select(SkilloDropdown);
			System.out.println("option is multiple or not check :" + dropdown.isMultiple());
			List<WebElement> NoOfOptions = dropdown.getOptions();
			System.out.println("list count and text" + NoOfOptions.size());
			Thread.sleep(3000);
			for (int i = 0; i < NoOfOptions.size(); i++) {
				System.out.println("option " + i + " " + NoOfOptions.get(i).getText());
			}
				dropdown.selectByIndex(5);
				
				
				System.out.println("**Country****");
				WebElement CountryField=driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
				CountryField.click();
				
				WebElement SearchField=driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]"));
				SearchField.click();
				driver.findElement(By.xpath("//body")).click();
			//	SearchField.sendKeys(Keys.TAB);
				System.out.println("**Country****");

				System.out.println("**Date Of Birth****");

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

//		WebElement Refreshbutton=driver.findElement(By.id("Button1"));
//		Refreshbutton.click();
//		System.out.println("Refresh buttton is cliackable or not"+Submitbutton.isDisplayed());
	//
//		driver.navigate().refresh();

			}

		}

	
