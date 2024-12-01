package com.selenium.SeleniumFour;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v129.emulation.Emulation;

public class LocalizationTesting {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		// 1st way - common method

		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);

		driver.findElement(By.xpath("//*[text()='https://www.netflix.com']")).click();

		// 2nd way- directly calling the selenium build in method for the location

		devTools.send(Emulation.setGeolocationOverride(Optional.of(61), Optional.of(105), Optional.of(1)));
		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);

		driver.findElement(By.xpath("//*[text()='https://www.netflix.com']")).click();

	}

}
