package Browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class actitimeassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");

		WebElement Usernamefield=driver.findElement(By.id("username"));
		Usernamefield.sendKeys("admin");
		Usernamefield.click();
		WebElement Passwordfield=driver.findElement(By.name("pwd"));
		Passwordfield.sendKeys("manager");
		Passwordfield.click();
		WebElement Loginfield=driver.findElement(By.id("loginButton"));
		Loginfield.click();
String ExpectedURL="https://demo.actitime.com/user/submit_tt.do";
String ActualURL=driver.getCurrentUrl();
if(ExpectedURL.equals(ActualURL))
{
	System.out.println("Login done successfully");
}
else
{
	System.out.println("Login not done successfully");
}
WebElement Taskfield=driver.findElement(By.id("container_tasks"));
Taskfield.click();
WebElement addnewfield=driver.findElement(By.className("addNewButton"));
addnewfield.click();
WebElement addnewtaskfield=driver.findElement(By.className("createNewTasks"));
addnewtaskfield.click();
//WebElement dropdownList1=driver.findElement(By.xpath("//*[@id=\\\"createTasksPopup_content\\\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[4]"));
//dropdownList1.click();
//WebElement dropdownList=driver.findElement(By.xpath("//*[@id=\\\"createTasksPopup_content\\\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[1]/div[3]"));
//dropdownList.click();
WebElement addtask=driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[1]"));
addtask.click();
addtask.sendKeys("electrical1");
WebElement addtaskchecklist=driver.findElement(By.xpath("(//span[@class='checkmark checkMark'])[2]\r\n"));
addtaskchecklist.click();
WebElement createtask=driver.findElement(By.xpath("	//div[@class='commitButtonPlaceHolder']\r\n"));
createtask.click();

WebElement searchtask=driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[2]"));
searchtask.click();
searchtask.sendKeys("Flight support");
searchtask.click();

//System.out.println("Task added successfully");
WebElement selectnewtask=driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/div"));
//selectnewtask.click();
//WebDriverWait wait=new WebDriverWait(driver,20);

WebElement checkbox = driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td/div/div"));
checkbox.click();
//
//delete task
WebElement delete = driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[6]"));
delete.click();
//delete permanently
WebElement prodelete = driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div/span"));
prodelete.click();


	}
	

}
