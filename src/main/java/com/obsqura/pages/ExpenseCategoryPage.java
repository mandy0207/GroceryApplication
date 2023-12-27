package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Utils.PageUtility;
import com.obsqura.Utils.UniqueGenerator;

public class ExpenseCategoryPage extends PageUtility {

	WebDriver driver;
	
	public  ExpenseCategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = ".btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(id = "name")
	private WebElement title;

	@FindBy(css = "[name='Create']")
	private WebElement saveBtn;
	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextExpenseCreated;
	
	
	
	public String createExpense() {
		clickElement(newBtn);
		setTextBox(title, UniqueGenerator.getUniqueString());
		clickElement(saveBtn);
		String alertText = getElementText(alertTextExpenseCreated);
		return 	alertText.split("!")[1].trim();
	
	}
	
	
}
