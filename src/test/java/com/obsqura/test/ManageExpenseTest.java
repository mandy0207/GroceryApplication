package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageExpenseTest extends BaseTest{

	@Test(groups="Smoke")
	public void ExpenseCategory() throws IOException {
		
		lp.Login();
		hp.navigateToExpenseCategory();
		String expenseCreatedText = ecp.createExpense();
		
		Assert.assertEquals(expenseCreatedText, "Expense Category Created Successfully", "Failed to match expense alert Text");
			
	}
	
}
