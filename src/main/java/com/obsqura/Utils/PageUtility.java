package com.obsqura.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	}
	
	public void clickUsingJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void selectDropdown(WebElement element, String visibleText) {
		
		Select staticDropdown = new Select(element);
		staticDropdown.selectByVisibleText(visibleText);
		
		
	}
	
}
