package com.freecrm.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Radf {

	public static void main(String[] args) {
		readProperties() ;

	}
	
	
	public static void readProperties() {
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream("C:\\Users\\OnchariWycliffe\\eclipse-workspace\\FreeCRM_www.crmpro.com\\src\\main\\java\\com\\freecrm\\config\\config.properties");
			properties.load(inputStream);
			properties.getProperty("browser");
			System.out.println(properties.getProperty("browser"));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
