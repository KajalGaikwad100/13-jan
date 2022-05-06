package Browseroperations;



	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gsmrealmeoperations {

		public static void main(String[] args) {
			String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",Path3);
			ChromeDriver cdriver=new ChromeDriver();
			cdriver.manage().window().maximize();

			cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			cdriver.get("https://www.gsmarena.com");
			String ExpectedURL="https://www.gsmarena.com/";
			String Actualurl=cdriver.getCurrentUrl();
			if(ExpectedURL.equals(Actualurl))
			{
				System.out.println("Gsm open successfully");
			}
			else
			{
				System.out.println("gsm not open  successfully");

			}
				WebElement Menu = cdriver.findElement(By.cssSelector("a.pad-single.pad-finder"));
				System.out.println(Menu.getText());
			List<WebElement> Menu1 = cdriver.findElements(By.cssSelector("ul>li"));
			System.out.println("Size of menu is"+Menu1.size());
			System.out.println("List of mobile phone is");
			for(int i=0;i<Menu1.size();i++)
			{
			System.out.println(Menu1.get(i).getText());
			}
			 cdriver.findElement(By.cssSelector("div.brandmenu-v2 >ul>li:nth-of-type(14)>a")).click();
			
			WebElement Menu3 = cdriver.findElement(By.cssSelector("#review-body>div>ul>li:nth-of-type(1)"));

			int paginationSize =cdriver.findElements(By.cssSelector("div.nav-pages>a")).size();
			System.out.println("Pagination Size: " + paginationSize);

			WebElement page=cdriver.findElement(By.cssSelector("div.nav-pages>strong"));
			System.out.println("Page: "+page.getText());
			System.out.println(cdriver.getCurrentUrl());
			
			for (int i = 1; i<=paginationSize; i=i+1) {

				String paginationSelector = "div.nav-pages>a:nth-of-type("+i+")";
				WebElement opt = cdriver.findElement(By.cssSelector(paginationSelector));
				
				System.out.println("Page: "+opt.getText());
				opt.click();
				System.out.println(cdriver.getCurrentUrl());
				

				
		}

		} 
	}

