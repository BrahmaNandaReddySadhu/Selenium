package com.selenium.SeleniumFour;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class CustomCDPMethodExceution {
	public static void main(String[] args) {
		
		
		/*
		 *  How to execute the custom chrome devtools protocols (CDP) if selenium dont have created a CDP interact method
		 */
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools =driver.getDevTools();
		
		devTools.createSession();
		
		Map<String, Object> setDeviceMetricsOverride  = new HashMap<String, Object>();
		
		setDeviceMetricsOverride .put("width", 480);
		setDeviceMetricsOverride .put("height",890);
		setDeviceMetricsOverride .put("deviceScaleFactor", 0);
		setDeviceMetricsOverride .put("mobile",true );
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", setDeviceMetricsOverride);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
			
		

		
		
	}

}
