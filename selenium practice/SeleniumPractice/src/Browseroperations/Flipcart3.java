package Browseroperations;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;


	public class Flipcart3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
			WebElement Meanu = driver.findElement(By.className("_2doB4z"));
			Meanu.click();
			Actions act=new Actions(driver);
			List<WebElement> mainMenu=driver.findElements(By.cssSelector("div[class='xtXmba']"));
			//System.out.println("list of menu"+mainMenu.size());
			
			for(int i=0;i<mainMenu.size();i++) {
				System.out.println("list of menu....."+mainMenu.get(i).getText()+"................");
				act.moveToElement(mainMenu.get(i)).perform();
				
				List<WebElement> subMenu=driver.findElements(By.cssSelector("._2IjXr8>div>a"));	
		if(subMenu.size()>0) {
			for(int j=0;j<subMenu.size();j++) {
				System.out.println("list of menu"+subMenu.get(j).getText());
		}
			}else {
				System.out.println("no submenu");
			}

			}
		}

	}