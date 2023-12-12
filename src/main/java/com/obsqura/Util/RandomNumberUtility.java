package com.obsqura.Util;

import java.util.Random;

public class RandomNumberUtility {

	
	public static int getUniqueRandomNumber() {
		 Random rand = new Random();
         int max=10000,min=10;
         return rand.nextInt(max - min + 1) + min;
	}
	
	public static String getRandomString() {
		return "Jasna"+RandomNumberUtility.getUniqueRandomNumber();
	}
}
