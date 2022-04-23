package com.selenium.seleniumtopics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.selenium.browsersetup.BaseClassForDriverSetUp;

public class WindowHandles extends BaseClassForDriverSetUp{

	public void windowHadlesWindowTesting() {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> allWindows  = driver.getWindowHandles();
		
		int size=allWindows.size();
		System.out.println(size);
		
		for(String value : allWindows) {
			System.out.println(value);
			
			if(!value.equals(parentWindow)) {
			   driver.switchTo().window(value);
			   System.out.println(driver.getWindowHandle());
			   System.out.println(driver.getTitle());
			}
		}
		
		String childWindow = driver.getWindowHandle();
		driver.findElement(By.id("firstName")).sendKeys("AAAAAAAA");
		
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("name")).sendKeys("Brahma");
		
		
		driver.quit();
		
		
		
	}
	
	public void windowHadlesTabTesting() throws InterruptedException {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> allWindows  = driver.getWindowHandles();
		
		int size=allWindows.size();
		System.out.println(size);
		
		for(String value : allWindows) {
			System.out.println(value);
			
			if(!value.equals(parentWindow)) {
			   driver.switchTo().window(value);
			   System.out.println(driver.getWindowHandle());
			   System.out.println(driver.getTitle());
			}
		}
		
		String childWindow = driver.getWindowHandle();
		System.out.println("child window handle .......");
		driver.findElement(By.id("confirmBox")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().dismiss();
		

		driver.close();
		System.out.println(" switching ---- parent ");
		driver.switchTo().window(parentWindow);
		
		
		System.out.println("siwtched to parent ............................... ");
		
	//	Thread.sleep(4000);
    
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		 driver.findElement(By.id("newTabBtn")).click();
		System.out.println("over");
		
		driver.close();
		
		
		//driver.findElement(By.id("name")).sendKeys("brahma");
		 driver.switchTo().window(childWindow);
		 
		 driver.switchTo().window(parentWindow);   // try to acceess the window once it close :   NosunchWindowExceptions

		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		WindowHandles object = new WindowHandles();
		//object.windowHadlesWindowTesting();
		object.windowHadlesTabTesting();
	}
	
	
}
