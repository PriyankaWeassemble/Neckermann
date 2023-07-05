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

public class Verify_SocialMedia_Linkdin_from_ThingsToDo_Page extends TestBaseClass{
	// 6.*****linkdin*****
		@Test(enabled = false)
		public void clickonlinkdin() throws InterruptedException, IOException {
			

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

			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			js.executeScript("window.scroll(0,500)");
			Thread.sleep(1000);

			tm.clickonlinkdin();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle5 = "LinkedIn: Log In or Sign Up"; // LinkedIn Login, Sign in | LinkedIn
			String actualTitle5 = driver.getTitle();
			Assert.assertEquals(actualTitle5, expectedTitle5);
			log.info("linkdin is open");

		}

}
