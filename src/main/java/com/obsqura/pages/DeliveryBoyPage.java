package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class DeliveryBoyPage extends PageUtility{

	WebDriver driver;
	
	public  DeliveryBoyPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = ".btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(id = "name")
	private WebElement nameInput;
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(css = "[name='create']")
	private WebElement saveBtn;
	
	
	public void createDeliverBoy(String name, String username, int password) throws InterruptedException {
		clickElement(newBtn);
		setTextBox(nameInput, name);
		setTextBox(usernameInput, username);
		setTextBox(passwordInput, Integer.toString(password));
		scrollToBottom();
     	waitUntilClickable(saveBtn);
		Thread.sleep(2000);

		clickElement(saveBtn);
		
			
	}
	
	public String validateDeliveryBoyIsCreated() {
		
		return "";
	}
	
	
}
