//package com.technogeek.selenium;
//
//public class LaunchAppChromeChrome {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


package com.technogeek.selenium;
import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchAppChrome {
	
	WebDriver driver;
	
	
	
	
	public WebDriver LaunchAppChromelication(String browser) {
		if(browser.toUpperCase().equals(("CHROME"))){
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	return driver;
	}
	
	public void Assignment12(){
		
		WebDriver driver;
		LaunchAppChrome Browser = new LaunchAppChrome();
		driver = Browser.LaunchAppChromelication("chrome");
		driver.get("store.demoqa.com");
		String pageTitle = driver.getTitle();
		System.out.println("The Title of the Page is: " + pageTitle);
		String currURL = driver.getCurrentUrl();
		System.out.println("The URL of the Page is: " + currURL);
//		driver.close();
		driver.quit();
		
	}


	

public static void main(String[] args) {
	// TODO Auto-generated method stub

	LaunchAppChrome obj = new LaunchAppChrome();
	obj.Assignment12();	
}


}
