package com.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
		public static void SS (WebDriver driver, String screen) throws Throwable {
			
			TakesScreenshot tkss = (TakesScreenshot) driver;
			File fl = tkss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/PracticeProject2/Screenshot/"+screen+".jpg"));
		}
}
