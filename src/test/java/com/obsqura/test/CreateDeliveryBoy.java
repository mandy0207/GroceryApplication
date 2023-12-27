package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.Utils.RandomNumberUtility;
import com.obsqura.Utils.UniqueGenerator;

public class CreateDeliveryBoy extends BaseTest {

	@Test
	public void createDeliveryBoy() throws IOException, InterruptedException {
		
		lp.Login();
		hp.navigateToManageDeliveryBoy();
		String name =UniqueGenerator.getUniqueString();
		String userName = RandomNumberUtility.getRandomString();
		String password= Integer.toString(RandomNumberUtility.getUniqueRandomNumber());
		
		dlp.createDeliverBoy(name, userName, password );
		String actualDeliveryCreationMsg = dlp.validateDeliveryBoyIsCreated();
		
		/**
		 * Perform assertion 
		 */
		
		Assert.assertEquals(actualDeliveryCreationMsg, "Delivery Boy Details Created Successfully", "Failed to match  alert Text");
		
	}
}
