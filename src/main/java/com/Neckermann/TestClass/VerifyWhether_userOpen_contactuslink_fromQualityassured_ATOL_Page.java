package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_userOpen_contactuslink_fromQualityassured_ATOL_Page extends TestBaseClass{
	@Test
	public void ATOLProtected_clickonunbdeatableprice_Link_Functionality() throws IOException, InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonatolprotected();
		Thread.sleep(1000);

//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);
		   
		String expectedTitle1 = prop.getProperty("ATOLProtectedtitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("click on ATOL Protected ");
		AtolPOMClass ac = new AtolPOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);

		AtolPOMClass at = new AtolPOMClass(driver);
		at.clickonQualityassured();
		log.info("click on the quality assured read more link");
		at.clickoncontactuslink();

		String expectedTitle2 = prop.getProperty("Contactuslinktitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("user is directed to the ATOL link");
	}


}
