package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verifywhether_click_on_component_from_more_collection extends TestBaseClass{
	

		@Test(dataProvider="getData")
		public void clickoncomponentfrommorecollection(String collection) throws IOException, InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);
			
			hm.clickonallcollections(collection);
			
			//NEED TO ADD ASSERTIONS accordingly dataprovier array change for the links also
			
			CollectionPOMClass cm = new CollectionPOMClass(driver);
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"collectionpagewhenclickfromthecollectionmoresection");
			
			cm.clickoncomponentfrommorecollection();
//			ScreenshotClass.takeScreenshot(driver,"anothercollectionPage");
			Thread.sleep(1000);

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
