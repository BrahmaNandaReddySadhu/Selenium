package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
	/*
	 *   Selenium is open source library for automating Web applications
	 *   
	 *   Selenium suite consist of 4 components
	 *   1) Selenium IDE
	 *      it is a pluggin used for record and play back 
	 *   2)Selenium RC
	 *   3)Selenium Webdriver
	 *   
	 *   4)Selenium Grid
	 *      if we want to run the test cases in distributed mode (cross browser , parallel) then we use selenium grid
	 *      
	 *      
	 *   
	 *   Maven alos avaialble in the form of the jar file
	 *   
	 *   tar      -> mac
	 *   zip/rar --> window
	 *   
	 *   2 type of project 
	 *   1) Java  project  --> src,Jre library
	 *   2) Maven project
	 *   
	 *   
	 *   
	 *   
	 *   Maven project :
	 *   
	 *   File --> Other -->Mavne --> maven project --> create the maven project by provide the groupid,artifactid, version number 
	 *   
	 *   after create it will automatically download the certain file from the internet
	 *   
	 *   During this process , in our may be download will not complete due to proxy issues, 
	 *   
	 *   we can overcome this problem by
	 *   
	 *      1) contacting the network team for Internet access
	 *      2) using settings.xml file
	 *      
	 *      
	 *      
	 *   
	 *   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
      <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.1.3</version>
      </dependency>
      
      
      
        groupid ---> com.ibsplc.Iflight     com.ibsplc  --> company   , iflight --> product   [ under Iflight we have so many products] 
        artifactid --> iflight crew        [ Iflight crew is one product ]    
        
          

	 *      
	 */   
	 WebDriver driver =new ChromeDriver();
	 
	 
	
	

}
