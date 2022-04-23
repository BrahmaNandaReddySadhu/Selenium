package com.selenium.seleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.browsersetup.BaseClassForDriverSetUp;
import com.selenium.utilities.UtilityClass;

public class AlertsAndPopUps extends BaseClassForDriverSetUp {

	public void alertBox() {

		/*
		 *    Alerts are coming form the java script , so we can not inspect them 
		 *    so selenium provide the special way to handle the Alerts
		 *    3 types of alerts
		 *    
		 *    1) alert box
		 *    2) confirmation box
		 *    3) prompt box
		 *    
		 *    
		 *    we can switch to alert by using driver.switchTo().alert()
		 *    
		 *    accept()
		 *    dismiss()
		 *    
		 *    
		 */
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement alertBox=driver.findElement(By.id("alertBox"));
        UtilityClass.jsClick(alertBox);
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
       // alert.dismiss();
        
        
       
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	public void confirmationBox() {

		/*
		 *    Alerts are coming form the java script , so we can not inspect them 
		 *    so selenium provide the special way to handle the Alerts
		 *    3 types of alerts
		 *    
		 *    1) alert box
		 *    2) confirmation box
		 *    3) prompt box
		 */

		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement confirmBox=driver.findElement(By.id("confirmBox"));
        UtilityClass.jsClick(confirmBox);
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
       // alert.accept();
       // alert.dismiss();
        
        
     //   driver.quit();
	}
	
	public void promptBox() {

		/*
		 *    Alerts are coming form the java script , so we can not inspect them 
		 *    so selenium provide the special way to handle the Alerts
		 *    3 types of alerts
		 *    
		 *    1) alert box
		 *    2) confirmation box
		 *    3) prompt box
		 */
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement confirmBox=driver.findElement(By.id("promptBox"));
        UtilityClass.jsClick(confirmBox);
        
        Alert prompt = driver.switchTo().alert();
        System.out.println(prompt.getText());
        prompt.sendKeys("Sadhu brahma nanda reddu");
        prompt.accept();
       // alert.dismiss();
        
	}


	
	
	public static void main(String[] args) {
		AlertsAndPopUps object = new AlertsAndPopUps();
		object.alertBox();
		object.confirmationBox();
		object.promptBox();
	}

}
