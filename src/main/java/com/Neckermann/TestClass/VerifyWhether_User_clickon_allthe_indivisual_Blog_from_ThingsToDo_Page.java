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

public class VerifyWhether_User_clickon_allthe_indivisual_Blog_from_ThingsToDo_Page extends TestBaseClass {


	// 9. click on all the blogs
	@Test
	public void clickonalltheindivisualblog_functionality() throws InterruptedException, IOException {
	
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(1000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(1000);
//		ScreenshotClass.takeScreenshot(driver,"destinationpage");
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Things to do");
//		ScreenshotClass.takeScreenshot(driver,"Thingstodopage");
		log.info("click on the things to do tab");
		Thread.sleep(500);

		ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(1000);

		tm.clickonallindividualblog();

		log.info("test case pass for all the expert blogs clicking");
	}

}
