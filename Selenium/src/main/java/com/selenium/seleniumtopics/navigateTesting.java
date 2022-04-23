package com.selenium.seleniumtopics;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.selenium.browsersetup.BaseClassForDriverSetUp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigateTesting  {
	
public static void main(String[] args) {
	
	/*
	 * 
	 *     Both of these methods are used for opening any URL in the browser, there is no diffrence between them 
	 *     
	 *     In facts these are synonyms for one another
	 *     
	 *     The only small difference that can be found is in the parameters
 	 *     
 	 *     get() method accepts only one string as parameter
 	 *     
 	 *     to () methods accepts String and URL Instance as the parameter
 	 *     
	 *     
	 * 
	 * 
	 *   driver.get()
	 *   --------------
	 *   {
	 *   
	 *  1)   public void get(String url) {
              execute(DriverCommand.GET(url));    ==> DriverCommand.GET(url)
           }
	 *   
	 *   }
	 * 
	 * driver.navigate().to(){
	 * ------------------------------
	 * 
	 *   @Override
        public void to(String url) {
           get(url);               --> Internally Callng the get() method
    }

        @Override
        public void to(URL url) {
         get(String.valueOf(url));
    }

	 * 
	 * 
	 * 
	 * }
	 */
	
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("https://github.com/");
	
	
	driver.navigate().to("https://www.facebook.com/");
}

}
