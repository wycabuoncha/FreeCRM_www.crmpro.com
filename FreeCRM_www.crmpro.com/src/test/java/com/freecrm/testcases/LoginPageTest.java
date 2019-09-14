package com.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;

	//call the base class constructor
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(actualTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
