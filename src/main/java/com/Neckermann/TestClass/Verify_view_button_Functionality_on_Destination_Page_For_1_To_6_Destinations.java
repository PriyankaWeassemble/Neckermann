package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_view_button_Functionality_on_Destination_Page_For_1_To_6_Destinations extends TestBaseClass {
	// 12. View button on destination from the individual hotel

	@Test(dataProvider="getData")
	public void view_button_Functionality(String destination) throws InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
//		ScreenshotClass.takeScreenshot(driver,"destination");
		Thread.sleep(2000);
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		js.executeScript("window.scroll(0,1600)");
		Thread.sleep(2000);

		dm.clickonviewbuttonforindividualhotel();
//		ScreenshotClass.takeScreenshot(driver,"individualhotelafterclickingondestinationpage");
		log.info("view more button is clicked from the destination page" );
		Thread.sleep(1000);
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
