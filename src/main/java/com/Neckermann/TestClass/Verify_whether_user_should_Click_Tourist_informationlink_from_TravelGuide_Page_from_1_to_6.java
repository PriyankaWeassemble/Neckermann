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

public class Verify_whether_user_should_Click_Tourist_informationlink_from_TravelGuide_Page_from_1_to_6 extends TestBaseClass{
	// 1. click on tourist information link
		@Test(dataProvider="getData")
		public void tourist_informationlink_Functionality(String destination, String travellink) throws InterruptedException, IOException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scroll(0,1800)");//upto spain
			Thread.sleep(2000);
			
	
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);
//			ScreenshotClass.takeScreenshot(driver,"destination");
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Travel guide");
//			ScreenshotClass.takeScreenshot(driver,"TravelGuidePage");
			log.info("click on the Travel guide tab");
			Thread.sleep(500);

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
			trm.clickontourist_information_link();
//			ScreenshotClass.takeScreenshot(driver,"1stlinkontravelguide");
			
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			
			
			   Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);
			   
	
			String expectedTitle1 = prop.getProperty(travellink);
	//
			String actualTitle1 = driver.getTitle();
			Assert.assertEquals(actualTitle1, expectedTitle1);
			log.info("Egyptian Tourism Authority link is open");

		}
//		,,,,,,,,
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[6][2];
			
			data[0][0]="Egypt";
			data[0][1]="Egypt_officialtourismwebsiteTitle";
			
			data[1][0]="Cyprus";
			data[1][1]="Cyprus_officialtourismwebsiteTitle";
			
			data[2][0]="Greece";
			data[2][1]="Greece_officialtourismwebsiteTitle";
			
			data[3][0]="Turkey";
			data[3][1]="Turkey_officialtourismwebsiteTitle";
			
			data[4][0]="UAE";
			data[4][1]="UAE_officialtourismwebsiteTitle";
			
			data[5][0]="Spain";
			data[5][1]="Spain_officialtourismwebsiteTitle";
			
			return data;
			
		}


}
