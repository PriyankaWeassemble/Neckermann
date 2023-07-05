package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Thingstodo_PageOpen_On_DestinationPage_For_1_To_6_Destinations extends TestBaseClass{
	
//		 Holidays,
		@Test(dataProvider="getData")
		public void clickonthingstodo(String destination) throws InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);
//	         ScreenshotClass.takeScreenshot(driver, "destinationclick");
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Things to do");
			log.info("click on the things to do tab");
//	         ScreenshotClass.takeScreenshot(driver, "things_to_do_page");
			Thread.sleep(500);
			dm.clickonsubmenusfromdestination("Holidays");
			log.info("click on the holidaystab");
			Thread.sleep(500);
//	         ScreenshotClass.takeScreenshot(driver, "Holidayspage");

		}
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[6][1];
			
			data[0][0]="Egypt";
			
			data[1][0]="Cyprus";
			
			data[2][0]="Greece";
			
			data[3][0]="Turkey";
			
			data[4][0]="UAE";
			
			data[5][0]="Spain";
			
			return data;
			
			
		}	

}
