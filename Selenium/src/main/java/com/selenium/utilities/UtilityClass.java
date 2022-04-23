package com.selenium.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.selenium.browsersetup.BaseClassForDriverSetUp;

public class UtilityClass extends BaseClassForDriverSetUp{
	public static Boolean check =true;
	public static Boolean uncheck = false;
	public static JavascriptExecutor js;
	public static void  highlightWebElement(WebElement element) {
		js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:1px red solid; background:yellow')", element);

	}

	public static void jsClick(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void checkOrUncheck(WebElement element,String checkOrUncheck) {
		if(!element.isSelected()) {
		
		if(!element.isSelected() && checkOrUncheck.equalsIgnoreCase("check")) {
			element.click();
		}
		else if (!element.isSelected() && checkOrUncheck.equalsIgnoreCase("uncheck")) {
			System.out.println("user selected the uncheck options... so not selected any thing");
		}
		
	}
		else {
			
		    if (element.isSelected() && checkOrUncheck.equalsIgnoreCase("check")) {
				System.out.println("element is already slected ... so no need of any operations");
			}
			else if (element.isSelected() && checkOrUncheck.equalsIgnoreCase("uncheck")) {
				element.click();
			}	
			
		}
	}	

     
	
	
	
}
