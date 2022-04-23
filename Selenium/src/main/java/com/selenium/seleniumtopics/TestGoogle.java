package com.selenium.seleniumtopics;

import com.selenium.browsersetup.BaseClassForDriverSetUp;

public class TestGoogle extends BaseClassForDriverSetUp {
public static void main(String[] args) {
	BaseClassForDriverSetUp.init_browser("chrome");
	BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	
	
//	driver.quit();
//	driver.getCurrentUrl();    //      afer quit driver trying to perform operation:     org.openqa.selenium.NoSuchSessionException     
	
	
	driver.close();
	driver.getCurrentUrl();  //  aftre close trying to perform operation :                 java.net.SocketException:   and    org.openqa.selenium.NoSuchSessionException
	
}
	
}
