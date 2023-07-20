package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_whether_user_clickontheContent_from_ThingsToDo_Page_For_7_To_8_Destinations extends TestBaseClass {
	@Test(dataProvider="getData")
	public void clickontheContent(String destination) throws InterruptedException, IOException {
		

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);
//		ScreenshotClass.takeScreenshot(driver,"Things_to_do_Page");
		
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Things to do");
		log.info("click on the things to do tab");
		Thread.sleep(500);
		
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

		tm.clickonsubmenusfromdestination();// click on the all content
//		ScreenshotClass.takeScreenshot(driver,"Contentclickimage");
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
