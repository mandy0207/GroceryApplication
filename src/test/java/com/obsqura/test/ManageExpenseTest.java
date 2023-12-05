package com.obsqura.test;

import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class ManageExpenseTest extends BaseTest{

	@Test
	public void ExpenseCategory() {
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		hp.navigateToExpenseCategory();
		
		
	}
	
}
