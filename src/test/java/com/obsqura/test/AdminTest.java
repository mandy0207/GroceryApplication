package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.Util.ExcelReaderUtility;
import com.obsqura.Util.RandomNumberUtility;

public class AdminTest extends BaseTest{

	
	@Test
	public void createAdmin() throws IOException {
		
		String userNameVal=ExcelReaderUtility.getStringData(1, 0)+ RandomNumberUtility.getUniqueRandomNumber();
		String passwordVal=ExcelReaderUtility.getStringData(1, 1);
		String userTypeVal=ExcelReaderUtility.getStringData(1, 2);
		lp.Login();
		hp.navigateToAdminUsers();
		au.createAdmin(userNameVal, passwordVal, userTypeVal);
		
		/**
		 * Validate user is created
		 * 
		 */
		String userAlert=au.validateAlert();
		Assert.assertEquals(userAlert, "User Created Successfully", "User created Assertion failed");
		
		String actualUserName=au.createdUserNameAppearsInTable();
		String actualUserType=au.createdUserTypesInTable();
		/**
		 * Assertions for user created in Table
		 */
		Assert.assertEquals(actualUserName, userNameVal);
		Assert.assertEquals(actualUserType.toLowerCase(), userTypeVal.toLowerCase());
		
		
	}
}
