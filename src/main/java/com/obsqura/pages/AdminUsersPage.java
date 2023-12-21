package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class AdminUsersPage extends PageUtility{
	WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(css = ".fa-save")
	private WebElement saveBtn;

	@FindBy(id = "username")
	private WebElement userNameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(id = "user_type")
	private WebElement userTypeSelectDropdown;
	
	@FindBy(xpath = "//tbody//tr[1]//td[1]")
	private WebElement tableUserName;
	
	@FindBy(xpath = "//tbody//tr[1]//td[2]")
	private WebElement tableUserType;

	@FindBy(css = ".alert.alert-success")
	private WebElement userAlert;
	
	public void createAdmin(String userNameVal, String passwordVal,String userTypeVal) {
		clickElement(newBtn);
		setTextBox( userNameInput, userNameVal);
		setTextBox(passwordInput, passwordVal);
		selectDropdown(userTypeSelectDropdown, userTypeVal);
		clickElement(saveBtn);
	}
	
	public String validateAlert() {
		String text=getElementText(userAlert);
		String [] arr=text.split("Alert!");
		return arr[1].trim();
	}
	
	public String createdUserNameAppearsInTable() {
		return getElementText(tableUserName);
		 
	}
	
	public String createdUserTypesInTable() {
		 return getElementText(tableUserType);
	}
	
}
