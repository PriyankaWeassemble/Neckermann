package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Verify_whether_User_click_on_Travel_advicelink_For_1_To_6_Destinations extends TestBaseClass {
	// 2. click on visa health link--->*****ADD ASSERTIONS FOR PAGE
		@Test(dataProvider="getData")
		public void visa_healthlink_Functionality(String destination, String traveladvicelink) throws InterruptedException, IOException {

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

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
			trm.clickonvisa_health_link();
//			ScreenshotClass.takeScreenshot(driver,"2ndlinkontravelguide");
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			
			Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);
			   
			
			String expectedTitle1 = prop.getProperty(traveladvicelink);
			String actualTitle1 = driver.getTitle();
			Assert.assertEquals(actualTitle1, expectedTitle1);
			log.info("Egypt travel advice - GOV.UK link is open");

		}
		@DataProvider
		public Object[][] getData()
		{
//			   Portugal_TravelAdvicewebsiteTitle
//			   Balearics_TravelAdvicewebsiteTitle
//			   Canary_islands_TravelAdvicewebsiteTitle
			Object[][] data=new Object[6][2];
			
			data[0][0]="Egypt";
			data[0][1]="Egypt_TravelAdvicewebsiteTitle";
			
			data[1][0]="Cyprus";
			data[1][1]="Cyprus_TravelAdvicewebsiteTitle";
			
			data[2][0]="Greece";
			data[2][1]="Greece_TravelAdvicewebsiteTitle";
			
			data[3][0]="Turkey";
			data[3][1]="Turkey_TravelAdvicewebsiteTitle";
			
			data[4][0]="UAE";
			data[4][1]="UAE_TravelAdvicewebsiteTitle";
			
			data[5][0]="Spain";
			data[5][1]="Spain_TravelAdvicewebsiteTitle";
			
			return data;
			
			
		}	

}
