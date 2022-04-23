package com.selenium.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.selenium.browsersetup.BaseClassForDriverSetUp;
import com.selenium.utilities.UtilityClass;

public class RadioButtonCheckBoxLink extends BaseClassForDriverSetUp{
	
	public void testRadioButton() {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement username = driver.findElement(By.id("femalerb"));
		UtilityClass.highlightWebElement(username);
		UtilityClass.jsClick(username);
		driver.quit();
	}
	public void testCheckBox() throws InterruptedException {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		WebElement english = driver.findElement(By.id("englishchbx"));
		WebElement french = driver.findElement(By.id("frenchchbx"));
		WebElement spanish = driver.findElement(By.id("spanishchbx"));
		WebElement chinese = driver.findElement(By.id("chinesechbx"));
				
		UtilityClass.checkOrUncheck(english, "uncheck");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(english, "check");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(french, "check");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(french, "uncheck");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(spanish, "check");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(chinese, "uncheck");
		Thread.sleep(3000);
		UtilityClass.checkOrUncheck(chinese, "check");
		Thread.sleep(15000);
		driver.quit();
	}
	public void testLink() {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://github.com/login");
		WebElement username = driver.findElement(By.xpath("//*[contains(.,'Forgot password?')]"));
		UtilityClass.highlightWebElement(username);
		UtilityClass.jsClick(username);
		driver.quit();
		
	}
	
	public void openingBrowser() throws InterruptedException {
		/*  
		 * By default browser session will not open with the maximium size 
		 *  We can perform the browser seetings using drver.manage() functions
		 */ 
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://github.com/login");
		System.out.println(driver.manage().window().getPosition());   //(10,10)
		System.out.println(driver.manage().window().getSize());      //(945,1020)
		//driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println(driver.manage().window().getPosition());  // (-8,-8)
		System.out.println(driver.manage().window().getSize());      //(1936,1056)
		
		//driver.manage().window().fullscreen();   // open the browser in full screen mode 
		
		driver.manage().window().setPosition(new Point(10, 30));
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(1020, 377));
		
		driver.quit();
		
		
	}
	public static void main(String[] args) {
		
		RadioButtonCheckBoxLink object = new RadioButtonCheckBoxLink();
		
		try {
			object.testCheckBox();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		object.testLink();
        object.testRadioButton();
		
				
		try {
			object.openingBrowser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
