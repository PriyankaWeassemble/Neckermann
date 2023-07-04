package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerfiyThe_Logo_Functionality_On_the_Header extends TestBaseClass{
	@Test
	public void Neckermann_Logo_Functionality() throws InterruptedException, IOException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on the about us");
//	    ScreenshotClass.takeScreenshot(driver, "aboutUs_Page");
		
		hm.clickonlogofromheader();
		Thread.sleep(2000);
		
		   Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);

		
		String expectedTitle1 = prop.getProperty("homepagetitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("logo from the header is clicked ");
//	       ScreenshotClass.takeScreenshot(driver, "afterclickinglogocomes");

	}

}
