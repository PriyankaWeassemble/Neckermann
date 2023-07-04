package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_IndividualhotelOpen_After_clicking_ViewButton_OncollectionPage extends TestBaseClass{

	// 10. View on Collection

		@Test
		public void clickon_View_button() throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "collectionpage");
			hm.clickonparticularcollection();
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);

			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(2000);

			cm.clickonviewbuttonforindividualhotel();
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "individualPage");
		}

}
