package Browseroperations;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class gsmarenaassignment {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gsmarena.com/");
			System.out.println("current url " + driver.getCurrentUrl());
			System.out.println("get title =" + driver.getTitle());
			String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
			String actualTitle = driver.getTitle();

			if (actualTitle.equals(expectedTitle)) {
				System.out.println("login successfully");
			} else {
				System.out.println("Either Title not CORRECT  or page Title got changed");
			}
	        WebElement FlipcartMenu = driver.findElement(By.cssSelector("div.brandmenu-v2>ul>li:nth-of-type(14)"));
	        FlipcartMenu.click();
			 System.out.println("current url " + driver.getCurrentUrl());
			 
			 List<WebElement> FlipcartMenu1 = driver.findElements(By.cssSelector("div.nav-pages>a"));
			 
			 for (WebElement option1 : FlipcartMenu1) {
					String option = option1.getText();
					System.out.println("Cricket site mean name  is:" + option);

				 System.out.println("current url " + driver.getCurrentUrl());
			 
				List<WebElement> FlipcartMenu2 = driver.findElements(By.xpath("//div[@id='review-body']/div/ul/li/a"));
				 for(int i=0;i<FlipcartMenu2.size();i++) {
					 
				 
				 System.out.println(""+FlipcartMenu2.get(i).getText());
				 }
					 System.out.println("current url " + driver.getCurrentUrl());
		}

		}
		
	}
