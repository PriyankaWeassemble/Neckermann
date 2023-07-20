package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_visibilityof_components_on_Things_to_do_Page extends TestBaseClass{
	
	// 1.
		@Test
	    	public void visibilityofcomponents_onthingstodo() throws InterruptedException {
			
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
			dm.clickonsubmenusfromdestination("Holidays");

			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			boolean actual = tm.visiblityofsearchwidgetcomponent();
			boolean expected = true;
			Assert.assertEquals(actual, expected);
			log.info("search widget is visible on the things to do page");

			boolean actual1 = tm.visiblityofbraedcrumb_component();
			boolean expected1 = true;
			Assert.assertEquals(actual1, expected1);
			log.info("bread crumb is visible on the things to do page");

			boolean actual2 = tm.visiblityofheadercomponentcomponent();
			boolean expected2 = true;
			Assert.assertEquals(actual2, expected2);
			log.info("header component is visible on the things to do page");

			boolean actual3 = tm.visiblityofnewsletter();
			boolean expected3 = true;
			Assert.assertEquals(actual3, expected3);
			log.info("Newsletter component is visible on the things to do page");
		}

}
