package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verifywhether_user_clickAllthe_Popup_on_ATOLprotecetd extends TestBaseClass {
	
	@Test
	public void atolprotecetdfunctionality() throws IOException, InterruptedException {
		

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonatolprotected();

//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);
		   
		String expectedTitle1 = prop.getProperty("ATOLProtectedtitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("click on ATOL Protected ");

		String expectedTitle2 = prop.getProperty("Headingoftheatolprotectedpage");
		AtolPOMClass ac = new AtolPOMClass(driver);
		String actualTitle2 = ac.headerelementtitlefetch();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Heading is correct");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(3000);
		ac.clickAllPopup();
		log.info("all pop up's are clicked");

	}

}
