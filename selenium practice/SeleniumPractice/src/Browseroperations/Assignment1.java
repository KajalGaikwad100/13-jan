package Browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		String Path1="D:\\\\JavaWorkspace\\\\SeleniumPractice\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path1);
		ChromeDriver Cdriver=new ChromeDriver();
	Cdriver.get("https://www.facebook.com");
	String getsourcecode=Cdriver.getPageSource();
	System.out.println("Application source code"+getsourcecode);
	System.out.println("Application source code length"+getsourcecode.length());
	

System.out.println("Application nname is:"+	Cdriver.getTitle());
	
Cdriver.close();

	}

}
