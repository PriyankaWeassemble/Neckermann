package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Visibility_Of_difrentComponent_on_Collection_Page extends TestBaseClass{
	// 1. Visiblity of collection on home and in collection page -->header,Serach
		// widget,footer,Newsletter

		@Test(dataProvider="getData")
		public void Homepage_collection_visibilityofcomponents( String collection) throws IOException, InterruptedException {
			
			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			boolean actual = hm.visibilityofcollectiononhomepage();
			boolean expected = true;
			Assert.assertEquals(actual, expected);
			log.info("collection component is visible on the destination");
//			ScreenshotClass.takeScreenshot(driver,"collection_on_Homepage");
			
			hm.clickonallcollections(collection);
			Thread.sleep(4000);
			// assertion
//			ScreenshotClass.takeScreenshot(driver,"Collection_Page");
			CollectionPOMClass cm = new CollectionPOMClass(driver);

			boolean actual1 = cm.visibilityofheaderoncollection();
			boolean expected1 = true;
			Assert.assertEquals(actual1, expected1);
			log.info("Header from the collection component is visible ");

			boolean actual2 = cm.visiblityofsearchwidgetcomponentoncollection();
			boolean expected2 = true;
			Assert.assertEquals(actual2, expected2);
			log.info("Search widget from the collection component is visible ");

			boolean actual3 = cm.visiblityofbraedcrumb_component();
			boolean expected3 = true;
			Assert.assertEquals(actual3, expected3);
			log.info("Breadcrumb from the collection component is visible ");

			boolean actual4 = cm.visiblityofnewsletter();
			boolean expected4 = true;
			Assert.assertEquals(actual4, expected4);
			log.info("Newsletter from the collection component is visible ");

			boolean actual5 = cm.visiblityoffooter();
			boolean expected5 = true;
			Assert.assertEquals(actual5, expected5);
			log.info("footer from the collection component is visible ");

			log.info("Test case is Pass");

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
