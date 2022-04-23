package com.selenium.seleniumtopics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.browsersetup.BaseClassForDriverSetUp;
import com.selenium.utilities.UtilityClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeatherShpper extends BaseClassForDriverSetUp{

	public void testMoisturaizer() {
		System.out.println("Moisture");
		WebElement moistureLink = driver.findElement(By.xpath("//button[.='Buy moisturizers']"));
		UtilityClass.jsClick(moistureLink);
		
		List<WebElement> almondElements  = driver.findElements(By.xpath("//*[@class='container']//descendant::div[@class='text-center col-4']/p[contains(text(),'Almond') or contains(text(),'almond')]"));
	    
		int size = almondElements.size();
		System.out.println("product size"+size);
		
		for (WebElement productsName:almondElements) {
			System.out.println(productsName.getText());
		}
	}
	public void testSunscreens() {
		System.out.println("Sunscreen");
		WebElement sunscreenLink = driver.findElement(By.xpath("//button[.='Buy sunscreens']"));
		UtilityClass.jsClick(sunscreenLink);
		List<WebElement> sunscreenElements = driver.findElements(By.xpath("//*[@class='container']//descendant::div[@class='text-center col-4']/p[contains(text(),'Sun') or contains(text(),'SPF')]"));
	    System.out.println(sunscreenElements.size());
	    
	    for (WebElement webElement : sunscreenElements) {
			System.out.println(webElement.getText());
		}
	
	}

	public static void main(String[] args) {
		WeatherShpper shoShpper = new WeatherShpper();

		init_browser("chrome");
		openUrl("https://weathershopper.pythonanywhere.com/");
		WebElement temparatureElement = driver.findElement(By.id("temperature"));
		System.out.println(temparatureElement.getText());
		String text = temparatureElement.getText();
		String[] array=text.split(" ");
		System.out.println(array[0]);
		//System.out.println(array[1]);
		//String replaceAll = text.replaceAll( "[^\\d]"," ");
		int parseInt = Integer.parseInt(array[0]);
		WebElement iconElement = driver.findElement(By.xpath("//*[@data-toggle=\"popover\"]"));
		iconElement.click();

		if(parseInt>19) {
			shoShpper.testMoisturaizer();
		}else {
			shoShpper.testSunscreens();
		}



	}

}
