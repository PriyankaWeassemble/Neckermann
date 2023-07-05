package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Whether_UserClickon_Destination_From_HomePage_From_1_to_6 extends TestBaseClass {
	
	@Test(dataProvider="getData")
	public void Destinations_HomePage_functioanlity(String destination) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1900)");
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
		Object[][] data=new Object[6][1];
		
		data[0][0]="Egypt";
		
		data[1][0]="Cyprus";
		
		data[2][0]="Greece";
		
		data[3][0]="Turkey";
		
		data[4][0]="UAE";
		
		data[5][0]="Spain";
		
		return data;
		
		
	}	
	//Portugal,Balearics,Canary islands
}
