package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Travel_Guide_Functionality extends TestBaseClass {

	

	// 3. click on more travel guide
	@Test(enabled = false)
	public void more_travel_guide_Functionality() throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
		log.info("click on the Travel guide tab");
		Thread.sleep(500);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		// [Cyprus, Greece, Spain,Balearic Island,Portugal, Canary Islands, United Arab
		// Emirates, Turkey, Egypt]
		TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
		trm.clickonallmorelinks("Cyprus");
//		ScreenshotClass.takeScreenshot(driver,"morelinkontravelguide");
		// assertion needed
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));
		Thread.sleep(2000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Greece");
		List<String> allpageaddress1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress1.get(2));

		js.executeScript("window.scroll(0,700)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Spain");
		List<String> allpageaddress2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress2.get(3));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Balearic Island");
		List<String> allpageaddress3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress3.get(4));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Portugal");
		List<String> allpageaddress4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress4.get(5));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Canary Islands");
		List<String> allpageaddress5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress5.get(6));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("United Arab Emirates");
		List<String> allpageaddress6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress6.get(7));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Turkey");
		List<String> allpageaddress7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress7.get(8));
		Thread.sleep(1000);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);
		trm.clickonallmorelinks("Egypt");
		List<String> allpageaddress8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress8.get(9));

	}

	

//	click on the more travel guides
//	your guides to Egypt-->food & drinks, Beachses, We love, At a glance
//	FCDO website
//	View button click
//	FAQ's

}
