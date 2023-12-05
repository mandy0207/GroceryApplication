package com.obsqura.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ManageExpenseTest extends BaseTest{

	@Test
	public void ExpenseCategory() {
		
		
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
}
