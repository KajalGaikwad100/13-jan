package Browseroperations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {
		String Path="D:\\JavaWorkspace\\SeleniumPractice\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
FirefoxDriver fdriver=new FirefoxDriver();

	}

}
