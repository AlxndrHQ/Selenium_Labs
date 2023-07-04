package com.selenium.labs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\steven.williams.jr\\Downloads\\geckodriver.exe");
		
		// Instantiate a FireFox class
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
}