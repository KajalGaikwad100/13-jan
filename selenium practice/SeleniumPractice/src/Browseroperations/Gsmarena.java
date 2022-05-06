package Browseroperations;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gsmarena {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gsmarena.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			if (driver.getTitle().equals("GSMArena.com - mobile phone reviews, news, specifications and more...")) {
				System.out.println("Home Page Open Sucessfully.");
			} else {
				System.out.println("Either Home page not open correclty or page title not found.");
			}

			driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:nth-of-type(1)")).click();

			int paginationSize = driver.findElements(By.cssSelector("div.nav-pages>a")).size();
			System.out.println("Pagination Size: " + paginationSize);

			WebElement page=driver.findElement(By.cssSelector("div.nav-pages>strong"));
			System.out.println("Page: "+page.getText());
			System.out.println(driver.getCurrentUrl());
			
			for (int i = 1; i<=paginationSize; i=i+1) {

				String paginationSelector = "div.nav-pages>a:nth-of-type("+i+")";
				WebElement opt = driver.findElement(By.cssSelector(paginationSelector));
				
				System.out.println("Page: "+opt.getText());
				opt.click();
				System.out.println(driver.getCurrentUrl());
				

			}

		}




		}

