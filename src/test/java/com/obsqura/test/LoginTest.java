package com.obsqura.test;
import java.io.IOException;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	
	@Test
	public void verifyLogin() throws IOException {
		
		lp.Login();
		
	}
}
