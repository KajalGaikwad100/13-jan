package Browseroperations;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.SeleniumUtility;

	

	public class Actiitimeassignment {

		public static void main(String[] args) {
			//set path to program 
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle().equals("actiTIME - Login"));
			// put username & password & click login button
			WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			user.sendKeys("admin");
			WebElement pass = driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input"));
			pass.sendKeys("manager");
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
			button.click();
		
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getCurrentUrl().equals("https://demo.actitime.com/login.do"));
			//click on task tab
			WebElement task = driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[4]/a"));
			task.click();
			//click on add task
			WebElement addtask = driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]"));
			addtask.click();
			//click on new Task
			WebElement newtask = driver.findElement(By.xpath("/html/body/div[19]/div[3]"));
			newtask.click();
			WebElement typeofwork = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div[2]/div"));
			typeofwork.click();
			//choose the work
			WebElement work = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div[1]/div/div/div[1]/div/div[3]/div"));
			work.click();
			
		}

	}
