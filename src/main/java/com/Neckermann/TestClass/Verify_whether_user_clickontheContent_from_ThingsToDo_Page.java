package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_whether_user_clickontheContent_from_ThingsToDo_Page extends TestBaseClass{
	//2.	contents click on things to do 
		@Test
		public void clickontheContent() throws InterruptedException, IOException {
			

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"Things_to_do_Page");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Things to do");
			log.info("click on the things to do tab");
			Thread.sleep(500);
			dm.clickonsubmenusfromdestination("Holidays");
//			ScreenshotClass.takeScreenshot(driver,"Holidays");

			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			js.executeScript("window.scroll(0,500)");
			Thread.sleep(2000);

			tm.clickonsubmenusfromdestination();// click on the all content
//			ScreenshotClass.takeScreenshot(driver,"Contentclickimage");
		}

}
