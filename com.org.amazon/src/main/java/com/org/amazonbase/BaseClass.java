package com.org.amazonbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements IOConstants {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void Openapplication() {
		System.setProperty(CHROME_KEY, "C:/Users/pushk/Downloads/Programs/chromedriver_win32/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(app_url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public static void Closeapplication() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	public WebDriver getdriver() {
		return driver;
	}

}
