package com.selenium.seleniumtopics;

import java.util.Set;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesTopics {
	
	/*
	 *   When you open a browser through automation  , it loaded with the some default desired capabilities
	 *   
	 *   if you want to add more desired capabilities to your driver while opening you need to specify them using Desired Capability class
	 *   
	 *   This desired capability is very old one , which contains all common browser desired capability 
	 *   
	 *   later on every browser implemnts their own desired capabiliry  using ChromeOptions,FirefoxOptions  edgeOptions......
	 */
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();

//	DesiredCapabilities capabilities = new DesiredCapabilities();
//	Set<String> capabilityNames = capabilities.getCapabilityNames();
//	capabilityNames.size();
//	for (String string : capabilityNames) {
//		System.out.println(string);
//	}
//	capabilities.acceptInsecureCerts();
//	capabilities.setJavascriptEnabled(true);
//	
//	WebDriver driver = new ChromeDriver(capabilities);
//	
	
	ChromeOptions options= new ChromeOptions();
	
	/*
	 *    headless mode 
	 */
	//options.addArguments("headless");
	//options.setHeadless(true);
	
	
	//options.addArguments("incognito");
	
	options.addArguments("--start-maximized");

	options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	
	System.out.println("complted");
	
	
	

	
	
	
	}

}
