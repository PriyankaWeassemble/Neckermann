package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Verifywhether_user_should_clickon_yourguide_on_travelGuidePage_For_7_To_8_Destinations extends TestBaseClass {
@Test(dataProvider="getData")
	
	public void Travel_guide_anotherbuttonclick_click(String destination) throws InterruptedException {

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
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(1000);
		
		TravelGuidePOMClass tgm=new TravelGuidePOMClass(driver);
		tgm.Click_FoodandDrink();
		tgm.Click_Beaches();
		tgm.Click_WeLove();
		tgm.Click_At_a_Glance();
		
}

@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[2][1];
	
	data[0][0]="Portugal";
	
	data[1][0]="Balearics";
	

	
	return data;
	
	
    }

	
}
