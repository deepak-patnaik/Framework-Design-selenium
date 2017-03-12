package com.technogeek.selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LogInGmail {

	
	WebDriver driver;
	
	
	public WebDriver LaunchApp (String browser) {
		if(browser.toUpperCase().equals(("IE"))){
			System.setProperty("webdriver.ie.driver", "C:/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.toUpperCase().equals(("CHROME"))){
			System.setProperty("webdriver.ie.driver", "C:/JPractice/chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	
		
		return driver;
	}
	
	
		
	public void Gmail() throws InterruptedException{
		
		WebDriver driver;
		LogInGmail obj = new LogInGmail();
		
		driver = obj.LaunchApp("chrome");
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("Email")).clear();
		//Provide user name
		driver.findElement(By.name("Email")).sendKeys("deepakpatnaik.qa");
		driver.findElement(By.id("next")).click();
		
		// Provide password 
//		
//		driver.findElement(By.xpath("//*[@id='Passwd']")).clear();
		Thread.sleep(12000);
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys("WrongInput");
		
		driver.findElement(By.id("signIn"));
		Thread.sleep(12000);
		
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        LogInGmail obj = new LogInGmail();
        obj.Gmail();
		
	}

}
