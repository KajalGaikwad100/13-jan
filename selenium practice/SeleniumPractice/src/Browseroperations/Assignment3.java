package Browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		String Path3="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path3);
		ChromeDriver Cdriver=new ChromeDriver();
	Cdriver.get("https://www.google.com");
	String getsourcecode=Cdriver.getPageSource();
	System.out.println("Application source code"+getsourcecode);
	System.out.println("Application source code length"+getsourcecode.length());
	String expectedTitle="google search";
	String actualTitle=Cdriver.getTitle();
	System.out.println("Application nname is:"+	Cdriver.getCurrentUrl());

System.out.println("Application nname is:"+	Cdriver.getTitle());
	
Cdriver.close();
	}

}
