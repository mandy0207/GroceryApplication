package com.obsqura.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver = null;
	
	@BeforeMethod
	public void initDriver() {
		System.out.println("I am in before method");
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Choose correct Browser");
		}
		 
		 driver.manage().window().maximize();
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("I am in after method");
		driver.quit();
	}
}
