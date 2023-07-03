package com.Neckerman.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {

	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("yy-mm-dd & HH-mm-ss");// MM-dd-yy-->correct format
		String date = d1.format(d);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Neckermann_ScreenshotFolder\\" + date + name + ".jpg");
		FileHandler.copy(source, destination);
	}

}
