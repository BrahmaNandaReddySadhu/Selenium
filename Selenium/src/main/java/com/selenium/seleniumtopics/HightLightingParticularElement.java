package com.selenium.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HightLightingParticularElement {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://github.com/login");
		WebElement username=driver.findElement(By.id("login_field"));
		highLightElement( username);
		username.sendKeys("sadhubrahmananadareddy");

		WebElement password = driver.findElement(By.id("password"));
		highLightElement(password);
		password.sendKeys("sadhubrahmanandareddy");


		/*
		 *   We can the text of any tag  using     getText()
		 */
		WebElement headerTitle = driver.findElement(By.xpath("//*[contains(@class,'auth-form-header')]/h1"));
		highLightElement(headerTitle);
		System.out.println(headerTitle.getText());    //Sign in to GitHub



		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot pass"));
		System.out.println(forgotPassword.getText());  // Forgot password? 


		/*
		 *  Obtains the text entered in the  inside the text box     ---> getAttribute("value")
		 *  
		 *  getAttribute("any Attribute name")
		 */

		String userNameTextValue = username.getAttribute("value");
		System.out.println(userNameTextValue);  // sadhubrahmananadareddy

		
		
		
	}
	
  public static void highLightElement(WebElement element) {
	  JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	  javascriptExecutor.executeScript("arguments[0].setAttribute('style','border:1px red solid ; background:yellow')", element);
  }
  
}
