package com.obsqura.test;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class LoginTest extends BaseTest{

	
	@Test
	public void verifyLogin() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
			
	
	}
}
