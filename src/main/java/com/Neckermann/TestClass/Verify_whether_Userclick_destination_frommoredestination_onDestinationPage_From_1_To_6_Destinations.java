package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_Userclick_destination_frommoredestination_onDestinationPage_From_1_To_6_Destinations extends TestBaseClass {
	// 3 ASSERTION NEEDED
		@Test(dataProvider="getData")
		public void clickdestinationfrommoredestination(String destination) throws InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);
			
//			ScreenshotClass.takeScreenshot(driver,"selecteddestination");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickoncomponentfrommoredestination();
//			ScreenshotClass.takeScreenshot(driver,"ddestinationfromthemoredestination");
			Thread.sleep(2000);
			// assertion

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
