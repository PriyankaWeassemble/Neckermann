package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_IndividualhotelOpen_After_clicking_ViewButton_OncollectionPage extends TestBaseClass{

	// 10. View on Collection

		@Test(dataProvider="getData")
		public void clickon_View_button(String collection) throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,3000)");
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "collectionpage");
			hm.clickonallcollections(collection);
			Thread.sleep(2000);
			
			CollectionPOMClass cm = new CollectionPOMClass(driver);
			js.executeScript("window.scroll(0,1700)");
			Thread.sleep(2000);

			cm.clickonviewbuttonforindividualhotel();
			Thread.sleep(2000);
//		    ScreenshotClass.takeScreenshot(driver, "individualPage");
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
