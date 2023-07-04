package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_User_clickon_HomeTab_from_braedcrumb_on_CollectionPage extends TestBaseClass{
	// 3. click on Home from hamburger
		@Test
		public void clickon_Home_Tab_from_hamburger() throws IOException, InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"collectionpage");
			// assertion

			CollectionPOMClass cm = new CollectionPOMClass(driver);
			cm.clickonHomefrombreadcrumb();
			Thread.sleep(1000);
//			ScreenshotClass.takeScreenshot(driver,"Homepage");
			Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle = prop.getProperty("homepagetitle");
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			log.info("click on the collections from breadcrumb present on collections page");

		}
	
}
