package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Readmore_Readless_functionality_on_CollectionPage extends TestBaseClass {


	// 12. Read more and read less functionality
	@Test
	public void Readmore_Readless_functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		cm.clickonreadmore();
		log.info("read more button clicked");
//		ScreenshotClass.takeScreenshot(driver,"readlessvisible");
		Thread.sleep(1000);
		cm.clickonreadless();
		log.info("read less button clicked");
//		ScreenshotClass.takeScreenshot(driver,"readmorevisible");
		Thread.sleep(1000);

	}

}
