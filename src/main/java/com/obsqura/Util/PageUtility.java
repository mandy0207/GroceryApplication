package com.obsqura.Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility extends WaitUtility {

	WebDriver driver;
	public PageUtility(WebDriver driver) {
	  super(driver);
      this.driver= driver;
	}

	public void clickElement(WebElement element) {
		element.click();
	}

	public void setTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public String getElementText(WebElement element) {
		return element.getText();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void scrollToBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
	}
	
}
