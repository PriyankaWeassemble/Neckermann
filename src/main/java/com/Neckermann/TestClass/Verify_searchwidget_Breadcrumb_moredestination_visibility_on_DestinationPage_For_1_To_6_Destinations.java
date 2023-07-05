package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_searchwidget_Breadcrumb_moredestination_visibility_on_DestinationPage_For_1_To_6_Destinations extends TestBaseClass{
	// 2

		@Test(dataProvider="getData")
		public void Destination_searchwidget_Breadcrumb_moredestination_visibility(String destination) throws InterruptedException {
			

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"destinationpage");
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);

			boolean actual = dm.visiblityofsearchwidgetcomponent();
			boolean expected = true;
			Assert.assertEquals(actual, expected);
			log.info("search widget is visible on the destination");

			boolean actual1 = dm.visiblityofbraedcrumb_component();
			boolean expected1 = true;
			Assert.assertEquals(actual1, expected1);
			log.info("bread crumb is visible on the destination");

			boolean actual2 = dm.visiblityofmoredestsection();
			boolean expected2 = true;
			Assert.assertEquals(actual2, expected2);
			log.info("search widget is visible of more destination section");

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
