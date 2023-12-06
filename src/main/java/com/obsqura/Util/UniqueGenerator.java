package com.obsqura.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UniqueGenerator {

	
	public static String getUniqueString() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	     return  "client"+ formatter.format(date);  
	}
}
