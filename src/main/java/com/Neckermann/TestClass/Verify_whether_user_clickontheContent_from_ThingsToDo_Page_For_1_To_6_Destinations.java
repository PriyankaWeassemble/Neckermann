package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_whether_user_clickontheContent_from_ThingsToDo_Page_For_1_To_6_Destinations extends TestBaseClass{
	//2.	contents click on things to do 
		@Test(dataProvider="getData")
		public void clickontheContent(String destination) throws InterruptedException, IOException {
			

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"Things_to_do_Page");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Things to do");
			log.info("click on the things to do tab");
			Thread.sleep(500);
			
			js.executeScript("window.scroll(0,500)");
			Thread.sleep(2000);
			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			tm.clickonsubmenusfromdestination();// click on the all content
//			ScreenshotClass.takeScreenshot(driver,"Contentclickimage");
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
