package com.obsqura.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.obsqura.Util.TestProperties;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class BaseTest {
	WebDriver driver = null;
	
	@BeforeMethod
	public void initDriver() throws IOException {
	
		String browser = TestProperties.getProperties().getProperty("browser");
		String env= TestProperties.getProperties().getProperty("Envrionment");
		String URL=TestProperties.getProperties().getProperty(env);
		
		System.out.println("Executing in "+env);
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
		 driver.get(URL);
		 
	}
	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	
	public void initPages() {
	 lp = new LoginPage(driver);
	 hp = new HomePage(driver);
	 ecp=new ExpenseCategoryPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
