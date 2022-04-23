package com.selenium.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TextOperations {

	/*
	 * Text Box :
	 * 
	 *   We Can perform the different Operations like 
	 *   Enter text   --> sendKeys()
	 *   Remove text  --> clear()
	 *   get text     --> getText()
	 *   
	 * Label / Paragraphs/Header :
	 *    get the text   --> getText()
	 *   
	 * Buttons / Links
	 *    get text  --> getText()
	 *    click
	 *   
	 * Radio Button / check box
	 *     get the text  --> getText()
	 *     click/select/check
	 *     
	 * DropDowns :
	 * 
	 *     Get all the values
	 *     select the value
	 *     get the selected value
	 *     
	 * Calendar :
	 * 
	 *     Select the date
	 *     get the selected date
	 *      
	 *     
	 *    
	 */


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("sadhubrahmananadareddy");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sadhubrahmanandareddy");


		/*
		 *   We can the text of any tag  using     getText()
		 */
		WebElement headerTitle = driver.findElement(By.xpath("//*[contains(@class,'auth-form-header')]/h1"));
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




		driver.quit();


	}


}
