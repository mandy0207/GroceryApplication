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
	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextDeliverBoyCreated;
	
	public void createDeliverBoy(String name, String username, String password) throws InterruptedException {
		clickElement(newBtn);
		setTextBox(nameInput, name);
		setTextBox(usernameInput, username);
		setTextBox(passwordInput, password);
		scrollToBottom();
     	waitUntilClickable(saveBtn);
     	clickUsingJavaScript(saveBtn);
		
	}
	
	public String validateDeliveryBoyIsCreated() {
		String text=getElementText(alertTextDeliverBoyCreated);
		String [] arr=text.split("Alert!");
		return arr[1].trim();
	}
	
	
}
