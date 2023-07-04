package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Whether_UserClickon_Destination_From_HomePage extends TestBaseClass {
	@Test
	public void Destinations_HomePage_functioanlity() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1900)");
		Thread.sleep(1000);
//		ScreenshotClass.takeScreenshot(driver,"Homepage");
		
		// Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(500);
//		ScreenshotClass.takeScreenshot(driver,"Destiantion");
		//assertion
		log.info("click the destination from the home page");

	}

}
