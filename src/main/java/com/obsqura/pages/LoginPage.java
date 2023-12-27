package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Utils.PageUtility;
import com.obsqura.Utils.TestProperties;

public class LoginPage extends PageUtility{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	public void Login() throws IOException {
		String usernameVal=TestProperties.getProperties().getProperty("username");
		String passwordVal=TestProperties.getProperties().getProperty("password");
		setTextBox(username, usernameVal);
		setTextBox(password, passwordVal);
		clickElement(submitBtn);
		
	}
	
	
}
