package Browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path="D:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		ChromeDriver cdriver=new ChromeDriver();
        cdriver.get("https://www.facebook.com/login/");
        WebElement userinputfield=cdriver.findElement(By.id("email"));
        userinputfield.sendKeys("7028593596");
        WebElement Passwordinputfield=cdriver.findElement(By.id("pass"));
        Passwordinputfield.sendKeys("123456");
        WebElement Logininputfield=cdriver.findElement(By.id("login_link"));
        Logininputfield.click();
        WebElement firstnameinputfield=cdriver.findElement(By.name("firstname"));
        firstnameinputfield.sendKeys("Vishika");
        WebElement Lastnameinputfield=cdriver.findElement(By.name("lastname"));
        Lastnameinputfield.sendKeys("Gaikwad");
        WebElement Emailinputfield=cdriver.findElement(By.name("reg_email__"));
        Emailinputfield.sendKeys("7028593596");
        WebElement Passwordinputfield1=cdriver.findElement(By.name("reg_passwd__"));
        Passwordinputfield1.sendKeys("123456");
        WebElement dateinputfield=cdriver.findElement(By.name("birthday_day"));
        dateinputfield.sendKeys("18");
        WebElement monthinputfield=cdriver.findElement(By.name("birthday_month"));
        monthinputfield.sendKeys("September");
        WebElement yearinputfield=cdriver.findElement(By.name("birthday_year"));
        yearinputfield.sendKeys("1997");
        WebElement genderinputfield=cdriver.findElement(By.name("_58mt"));
        genderinputfield.click();



       
        
	}

}
