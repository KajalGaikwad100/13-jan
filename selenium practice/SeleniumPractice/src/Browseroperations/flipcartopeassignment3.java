package Browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class flipcartopeassignment3 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
		WebElement Menu = driver.findElement(By.className("_2doB4z"));
		Menu.click();

		List<WebElement> Menu1=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div"));
		System.out.println("Flipacrt main  menu size is:"+Menu1.size());
		Actions act=new Actions(driver);

		System.out.println("Current page url: " + driver.getCurrentUrl());

		for(int i=0;i<Menu1.size();i++)
		{
			System.out.println("***********"+Menu1.get(i).getText()+"********************");
			act.moveToElement(Menu1.get(i)).perform();
			
		List<WebElement> SubMenu1=driver.findElements(By.xpath("//*[@id=\\\"container\\\"]/div/div[2]/div/div/div[5]/a/div[2]/div/div/svg/path"));
		//*[@id='header']/nav/div/div[2]/ul/li
		//".navbar-nav>li:nth-child("+(i+1)+")>ul>li>a"));
		if(SubMenu1.size()>0)
        {
       	 for(int j=0;j<SubMenu1.size();j++)
       	 {
       		 System.out.println(SubMenu1.get(j).getText());
       	 }
        }else
        {
       	 System.out.println("*****No Sub Menus**************");
        }
	
	}		

	}

}

