package com.selenium.seleniumtopics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotWebdriverReference {
public static void main(String[] args) throws Exception {
	
	/*
	 *   
	 */
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	
	/*
	 *   Stroring the Screenshot as File Type 
	 */
	
	File sourceFile =screenshot.getScreenshotAs(OutputType.FILE);
	
	File destinationFile =new File("./Resources/screenshots/googlepage1.jpg");
	
	try {
		FileUtils.copyFile(sourceFile, destinationFile);
	} catch (IOException e) {
	   System.out.println("Exception Occured ...");
		e.printStackTrace();
	}
	
	
	/*
	 *   Stroring the Screenshot as Base 64
	 */
	String sourceBase64 = screenshot.getScreenshotAs(OutputType.BASE64);
	
	File destinationBase64 =new File("./Resources/screenshots/googlepage2.jpg");
	
	byte[] decode = Base64.getDecoder().decode(sourceBase64);
	
	FileOutputStream base64 = new FileOutputStream(destinationBase64);
	base64.write(decode);
	
	
	/*
	 *    Stroring the Screenshot Byte array
	 */
	
	byte[] sourceByte=screenshot.getScreenshotAs(OutputType.BYTES);
	
	File destinationByteFile = new File("./Resources/screenshots/googlepage3.jpg");
	
	FileOutputStream fileOutputStream = new FileOutputStream(destinationByteFile);
	
	fileOutputStream.write(sourceByte);
	
	
	
}

public void captureScreenshotUtility ( WebDriver driver,String destination) {
	
	TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
	
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	File destinationPathFile = new File(destination);
	try {
		FileUtils.copyFile(sourceFile, destinationPathFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
