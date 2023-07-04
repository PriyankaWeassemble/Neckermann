package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Breadcrumb_functionality_on_DestinationPage extends TestBaseClass{

		@Test
		public void breadcrumb_clicking_functionality() throws InterruptedException, IOException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickondestinationfrombreadcrumb();
//			ScreenshotClass.takeScreenshot(driver,"Destinationsonhomepage");
			Thread.sleep(500);
			log.info("click on the destinations tab from the breadcrumb");

			   Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle = prop.getProperty("homepagetitle");
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
			
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(500);

			log.info("again click on the destination");
			dm.clickonHomefrombreadcrumb();
			Thread.sleep(500);
			log.info("click on the destinations tab from the breadcrumb");

		}
}
