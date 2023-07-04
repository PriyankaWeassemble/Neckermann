package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_TravelGuidePage_Opens_on_DestinationsPage extends TestBaseClass{
	
		@Test
		public void clickontravelguide() throws InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);
//	         ScreenshotClass.takeScreenshot(driver, "Destination_PAGE");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Travel guide");
//	         ScreenshotClass.takeScreenshot(driver, "Tarvel_Guide");
			Thread.sleep(2000);
			log.info("tarvel guide page open from the destinations page");

		}

}
