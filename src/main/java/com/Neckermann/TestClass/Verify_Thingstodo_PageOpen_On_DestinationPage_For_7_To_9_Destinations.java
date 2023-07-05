package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Thingstodo_PageOpen_On_DestinationPage_For_7_To_9_Destinations extends TestBaseClass{
	
	@Test(dataProvider="getData")
	public void clickonthingstodo(String destination) throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);
//         ScreenshotClass.takeScreenshot(driver, "destinationclick");
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Things to do");
		log.info("click on the things to do tab");
//         ScreenshotClass.takeScreenshot(driver, "things_to_do_page");
		Thread.sleep(500);
		dm.clickonsubmenusfromdestination("Holidays");
		log.info("click on the holidaystab");
		Thread.sleep(500);
//         ScreenshotClass.takeScreenshot(driver, "Holidayspage");

	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][1];
		
		data[0][0]="Portugal";
		
		data[1][0]="Balearics";
		
		data[2][0]="Canary islands";
		
		return data;
		
		
	    }
}
