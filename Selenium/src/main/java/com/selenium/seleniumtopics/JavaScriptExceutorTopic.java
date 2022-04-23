package com.selenium.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExceutorTopic {
	
	/*
	 *  Every application have clinet and server
	 *  
	 *  server is nothing but where our application is deployed
	 *  
	 *  When you perfoem any operation clinet will send request to server and server will perform the specified operation then
	 *  it send resopnse to clinet in generlly 
	 *  
	 *  But we can alspo perform some some operation on the browser (clinet ) itself without going to the server, to perform such operation we are using the JavavscriptExceutor
	 *  
	 *  in the simple words :
	 *  --------------------
	 *  
	 *   if we feel any functionlity is not available in the selenium and if you feel that you can do perform that particular functionality by  using javascript
	 *  then you can done that using JavascriptExecuto
	 *  
	 *  ex :  I want to enter the the text in the text box :  i can achieve this functionality using selenium
	 *       if suppose selenium dont provide any functionality to enter the text in the text box 
	 *       
	 *       then you should analyse whether you we can perform this particular entering text by using the Javascript ?   if yes,  you can run the java script ( enter the text ) in the selenium by using javascriptExceutor 
	 *       
	 *    ex : selenium dont hava hightlight functionlaity 
	 *    so we analysed the whether you can achieve the hightligt functionality using java script , analayse result is yes : we can done hightlight of any element using java script 
	 *    so We need to execute the java script in our selenium ,so selenium provide way to perform this ,  so we can achieve this by using Javascript executor 
	 *    
	 *    so we can run this java script using the JavascriptExecutor   
	 *       
	 *  
	 *  JavascriptExecutor is Interface 
	 *  1)Object executeScript(String script, Object... args);
	 *  2)Object executeAsyncScript(String script, Object... args);

	 *  
	 */
	
    /*
     *  We can Learn two thing 
     *  
     *    FindElement (selenium )  + javascript operations
     *    Findelement (javascript) + java script operations
     * 
     */
	
	/*
	 *  In the Javascript " document"  is the root 
	 *  
	 *  
	 *  Identifying element using javascripts 
	 *  
	 *    Id       :document.getElementById("firstName")
	 *    name:    :document.getElementsByName("lName")[0]
	 *    ​tagName  :document.getElementsByTagName("input")[2]
	 *    xpath    :document.evaluate("//*[@id='firstName']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue
	 *    
	 *    
​          SendKeys : :    document.getElementById("firstName").value=10
	 *    
	 *    clear :: document.getElementById("firstName").value
	 *    click() :  document.getElementById("registerbtn").click()
	 */  
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		// we are going to execute the java script so we need to typecast driver to javascriptexeceutor
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("document.getElementsByTagName(\"input\")[0].value='sadhubrahmanandeddy'");  // sendkeys using javascriptExecutor
		javascriptExecutor.executeScript("document.getElementById(\"hindichbx\").click()");
		Object dataObject=javascriptExecutor.executeScript("return document.getElementsByTagName(\"input\")[0].value");   // return the values 
		System.out.println(dataObject);
		
		
		/*
		 *  Finding through javascript and perform action through selenium
		 */
		WebElement spanishChcekBox = (WebElement) javascriptExecutor.executeScript("return document.getElementById('spanishchbx');");
		spanishChcekBox.click();
		
		
		/*
		 *  Finding through selenium and perform action using javascript 
		 */
		
		WebElement findElement = driver.findElement(By.id("registerbtn"));
		
		javascriptExecutor.executeScript("arguments[0].click()", findElement);
		
		/*
		 *  background color
		 */
		
      javascriptExecutor.executeScript("document.getElementById(\"firstName\").style.background='yellow'");
      
      /*
       *   Border settings
       */
      
      javascriptExecutor.executeScript("document.getElementById(\"firstName\").style.border=\"4px red solid\"");
		
		
		
		/*
		 *  border and background
		 */
      javascriptExecutor.executeScript("document.getElementById(\"lastName\").setAttribute('style','border:2px red solid; background:yellow')");
        javascriptExecutor.executeScript("document.getElementById(\"email\").style='border:2px red solid; background:yellow'");
		
        
        
      /*
       *    Scroll actions
       *     scroll/scrollTo()  --> once scroll to specified position it no longer scroll even if we call one nmore time 
       *     scrollBy()   --> it scroll every time from current position eac h time when it calling 
       *     scrollIntoView() --> scroll to a particulat Webelement 
       *     
       *     
       *    
       */
		
        WebElement recentTutorials = driver.findElement(By.xpath("//h2[.='Recent Tutorials']"));
        
        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",recentTutorials);
        
        Thread.sleep(3000);
        
        javascriptExecutor.executeScript("window.scroll(10,200)");
        
        Thread.sleep(3000);
        javascriptExecutor.executeScript("window.scrollBy(10,400)");
        
        
		//driver.quit();
		
	}

}
