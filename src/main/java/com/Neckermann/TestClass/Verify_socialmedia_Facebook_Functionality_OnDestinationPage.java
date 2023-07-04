package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_Facebook_Functionality_OnDestinationPage extends TestBaseClass{
	// 8
		@Test(enabled = false)
		public void socialmedia_Facebook_Functionality() throws InterruptedException {
			
//	                ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);

			js.executeScript("window.scroll(0,500)");
			Thread.sleep(2000);

			// 2.****facebook****
			dm.clickonfacebook();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle3 = "Facebook – log in or sign up";
			String actualTitle3 = driver.getTitle();
			Assert.assertEquals(actualTitle3, expectedTitle3);
			log.info("Neckermann facebook is open");

		}

}
