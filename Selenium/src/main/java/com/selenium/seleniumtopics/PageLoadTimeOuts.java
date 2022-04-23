package com.selenium.seleniumtopics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOuts {
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://hyrtutorials.com/");
		//driver.get("https://.google.com/");
		
		/*
		 *   PageLoadTimeOut: 
		 *   -----------------
		 *   Deafult page load time out value is 300 seconds --> 5 min - 300000 milli seconds
		 *   
		 *   
		 *   Applicable for the complete driver instance 
		 *   (used in  when opening new tabs , window)
		 *   
		 *   
		 *   
		 *   page load timeout : what is the maximum time driver should wait untill page is load
		 *   
		 *   if page is unable to load to with in the specicied page load time then it should give "" org.openqa.selenium.TimeoutException: "
		 *   
		 *    page load time is  -- 5 seconds
		 *    
		 *    My webste is loaded at 1 st only , then driver will execute the next operations with out waiting for the untill 5 secondd
		 *    
		 *    
		 *    
		 *    ImplicitWait()  :  what is the minimum time the  driver  should wait for identifying particular Webelements before throwing the exeption if it unable to identify the webelement 
		 *    
		 *    Default implicit wait time is --> 0 milliseconds
		 *    
		 *    if we set implicit wait it will applicab;e for the entire browser seession means  for each ans every Web element finding it looking for the implicit wait
		 *    
		 *    
		 *    
		 *    
		 *    		 *    
		 */
		
		/*  
		 *   Implicit Wait    : should used carefully  because for each and every driver.findElement() 
		 *   
		 
		 *   
		 *   
		 *   
		 *   
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
		
		
		
		/*
		 *  Page Load Time Out 
		 */
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		
		driver.findElement(By.id("txt1")).isDisplayed();    //  org.openqa.selenium.NoSuchElementException:    because this webelement is loaded after 5 sceconds , so we should use impliit wait 
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
