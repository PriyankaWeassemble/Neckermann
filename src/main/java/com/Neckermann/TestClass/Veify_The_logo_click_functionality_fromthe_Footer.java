package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Veify_The_logo_click_functionality_fromthe_Footer extends TestBaseClass{
	@Test
	public void Footer_logo_visiblityand_click_Functionality() throws IOException, InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6300)");
		Thread.sleep(1000);

		HomePOMClass hm = new HomePOMClass(driver);
		boolean expectedTitle1 = hm.visiblityoflogoonthefooter();
		boolean actualTitle1 = true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("logo from the footer is visible on the home page");

//		ScreenshotClass.takeScreenshot(driver,"footerontheHomepage");
		js.executeScript("window.scroll(0,6500)");
		Thread.sleep(2000);

		hm.clickonlogoonthefooter();
		log.info("click on the logo from the footer");
		Thread.sleep(500);
//		ScreenshotClass.takeScreenshot(driver,"Homepgeafterclickinglogofromthefooter");
		 Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);

		
		String expectedTitle2 = prop.getProperty("homepagetitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Home page is open, test case is pass for the logo clicking from the footer");
	}
}
