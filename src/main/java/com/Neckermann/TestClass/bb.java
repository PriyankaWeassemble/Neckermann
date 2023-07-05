package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class bb extends TestBaseClass {
	// 2. click on visa health link--->*****ADD ASSERTIONS FOR PAGE
		@Test
		public void visa_healthlink_Functionality() throws InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Travel guide");
			log.info("click on the Travel guide tab");
			Thread.sleep(500);

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
			trm.clickonvisa_health_link();
//			ScreenshotClass.takeScreenshot(driver,"2ndlinkontravelguide");
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			
			String expectedTitle1 = "Egypt travel advice - GOV.UK";
			String actualTitle1 = driver.getTitle();
			Assert.assertEquals(actualTitle1, expectedTitle1);
			log.info("Egypt travel advice - GOV.UK link is open");

		}

}
