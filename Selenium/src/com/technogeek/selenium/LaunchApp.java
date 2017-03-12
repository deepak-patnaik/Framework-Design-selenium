package com.technogeek.selenium;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchApp {
	
	WebDriver driver;
	
	
	
	
	public WebDriver launchapplication(String browser) {
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
	
	public void Assignment1() throws InterruptedException{
		
		WebDriver driver;
		LaunchApp Browser = new LaunchApp();
		driver = Browser.launchapplication("chrome");
		driver.get("store.demoqa.com");
//		/*Thread.sleep(1000);*/
		String pageTitle = driver.getTitle();
		System.out.println("The Title of the Page is: " + pageTitle);
		String currURL = driver.getCurrentUrl();
		System.out.println("The URL of the Page is: " + currURL);
//		driver.close();
		driver.quit();
		
	}

	public void navigateRegistration() throws InterruptedException {
	
		WebDriver driver;
		LaunchApp browser = new LaunchApp();
		driver = browser.launchapplication("chrome");
		driver.get("http://www.DemoQA.com");
//		driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
//		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.partialLinkText("Registratio")).click();
		int x = driver.findElements(By.tagName("href")).size();
		System.out.println("value is "+ x);
		driver.navigate().back();
		Thread.sleep(10500);
		driver.navigate().forward();
		Thread.sleep(10500);
//		driver.navigate().to("http://www.google.co.in");
		driver.navigate().refresh();
		Thread.sleep(10500);
//		driver.findElements(By.xpath(""));
		
		driver.quit();
		
	}
	

public void practice2(){
	WebDriver driver;
	LaunchApp ie = new LaunchApp();
	driver = ie.launchapplication("chrome");
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	driver.findElement(By.name("firstname")).clear();
	driver.findElement(By.name("firstname")).sendKeys("Deepak");
	driver.findElement(By.name("lastname")).sendKeys("Patnaik");
	driver.findElement(By.id("submit")).click();
	driver.quit();
}
	


@SuppressWarnings("unused")
public void DropDown() throws InterruptedException{
	WebDriver driver;
	LaunchApp obj1 = new LaunchApp();
	driver = obj1.launchapplication("chrome");
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	WebElement element = driver.findElement(By.id("continents"));
	
	Select drpdwn = new Select(element);
	
	int a = 0;
//	a = drpdwn.getAllSelectedOptions().size();
	a = drpdwn.getOptions().size();
	drpdwn.selectByIndex(1);
	Thread.sleep(12000);
	drpdwn.selectByVisibleText("Africa");
	
	Thread.sleep(12000);
	System.out.println("Number of Elements available are: " + a);
	
	for (int i=0; i<a; i++) {
		String val = drpdwn.getOptions().get(i).getText();
		System.out.println("The Current Selected Element is : " + val);
	}
	
	
	driver.findElement(By.id("submit")).click();
	driver.quit();
	
	
	
}


public void ComboBox() throws InterruptedException{
	WebDriver driver;
	LaunchApp obj = new LaunchApp();
	driver = obj.launchapplication("chrome");
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	WebElement e = driver.findElement(By.id("selenium_commands"));
	
	Select multiple = new Select(e);
	
	int a = multiple.getOptions().size();
	
	
//	multiple.isMultiple();
	
	multiple.selectByVisibleText("Browser Commands");
	Thread.sleep(6000);
	multiple.deselectByIndex(0);
	multiple.selectByVisibleText("Navigation Commands");
	Thread.sleep(6000);
	multiple.deselectByIndex(1);
	multiple.selectByVisibleText("Switch Commands");
	Thread.sleep(6000);
	multiple.deselectByIndex(2);
	multiple.selectByVisibleText("Wait Commands");
	Thread.sleep(6000);
	multiple.deselectByIndex(3);
	Thread.sleep(12000);
	
	for (int i=0; i<a; i++) {
		String val = multiple.getOptions().get(i).getText();
		System.out.println("The Available Elements are : " +val);
		
	}
	
	driver.quit();
	
	
}

	
public void AlertTest() throws InterruptedException{
	
	WebDriver driver;
	LaunchApp obj = new LaunchApp();
	driver = obj.launchapplication("chrome");
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	
	JavascriptExecutor jb = (JavascriptExecutor)driver;
	jb.executeScript("window.scrollBy(0,200)", "");
	
//	Thread.sleep(12000);
//	WebDriverWait wait = new WebDriverWait(driver, 60);
//	Alert alert= wait.until(ExpectedConditions.alertIsPresent());
//	alert.accept();
//	wait.until(ExpectedConditions);
	
	
	
	driver.findElement(By.id("alert")).click();
	
	
	driver.quit();
}


	
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	LaunchApp obj = new LaunchApp();
//	obj.navigateRegistration();
//	obj.practice2();
//	obj.DropDown();
//	obj.ComboBox();
	obj.AlertTest();
//	int x = obj.driver.findElements(By.tagName("href")).size();
//	System.out.println("The number of HyperLinks are" + x);
}


}
