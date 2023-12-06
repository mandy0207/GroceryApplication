package com.obsqura.test;

import org.testng.annotations.Test;

public class ManageExpenseTest extends BaseTest{

	@Test
	public void ExpenseCategory() {
		
		lp.Login();
		hp.navigateToExpenseCategory();
			
	}
	
}
