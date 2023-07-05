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

public class Verify_whether_user_should_Click_Tourist_informationlink_from_TravelGuide_Page_from_7_to_9  extends TestBaseClass {

	@Test(dataProvider="getData")
	public void tourist_informationlink_Functionality(String destination, String travellink) throws InterruptedException, IOException {

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
     	js.executeScript("window.scroll(0,2000)");//for Portugal,Balearics,Canary islands
		Thread.sleep(2000);
		
		hm.clickonalldestinationsfromhomepage(destination);
		Thread.sleep(2000);
//		ScreenshotClass.takeScreenshot(driver,"destination");
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
//		ScreenshotClass.takeScreenshot(driver,"TravelGuidePage");
		log.info("click on the Travel guide tab");
		Thread.sleep(500);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
		trm.clickontourist_information_link();
//		ScreenshotClass.takeScreenshot(driver,"1stlinkontravelguide");
		
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
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="Portugal";
		data[0][1]="Portugal_officialtourismwebsiteTitle";
		
		data[1][0]="Balearics";
		data[1][1]="Balearics_officialtourismwebsiteTitle";
		
		data[2][0]="Canary islands";
		data[2][1]="Canary_islandso_fficialtourismwebsiteTitle";
		return data;
		
		
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
