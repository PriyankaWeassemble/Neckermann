package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_Userclick_destination_frommoredestination_onDestinationPage extends TestBaseClass {
	// 3 ASSERTION NEEDED
		@Test
		public void clickdestinationfrommoredestination() throws InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);
			
//			ScreenshotClass.takeScreenshot(driver,"selecteddestination");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickoncomponentfrommoredestination();
//			ScreenshotClass.takeScreenshot(driver,"ddestinationfromthemoredestination");
			Thread.sleep(2000);
			// assertion

		}
}
