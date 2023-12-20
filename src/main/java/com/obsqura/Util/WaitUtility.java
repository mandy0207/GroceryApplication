package com.obsqura.Util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility  {

	WebDriver driver;
	WebDriverWait wait;
	
	public WaitUtility(WebDriver driver) {
	
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(0, 10));
	}


	
	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	
	public void waitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
}
