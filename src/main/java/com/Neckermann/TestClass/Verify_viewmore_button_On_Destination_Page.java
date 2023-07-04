package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_viewmore_button_On_Destination_Page extends TestBaseClass{

			@Test
		public void viewmorw_button_Functionality() throws InterruptedException {
			
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(2000);

			dm.clickonviewmorebutton();
			log.info("click on the view more button on destination page");
			Thread.sleep(1000);
			dm.clickondestinationfrombreadcrumb1();
			Thread.sleep(2000);
			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(2000);
			dm.clickonviewbuttonforindividualhotel();

		}

}
