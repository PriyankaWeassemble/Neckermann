package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_Linkdin_Functionality_OnDestinationPage extends TestBaseClass{

	// 10

		@Test(enabled = false)
		public void socialmedia_linkdin_Functionality() throws InterruptedException {
			String expectedTitle = "Neckermann Travel | Home Page";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			log.info("Home page is open");
//	                  ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

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
//	          4. *****linkdin*****
			dm.clickonlinkdin();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle5 = "LinkedIn: Log In or Sign Up";
			String actualTitle5 = driver.getTitle();
			Assert.assertEquals(actualTitle5, expectedTitle5);
			log.info("linkdin is open");

		}
	
	
}
