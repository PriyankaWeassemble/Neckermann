package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_twitter_Functionality_OnDestinationPage extends TestBaseClass{
	// 9
		@Test(enabled = false)
		public void socialmedia_twitter_Functionality() throws InterruptedException {
			
//	                   ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

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

			// 3.****twitter****

			dm.clickontwitter();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle4 = "Explore / Twitter";
			String actualTitle4 = driver.getTitle();
			Assert.assertEquals(actualTitle4, expectedTitle4);
			log.info("twitter is open");

		}


}
