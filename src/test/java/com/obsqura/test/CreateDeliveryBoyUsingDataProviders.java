package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.Utils.RandomNumberUtility;
import com.obsqura.Utils.UniqueGenerator;

public class CreateDeliveryBoyUsingDataProviders extends BaseTest {

	@Test(dataProvider="GetData")
	public void createDeliveryBoyDataProviders(String name, String userName, String password) throws IOException, InterruptedException {
		
		lp.Login();
		hp.navigateToManageDeliveryBoy();
		dlp.createDeliverBoy(name, userName, password );
		String actualDeliveryCreationMsg = dlp.validateDeliveryBoyIsCreated();
		
		/**
		 * Perform assertion 
		 */
		Assert.assertEquals(actualDeliveryCreationMsg, "Delivery Boy Details Created Successfully", "Failed to match  alert Text");
		
	}
	
	
	@DataProvider
	public String[][] GetData() {
		String data[][] = new String[2][3];
		// Declaring elements of ist row
		data[0][0] = UniqueGenerator.getUniqueString();
		data[0][1] =  RandomNumberUtility.getRandomString();
		data[0][2]= Integer.toString(RandomNumberUtility.getUniqueRandomNumber());

		// Declaring elements of second row
		data[1][0] =  UniqueGenerator.getUniqueString();;
		data[1][1] = RandomNumberUtility.getRandomString();;
		data[1][2]= Integer.toString(RandomNumberUtility.getUniqueRandomNumber());
		return data;
	
	}
	
	
}
