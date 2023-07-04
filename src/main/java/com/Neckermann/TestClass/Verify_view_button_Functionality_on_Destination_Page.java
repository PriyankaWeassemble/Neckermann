package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_view_button_Functionality_on_Destination_Page extends TestBaseClass {
	// 12. View button on destination from the individual hotel

	@Test
	public void view_button_Functionality() throws InterruptedException {
		
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

		dm.clickonviewbuttonforindividualhotel();
		log.info("view more button is clicked from the destination page" );
		Thread.sleep(1000);
	}

}
