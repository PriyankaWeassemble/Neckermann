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

public class Verify_whether_User_click_on_Travel_advicelink_For_7_To_9_Destinations_onTravelGuidePage extends TestBaseClass {
	// 2. click on visa health link--->*****ADD ASSERTIONS FOR PAGE
			@Test(dataProvider="getData")
			public void visa_healthlink_Functionality(String destination, String traveladvicelink) throws InterruptedException, IOException {

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

				js.executeScript("window.scroll(0,900)");
				Thread.sleep(2000);

				TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
				trm.clickonvisa_health_link();
//				ScreenshotClass.takeScreenshot(driver,"2ndlinkontravelguide");
				List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(allpageaddress.get(1));
				
				Properties prop=new Properties();
				   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
				   prop.load(ip);
				   
				
				String expectedTitle1 = prop.getProperty(traveladvicelink);
				String actualTitle1 = driver.getTitle();
				Assert.assertEquals(actualTitle1, expectedTitle1);
				log.info(" travel advice - GOV.UK link is open");

			}
			@DataProvider
			public Object[][] getData()
			{
				Object[][] data=new Object[3][2];
				
				data[0][0]="Portugal";
				data[0][1]="Portugal_TravelAdvicewebsiteTitle";
				
				data[1][0]="Balearics";
				data[1][1]="Balearics_TravelAdvicewebsiteTitle";
				
				data[2][0]="Canary islands";
				data[2][1]="Canary_islands_TravelAdvicewebsiteTitle";
				
				
				return data;
			}
}
