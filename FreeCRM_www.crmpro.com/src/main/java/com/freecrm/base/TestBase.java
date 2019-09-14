package com.freecrm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.freecrm.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	//initialize all the properties 
	// all browser common properties
	
	public static WebDriver driver; 
	public static Properties properties; 
	public TestBase() {
		// read proprties
		properties  =  new Properties();
		String filePath = "C:\\Users\\OnchariWycliffe\\eclipse-workspace\\FreeCRM_www.crmpro.com\\src\\main\\java\\com\\freecrm\\config\\config.properties";
		try {
			FileInputStream inputStream = new FileInputStream(filePath);
			properties.load(inputStream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	//initialization method
	public static void initialization() {
		String browserName = properties.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("url"));
		
	}
}
