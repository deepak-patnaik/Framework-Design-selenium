package com.technogeek.selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindows {
	
	WebDriver driver;
	
	public WebDriver LaunchBrowser(String browser){
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
	
	
	public void switchWindow() throws InterruptedException{
		
		WebDriver driver;
		SwitchWindows chrome = new SwitchWindows();
		driver = chrome.LaunchBrowser("Chrome");
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		String parenthandle = driver.getWindowHandle();
		System.out.println("Parent Handle is: " +parenthandle);
		
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
		
		String val= driver.getWindowHandle();
		driver.switchTo().window(val);
		driver.close();
	/*	for (String handle1 : driver.getWindowHandles()) {
			
			System.out.println(handle1);
			driver.switchTo().window(handle1);
			driver.switchTo().defaultContent();
			driver.close();
//			
//			driver.switchTo().window(handle1);
//			System.out.println("I'm the First Handle i.e. Parent: " +handle1);
//			driver.switchTo().window(handle1);
//			System.out.println("I'm now the new window" +handle1);
////			driver.switchTo().window(parenthandle);  #this doesn't make any sense as you are already on parent
//			System.out.println("Moving to Parent Window again:");
//			driver.switchTo().window(handle1);
//			System.out.println("Clicking on the Search option on the main page:");
//			driver.findElement(By.xpath("//*[@id='trigger-overlay']")).click();
//			Thread.sleep(3600);
//			driver.manage().window().getSize();
//			System.out.println("Now switch to the other window:");
//			driver.switchTo().window(handle1);
//			driver.switchTo().window(handle1).close();
			
			Thread.sleep(3600);
			
			
		}*/
		
		driver.quit();
	}
	

	public void mouseHover() throws InterruptedException {
		
		WebDriver driver;
		SwitchWindows chrome = new SwitchWindows();
		driver = chrome.LaunchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		Thread.sleep(3600);
		
//		Actions obj = new Actions()
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SwitchWindows br = new SwitchWindows();
		br.switchWindow();
//		br.mouseHover();
		
		
		
		// TODO Auto-generated method stub

	}

}
