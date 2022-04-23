package com.selenium.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.browsersetup.BaseClassForDriverSetUp;

public class DropDownHandles extends BaseClassForDriverSetUp{
	
	/*
	 *  Two Types of Dropdowns
	 *   1) single select dropdown --> able to select single value 
	 *   2) Multi select dropdown  --> able to select the multiple values
	 *   
	 *   Why drop downs?
	 *   
	 *   If i want to display the 100 country name as in my webpage ,
	 *   if i go with the check box large amount of the space will occupy
	 *   We can provide the select options by uising the Dropdown options
	 *   We can warp any number of thecountry options undersingle drop down , so dropdowm field occupy small  size in webpage
	 *   
	 *   
	 *   We can use Select class for the Dropdowns
	 *   for the Select class we need to provide the Webelement for which element trying to access for dropdown
	 *   
	 *   
	 *   We can select the options present inside the Select dropdown using
	 *   1) selectByIndex(int index)
	 *   
	 *   2) selectByValue(String value);
	 *   
	 *   3)  courseDropDown.selectByVisibleText(String text)
	 *   
	 *   
	 *   We can get the all the values form the dropdown using getOptions()
	 *   
	 *   getAllSelectedOptions()  -> List<WebElement>
	 *   getFirstSelectedOption() --> WebElement
	 *   getOptions()   --> List<WebElement>
	 *   
	 *    
	 */
	
	public void dropDownHandle() {
		
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement course=driver.findElement(By.id("course"));
		
		Select courseDropDown =new Select(course);
		courseDropDown.selectByIndex(3);
		courseDropDown.selectByValue("java");
		courseDropDown.selectByVisibleText("Java");
		
		
		// if you want get the all options present on the dropdown using getOptions() method which gives List of Webelements
		List<WebElement> options = courseDropDown.getOptions();
	
		for (WebElement webElement : options) {
			System.out.println(webElement.getText() +">>> " + webElement.getAttribute("value")); 
			 /*
			 Select
			 Java
			 Dot Net
			 Python
			 Javascript
			*/ 
		}
		
		
		/*
		 *  to displate the which elements is selected by using the getFirstSelectedOption() --> WebElement 
		 */
		WebElement firstSelectedOption = courseDropDown.getFirstSelectedOption();
		System.out.println("getFirstSelectedOption()");
		System.out.println(firstSelectedOption.getText()); 
		
		
		
		/*
		 * 
		 */
		/*
		 *    give the selected values among the values --> getAllSelectedOptions()  --- > List< WebElement>
		 */
		List<WebElement> allSelectedOptions = courseDropDown.getAllSelectedOptions();
		System.out.println("getAllSelectedOptions()");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		
		
		/*
		 *   deSelectOptionsare applcable for only multi seclection
		 *   
		 *    Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select
		 */ 
		//courseDropDown.deselectAll();   
		WebElement wrappedElement = courseDropDown.getWrappedElement();
		System.out.println("wrppwd element");
		System.out.println(wrappedElement);
		
		
		
		driver.quit();
		
		
		
		
	}
	
	
	public void multiSelecteDropDown() {
		/*
		 *  1) select the values/multiselect value
		 *  2) deselect the value
		 *  2) get the slected value / get multi selected value
		 *  
		 * 
		 */
		BaseClassForDriverSetUp.init_browser("chrome");
		BaseClassForDriverSetUp.openUrl("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	//	driver.manage().window().maximize();
		
		
		WebElement ide = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ide);
		
		ideDropdown.selectByVisibleText("IntelliJ IDEA");
		ideDropdown.selectByIndex(0);
		ideDropdown.selectByValue("ij");
		ideDropdown.deselectByValue("ij");
		ideDropdown.selectByValue("ij");
		
		List<WebElement> wrappedElement = ideDropdown.getOptions();
		for (WebElement webElement : wrappedElement) {
			System.out.println(webElement.getText());
		}
		
		List<WebElement> allSelectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		
		
		ideDropdown.deselectAll();
		
		List<WebElement> allSelectedOptions2 = ideDropdown.getAllSelectedOptions();
		System.out.println(allSelectedOptions2.size());
		
		System.out.println(ideDropdown.isMultiple());
		
		driver.quit();
		
		
		
	
		
	}
	
	public static void main(String[] args) {
		DropDownHandles object = new DropDownHandles();
		object.dropDownHandle();
		object.multiSelecteDropDown();
	}

}
