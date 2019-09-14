package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.*;

public class LoginPage extends TestBase {

	//Page Factory
	@FindBy(name = "username" )
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath ="//a[contains(text(), \"Sign Up\")]" )
	WebElement signUpBtn;
	
	@FindBy(xpath = "")
	WebElement crmLogo;
	
	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);	
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	
	
}
