package com.obsqura.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageExpenseTest extends BaseTest{

	@Test
	public void ExpenseCategory() {
		
		lp.Login();
		hp.navigateToExpenseCategory();
		String expenseCreatedText = ecp.createExpense();
		
		Assert.assertEquals(expenseCreatedText, "Expense Category Created Successfully", "Failed to match expense alert Text");
			
	}
	
}
