package com.obsqura.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.Util.RandomNumberUtility;
import com.obsqura.Util.UniqueGenerator;

public class CreateDeliveryBoy extends BaseTest {

	@Test
	public void createDeliverytBoy() throws IOException, InterruptedException {
		
		lp.Login();
		hp.navigateToManageDeliveryBoy();
		String name =UniqueGenerator.getUniqueString();
		String userName = RandomNumberUtility.getRandomString();
		int password= RandomNumberUtility.getUniqueRandomNumber();
		
		dlp.createDeliverBoy(name, userName, password );
		String alertText = dlp.validateDeliveryBoyIsCreated();
		
		/**
		 * Perform assertion 
		 */
		
	}
}
