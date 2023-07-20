package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Readmore_Readless_functionality_on_CollectionPage extends TestBaseClass {


	// 12. Read more and read less functionality
	@Test(dataProvider="getData")
	public void Readmore_Readless_functionality(String collection) throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonallcollections(collection);
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,1300)");
		Thread.sleep(2000);

		cm.clickonreadmore();
		log.info("read more button clicked");
//		ScreenshotClass.takeScreenshot(driver,"readlessvisible");
		Thread.sleep(1000);
		cm.clickonreadless();
		log.info("read less button clicked");
//		ScreenshotClass.takeScreenshot(driver,"readmorevisible");
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
