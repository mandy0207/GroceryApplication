package com.obsqura.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class BaseTest {
	WebDriver driver = null;
	
	@BeforeMethod
	public void initDriver() {
	
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
		 initPages();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 
	}
	public LoginPage lp;
	public HomePage hp;
	
	public void initPages() {
	 lp = new LoginPage(driver);
	 hp = new HomePage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("I am in after method");
		//driver.quit();
	}
}
