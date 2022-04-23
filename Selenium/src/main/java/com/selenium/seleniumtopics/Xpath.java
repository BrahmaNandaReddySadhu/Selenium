package com.selenium.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	public static WebDriver driver;
	
	/*
	 *  XPath is query language for selecting the nodes for xml documents
	 *  XPath id query language to finding the Webelement on the html document 
	 *  
	 *  Xpath --> 2type
	 *  1) Absolute    --> used   /    -->   /html/body/div[3]/main/div/div[4]/form/input[2]
	 *  2) Relative    --> used   //   -->   //form/input
	 *  
	 *  
	 *  1) Xpath  using Attributes
	 *  
	 *  -------------------------
	 *  syntax:
	 *  
	 *   // TagName[@Attribute="value"]
	 * 
	 *   example:
	 *   
	 *     //input[@name="login"]
	 *  
	 *    
	 *  2) Xpath Operators:
	 *  ------------------
	 *  =     //*[@id="username"]
	 *  !=    //*[@id != "username"]
	 *  >
	 *  <
	 *  >=
	 *  <=
	 *  
	 *  
	 * 3) Conditional operators
	 *  ----------------------
	 *  and  --> //*[text()>='5000' and text()='5000']
	 *  or   --> //*[text()>='5000' or text()='5000']     //*[@id="aaa" and @id="bbb" and @name="uese" or @id="value"]
	 *  not  --> //*[not (text()>='5000')]    //*[not(@name="brahma")]
	 *  
	 *  
	 *  4) Indexes :  worst scenario
	 *  -------------------------
	 *    
	 *    (//*[@name='name'])[1]
	 *  
	 *  5) Obtain the last element among the multiple   --> using  last()
	 *   --------------------------------------------------------------
	 *   
	 *   //*[@id='contactList']/tbody/tr [last()]
	 *   
	 *   
	 *  6)  xpath functions :
	 *  ---------------------
	 *   a)   text()
	 *   b)   contains()
	 *   c)   starts-with()
	 *   d)   normalize-space()
	 *   e)   last
	 *   f)   position
	 *   
	 *   
	 *   text : need to use the entire text exactly how it present 
	 *   --------------------------------------------------------
	 *   
	 *   //*[text()='Buy me a coffee']
	 *   
	 *   
	 *   contains():   text , attribute 
	 *   --------------------------------
	 *   
	 *   text -->  //*[contains(text(),'Subscribe to YouTube cha')]
	 *   
	 *   attribute -->   //*[contains(@name,'name')]
	 *   
	 *   
	 *   starts-with :  text , attribute 
	 *   -------------------------------
	 *   
	 *   text --->       //*[starts-with(text(),'First')]
	 *   attribute -->   //*[starts-with(@for,'psw')]
	 *   
	 *   
	 *   
	 *   last() -- it always give the last element
	 *   
	 *   position()  : we can use the all conditional statements in position
	 *   : give all the rows whose position is <5
	 *   
	 *   (//*[@id='contactList']/tbody/tr)[position()<=5]
	 *   
	 *   
	 *   normalize-space(): removing the ending and starting spaces
	 *   ------------------------------------------------------------
	 *   
	 *   //label[normalize-space(text()) ="Username or email address"]
	 *   
	 *   
	 *   Xpath  axes :   finding the element based on the other element 
	 *   
	 *   ancestor  -> ancestor ,ancestor-or-self
	 *   parent    ->
	 *   sibling   -> preceding-sibling,following-sibling
	 *   child     ->
	 *   descendant-> descendant , descendant-or-self
	 *   
	 *  
	 *  (//*[text()='Maria Anders']/following-sibling::td)[2]
	 *  
	 *  //*[@id='contactList']//descendant::tr//td[4]
	 *  
	 *  //*[text()='Francisco Chang']/parent::*
	 *  
	 *  //*[text()='Roland Mendel']/preceding-sibling::td
	 *  
	 *  
	 *  //*[text()='Roland Mendel']/preceding-sibling::td/child::input[@type="checkbox"]
	 *  
	 *  //*[text()='Roland Mendel']//following-sibling::td[last()]/child::a
	 *  
	 *  
	 *   parent :  //*[text()='Roland Mendel']/..      ---> /..
	 *   
	 *   child : /
	 *   descendant: //
	 *   text() ->  .      --->     //*[.='Roland Mendel']  
	 *  
	 */

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

		WebElement headerTitle = driver.findElement(By.xpath("//*[contains(@class,'auth-form-header')]/h1"));
		highLightElement(headerTitle);
		System.out.println(headerTitle.getText());    //Sign in to GitHub

		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot pass"));
		highLightElement(forgotPassword);
		System.out.println(forgotPassword.getText());  // Forgot password? 

		String userNameTextValue = username.getAttribute("value");
		System.out.println(userNameTextValue);  // sadhubrahmananadareddy
		
		String attribute = driver.findElement(By.xpath("//*[text()='Privacy']")).getAttribute("data-analytics-event");
		System.out.println(attribute);
		
		driver.quit();
		
		
	}
	
  public static void highLightElement(WebElement element) {
	  JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	  javascriptExecutor.executeScript("arguments[0].setAttribute('style','border:1px red solid ; background:yellow')", element);
  }
  
}
