package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class HomePage extends PageUtility {

	WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manangeExpenseBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Expense Category')]")
	private WebElement expenseCategoryBtn;
	
	public void navigateToExpenseCategory() {
		manangeExpenseBtn.click();
		expenseCategoryBtn.click();
	}
	
	
}
