package com.obsqura.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility {

	WebDriver driver;
	public PageUtility(WebDriver driver) {
      this.driver= driver;
	}

	public void clickElement(WebElement element) {
		element.click();
	}

	public void setTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
}
