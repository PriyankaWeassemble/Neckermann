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
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class VerifyWhether_User_clickon_allthe_indivisual_Blog_from_ThingsToDo_Page_For_1_To_6_Destinations extends TestBaseClass {


	// 9. click on all the blogs
	//NEED TO ADD ASSERTIONS
	@Test(dataProvider="getData")
	public void clickonalltheindivisualblog_functionality(String destination) throws InterruptedException, IOException {
	
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(1000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(1000);
//		ScreenshotClass.takeScreenshot(driver,"destinationpage");
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Things to do");
//		ScreenshotClass.takeScreenshot(driver,"Thingstodopage");
		log.info("click on the things to do tab");
		Thread.sleep(500);

		ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

		js.executeScript("window.scroll(0,1600)");
		Thread.sleep(1000);

		tm.clickonallindividualblog();

		log.info("test case pass for all the expert blogs clicking");
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
