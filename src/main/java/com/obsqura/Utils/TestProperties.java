package com.obsqura.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.obsqura.constants.Constants;

public class TestProperties {

	
	public static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(Constants.PROPERTYFILE);
		prop.load(fis);
		return prop;
		
	}
}
