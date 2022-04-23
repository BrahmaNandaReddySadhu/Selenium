package com.selenium.seleniumtopics;

import com.selenium.browsersetup.BaseClassForDriverSetUp;

public class Frames extends BaseClassForDriverSetUp{
	
	public  static void hadleFrames() {
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
	}
	
	public static void main(String[] args) {
		hadleFrames();
	}

}
