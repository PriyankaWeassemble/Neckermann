package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_instagram_Functionality_on_DestinationPage extends TestBaseClass{
	
		@Test(enabled=false)
		public void socialmedia_instagram_Functionality() throws InterruptedException {
			
//	         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

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

			// 1.****instagram****

			dm.clickoninstagram();
			Thread.sleep(1000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			String expectedTitle2 = "Instagram";
			String actualTitle2 = driver.getTitle();
			Assert.assertEquals(actualTitle2, expectedTitle2);
			log.info("Neckermann Instagram is open");
		}
}
