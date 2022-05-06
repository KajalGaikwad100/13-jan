package Browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {

	public static void main(String[] args) {
		String Path="D:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
ChromeDriver cdriver=new ChromeDriver();
cdriver.get("https://www.google.com");
String sourcecode=cdriver.getPageSource();
System.out.println("Application sourcecode is"+sourcecode);
System.out.println("Application length is"+sourcecode.length());
System.out.println("Application current url"+cdriver.getCurrentUrl());
System.out.println("Appliacation current URL"+cdriver.getTitle());
cdriver.close();

	}

}
