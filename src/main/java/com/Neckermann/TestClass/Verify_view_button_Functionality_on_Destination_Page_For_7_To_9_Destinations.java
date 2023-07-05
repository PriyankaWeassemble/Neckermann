package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_view_button_Functionality_on_Destination_Page_For_7_To_9_Destinations extends TestBaseClass{
	@Test(dataProvider="getData")
	public void clickontravelguide(String destination) throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);
//         ScreenshotClass.takeScreenshot(driver, "Destination_PAGE");
		
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
//         ScreenshotClass.takeScreenshot(driver, "Tarvel_Guide");
		Thread.sleep(2000);
		log.info("tarvel guide page open from the destinations page");

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
