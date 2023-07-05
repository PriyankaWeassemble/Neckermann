package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_SocialMedia_Twitter_from_ThingsToDo_Page extends TestBaseClass{
	// 5.****twitter******
		@Test(enabled = false)
		public void clickontwitter() throws InterruptedException, IOException {
			String expectedTitle = "Neckermann Travel | Home Page";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			log.info("Home page is open");

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Things to do");
			log.info("click on the things to do tab");
			Thread.sleep(500);
//		       dm.clickonsubmenusfromdestination("Holidays");

			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			js.executeScript("window.scroll(0,500)");
			Thread.sleep(1000);

			tm.clickontwitter();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle4 = "Explore / Twitter"; // Twitter
			String actualTitle4 = driver.getTitle();
			Assert.assertEquals(actualTitle4, expectedTitle4);
			log.info("twitter is open");

		}
}
