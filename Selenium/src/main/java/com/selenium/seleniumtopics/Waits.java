package com.selenium.seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	public static void main(String[] args) {
		
		 // Architecture 
		
		
		/*             WebDriver        JavaScriptExceutor      TakesScreenshot                                            ---> Interfaces
		 * 
		 *   
		 *   
		 *                                  RemoteWebdriver                                     implements abobe Webdriver,JavaScriptExecutor,TakesScreenshot          
		 *                                  
		 *                                  
		 *       ChromiumDriver      FirefoxDriver     InternetExplorerDriver       OperaDriver          etc                            
		 * 
		 * 
		 *        ChromeDriver,EdgeDriver
		 * 
		 */
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		/*
		 *  Based on the browser name we are dynamiccaly creating the specifed browser instance  so that waht we 
		 *  
		 *  are using 
		 *  
		 *  Webdriver driver = new ChromeDriver();
		 
		
		WebDriver driver =null;
		
		
		String browserString = "get the property of the browser value from properties file";
		//     
		if(browserString.equals("chrome")) {
			driver =new ChromeDriver();
		}else if(browserString.equals("firefox")){
			driver= new FirefoxDriver();
		}
		
		RemoteWebDriver driver2 = new ChromeDriver();   // if we want to execute our scripts in the remote machine (not mandatory ) but based on the name we should create the 
		
		ChromeDriver driver3 =new ChromeDriver();       // if you want only use chromedriver , and my testcases didnt support other broswers except chrome then we use this line
		
		 */
		
		
		/*
		 * 
		 *    WebDriverWait   , FluentWait    Both are similar , WebDriverWait is Extending the FluentWait
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
          driver.findElement(By.id("btn1")).click();
		
		
		//driver.findElement(By.id("txt1")).isDisplayed();    //  org
	     wait.pollingEvery(Duration.ofMillis(1000));   // it is  checking  whether the element is available or not for every second  
          
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		
		driver.findElement(By.id("txt1")).sendKeys("hellow");
		
		FluentWait wait2 = new FluentWait(driver);
		
		wait2.withTimeout(Duration.ofSeconds(2));
		
		
		
		
	}

}
