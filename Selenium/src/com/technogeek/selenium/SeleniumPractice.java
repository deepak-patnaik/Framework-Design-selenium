package com.technogeek.selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumPractice {
	
	/* This class is about writing the code given for the practice. Use a good coding standard while writing the 
	 * code. Browser used for this program is 'Internet Explorer'.
	 * Authod =  Deepak Patnaik
	 * Date - 25-Feb-2017 */
	
	WebDriver bobject;
	
	public WebDriver LaunchApp (String browser) {
		if(browser.toUpperCase().equals(("IE"))){
			System.setProperty("webdriver.ie.driver", "C:/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
			bobject = new InternetExplorerDriver();
			bobject.manage().window().maximize();
		}
		
		return bobject;
	}
	
	
	public void PartialLinkTest() throws InterruptedException {
	
		WebDriver driver;
		SeleniumPractice obj = new SeleniumPractice();
		driver = obj.LaunchApp("ie");
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.findElement(By.partialLinkText("Partial")).click();
		Thread.sleep(12000);
		driver.quit();
		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Starting Execution of Selenium Practice Exercise 2");
		SeleniumPractice run = new SeleniumPractice();
		run.PartialLinkTest();
		System.out.println("Execution Successful");

	}

}
