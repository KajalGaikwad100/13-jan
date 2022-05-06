package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class Cricinfoassignment2 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.espncricinfo.com/");
	    WebElement Menu2=driver.findElement(By.id("wzrk-confirm"));
	    Menu2.click();
		
	    List<WebElement> Menu3=driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[3]/div/nav/div/div/div/div[2]/div[1]/div/a"));
		//driver.switchTo().alert().accept();
	
	    System.out.println("Main menu option count :"+Menu3.size());
		Actions act=new Actions(driver);
		for(int i=0;i<Menu3.size();i++) {
	System.out.println("***********"+Menu3.get(i).getText()+"********************");
		act.moveToElement(Menu3.get(i)).perform();
		
		List<WebElement> submanu=driver.findElements(By.xpath("//*[@id=\\\"main-container\\\"]/div[3]/div/nav/div/div/div/div[2]/div[1]/div/a(i)"));
		//.navbar-nav>li:nth-child(
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

		}
	}

//button[@id='wzrk-confirm']