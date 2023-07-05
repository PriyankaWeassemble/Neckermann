package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Whether_UserClickon_Destination_From_HomePage_From_7_to_9 extends TestBaseClass{
	@Test(dataProvider="getData")
	public void Destinations_HomePage_functioanlity(String destination) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2200)");
		Thread.sleep(1000);
//		ScreenshotClass.takeScreenshot(driver,"Homepage");
		
		// Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(500);
//		ScreenshotClass.takeScreenshot(driver,"Destiantion");
		//assertion
		log.info("click the destination from the home page");
		

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
