package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Verify_Whether_Travel_guide_FAQ_Min_Max_Functionality_on_TravelGuide_Page_For_7_To_9_Destinations extends TestBaseClass{

	//
	@Test(dataProvider="getData")
	
	public void Travel_guide_FAQ_Min_Max_Functionality(String destination) throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
		log.info("click on the Travel guide tab");
		Thread.sleep(500);

		js.executeScript("window.scroll(0,3750)");
		Thread.sleep(2000);
		TravelGuidePOMClass tg=new TravelGuidePOMClass(driver);
		
		tg.FAQ_min_and_Max();
		Thread.sleep(1000);
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
//your guides to Egypt-->food & drinks, Beachses, We love, At a glance
//Click on the more travel guides
//View button click
//FAQs
