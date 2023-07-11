package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class VerifyWhether_User_click_on_View_button_on_Travel_guide_Page_For_7_To_9_Destinations extends TestBaseClass{
@Test(dataProvider="getData")
	
	public void Travel_guide_View_button_click(String destination) throws InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
		log.info("click on the Travel guide tab");
	

		js.executeScript("window.scroll(0,2300)");
		Thread.sleep(1000);
		
		js.executeScript("window.scroll(0,3100)");
		Thread.sleep(2000);
		TravelGuidePOMClass tg=new TravelGuidePOMClass(driver);
		tg.clickonView_button();
		
		
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
