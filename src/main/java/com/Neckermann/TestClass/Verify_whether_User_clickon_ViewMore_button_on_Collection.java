package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_User_clickon_ViewMore_button_on_Collection extends TestBaseClass{
	// 11.
		@Test(dataProvider="getData")
		public void clickon_ViewMore_button(String collection) throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonallcollections(collection);
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);
//		    ScreenshotClass.takeScreenshot(driver, "collection_PAGE");
			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(2000);

			cm.clickonviewmorebutton();
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "hotellistingpage");
		}
		
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[6][1];
			
			data[0][0]="Luxury";
			
			data[1][0]="Golf and Sports";
			
			data[2][0]="Family Getaway";
			
			data[3][0]="City Breaks";
			
			data[4][0]="All Inclusive";
			
			data[5][0]="Adults Only";
			
			return data;
			
			
		}	
}
