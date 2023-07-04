package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_User_clickon_ViewMore_button_on_Collection extends TestBaseClass{
	// 11.
		@Test
		public void clickon_ViewMore_button() throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);
//		    ScreenshotClass.takeScreenshot(driver, "collection_PAGE");
			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(2000);

			cm.clickonviewmorebutton();
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "hotellistingpage");
		}
}
