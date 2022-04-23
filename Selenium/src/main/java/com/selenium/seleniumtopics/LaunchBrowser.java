package com.selenium.seleniumtopics;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory;

public class LaunchBrowser {

	/*
	 *   We have WedDriver interface 
	 *   RemoteWebdriver implements Webdriver Interface which contains all the common Features among all the browsers 
	 *   
	 *   if ChromeDriver class don't like the implementations of the RemoteWebdriver then chromedriver override the methods of the RemoteWebdriver 
	 *   In the Selenium Every browser has a separate class like ChromeDriver,FireFoxDriver......
	 *   
	 *   
	 *   Selenium library Does not interact with the browser directly because it don't know how to interact  , so we need one translator which establish the communication between the selenium and browsers , ie driver executable 
	 *   
	 *    for each and ever browser we have separate driver executable available  , so before perform any operation  we need to tell where this driver executable is available 
	 *    
	 *    so We are using   ----->   System.setProperty("webdriver.chrome.driver","location of the driver in your system")
	 *    
	 *    If the browser version and driver executables are miss matched then we unable to launch the browser 
	 *    
	 *    if the mismatch present in the versions then we got exception
	 *    
	 *    Exception in thread "main" org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 96
          Current browser version is 100.0.4896.127 with binary path C:\Program Files\Google\Chrome\Application\chrome.exe


	 *   At a time one  driver object can store one instance , if multiple tabs are there we need to we need to switch the driver focuse to perform the operations
	 *  
	 */

	public static void main(String[] args) throws Exception{

		/*
		 *  Setting the Driver Executable
		 *  
		 *  
		 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "path");
		FirefoxDriver firefoxDriver = new FirefoxDriver();

		System.setProperty("webdriver.ie.driver", "path");
		InternetExplorerDriver driver = new InternetExplorerDriver();

		System.setProperty("webdriver.edge.driver", "path");
		EdgeDriver edgeDriver = new EdgeDriver();


      */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		Thread.sleep(4000);
		
		
		/*
		 *  close() --> it closes currently focused  instance( either tabs or window)
		 *  quit() ---> it close all the opened windows instances ( it close all the child windows or tabs )
		 *   
		 */
		
		driver.findElement(By.xpath("//*[@class='lightbluecolor']//a")).click();
		Thread.sleep(3000);
		driver.quit();
		


	}
}
