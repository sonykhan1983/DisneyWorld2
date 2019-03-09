package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Common {
private static String getURL = "https://disneyworld.disney.go.com";
	public static String getGetURL() {
		return getURL;
	}
WebDriver driver;
public static WebDriver getbrowser(String browserName,WebDriver driver) {
	if (browserName.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
driver = new ChromeDriver();
	}
	if (browserName.equalsIgnoreCase("operadriver")) {
		System.setProperty("webdriver.opera.driver","./Driver/operadriver");
		driver = new OperaDriver();	
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    return driver;}
	
}
