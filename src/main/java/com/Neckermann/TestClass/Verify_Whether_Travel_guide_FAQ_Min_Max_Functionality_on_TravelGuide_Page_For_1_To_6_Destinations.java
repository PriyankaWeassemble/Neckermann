package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Verify_Whether_Travel_guide_FAQ_Min_Max_Functionality_on_TravelGuide_Page_For_1_To_6_Destinations extends TestBaseClass{
	@Test(dataProvider="getData")
	
	public void Travel_guide_FAQ_Min_Max_Functionality(String destination) throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
		log.info("click on the Travel guide tab");
		Thread.sleep(500);

		js.executeScript("window.scroll(0,3900)");
		Thread.sleep(2000);
		TravelGuidePOMClass tg=new TravelGuidePOMClass(driver);
		
		tg.FAQ_min_and_Max();
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