package com.selenium.SeleniumFour;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileEmulatorTest {

	// https://chromedevtools.github.io/devtools-protocol/tot/Emulation/

	/*
	 * this class is used to how we can open the browser
	 */
	public static void main(String[] args) throws InterruptedException {

		// 1. instantiate the chromium driver

		/// chrome driver extends the Chromum Driver so , we are creating the
		/// chromedriver object directly

		ChromeDriver driver = new ChromeDriver();

		// 2. Instantiate the devtool object by getDevTools() method

		DevTools devTools = driver.getDevTools();

		// 3. create session

		devTools.createSession();

		// 4. send the command to chrome devtool protocol (CDP) ->CDP method will invoke
		// and get access to chrome dev tools

		devTools.send(Emulation.setDeviceMetricsOverride(500, 896, 0, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty()));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("navbar-toggler-icon")))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[text()='Cart']")))).click();

		driver.close();

	}

}
