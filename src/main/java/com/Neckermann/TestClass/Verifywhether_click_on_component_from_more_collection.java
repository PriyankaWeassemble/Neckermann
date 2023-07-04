package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verifywhether_click_on_component_from_more_collection extends TestBaseClass{
	

		@Test
		public void clickoncomponentfrommorecollection() throws IOException, InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			CollectionPOMClass cm = new CollectionPOMClass(driver);
			hm.clickonparticularcollection();
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"collectionpagewhenclickfromthecollectionmoresection");
			
			cm.clickoncomponentfrommorecollection();
//			ScreenshotClass.takeScreenshot(driver,"anothercollectionPage");
			Thread.sleep(1000);

		}
}
