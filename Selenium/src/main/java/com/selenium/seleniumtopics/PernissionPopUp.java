package com.selenium.seleniumtopics;

import java.util.HashMap;

import org.checkerframework.checker.signature.qual.BinaryNameWithoutPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PernissionPopUp {

	
	/*  Even though applicationhave the pop ups , these are displayed by browsers , so we need to handle these pops ups at the browser level , 
	 * so we need to use the  handleby using either  
	 * 
	 * DesiredCapabilities  --> comming  form the Selenium 
	 * ChromeOptions   --. comming from the individual browsers like chome
	 *    
	 */
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		
		 /*
		  *  Block the entire popup
		  */
		options.addArguments("--start-maximized");
//		options.addArguments("disable-geolocation");
//		options.addArguments("disable-notifications");
	//	options.addArguments("disable-media_stream");
		
		
		
		/*
		 *   Allow , not allow , pop up using the below hiracrchy 
		 */
				
						
		/*    
		 * Hierachy of the to set the
		 * 
		 * 
		 *    Chromeoption 
		 *       
		 *        prefs    -> key,value
		 *         
		 *            profile   --> key,value
		 *            
		 *                managed_default_content_settings    --> key , value 
		 *                   
		 *                   
		 *                         notifications          
		 *                         geolocation
		 *                         media_stream
		 *                         
		 *                         
		 *                         0-- Ask default
		 *                         1- allow
		 *                         2-Block
		 * 
		 */
		
		
		HashMap<String, Integer> status = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		
		
		
		
		//status.put("notifications", 0);
		status.put("media_stream", 0);
		profile.put("managed_default_content_settings", status);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		
		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://mictests.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='mic-launcher']")).click();
		System.out.println("testing");
		
		/*
		 * https://chromium.googlesource.com/chromium/src/+/7e762c1f17514a29834506860961ba2f24e7e6e5/components/content_settings/core/common/pref_names.cc 
		 */
		
		
		
	}
}
