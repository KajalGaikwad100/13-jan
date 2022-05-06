package Browseroperations;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Facebookope {

		public static void main(String[] args) {
			String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", Path3);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			WebElement device=driver.findElement(By.cssSelector("._6ltg>a"));
			device.click();	
			WebElement dropdownList=driver.findElement(By.id("month"));
			Select s1 =  new Select(dropdownList);
			System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
			List<WebElement> options=s1.getOptions();
			System.out.println("Option  count: "+options.size());
			
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}

			String selectedValue=s1.getFirstSelectedOption().getText();
			System.out.println(selectedValue);		
			s1.selectByVisibleText("May");	
			System.out.println(s1.getFirstSelectedOption().getText());
			

		}

	}

