package Browseroperations;

	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class SeleniumPrograms3 {

		public static void main(String[] args) {
			
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					//creating an object of chromedriver class and upcasting it to WebDriver interface
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					//implicit wait
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					//enter required application url
					driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");				
				
					driver.switchTo().frame("iframeResult");
					//1. Identify the dropdown list and store it into WebElement
					WebElement dropdownList=driver.findElement(By.name("cars"));

					/*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
				   WebElement as a parameter in its constructor  */ 
					Select s1 =  new Select(dropdownList);
					System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
					
					//Op1: count the options present in dropdown
					List<WebElement> options=s1.getOptions();
					System.out.println("Option  count: "+options.size());
					//op2: print all the option name
					for(int i=0;i<options.size();i++) {
						System.out.println(options.get(i).getText());
					}
					//op4: select required value from dropdown
					s1.selectByVisibleText("Volvo"); //or
					s1.selectByValue("opel");//or
					s1.selectByIndex(3);
					//Op5: get only selected options
					List<WebElement> selectedOption=s1.getAllSelectedOptions();
					System.out.println(selectedOption.size());
					for(int i=0;i<selectedOption.size();i++) {
						System.out.println(selectedOption.get(i).getText());
					}
					//op6: unselecting the selected options
					//s1.deselectByVisibleText("Volvo"); //or
					//s1.deselectByValue("html");//or
					//s1.deselectByIndex(7);
					s1.deselectAll();		
					
					//close current instance of browser
					driver.close();				
		}

	}

