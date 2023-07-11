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

public class Verify_FCDO_link_Functionality_on_TravelGuidePage_For_1_To_6_Destinations extends TestBaseClass{
	// 4. FCDO link click

		@Test(dataProvider="getData")
		public void FCDO_link_Functionality(String destination) throws InterruptedException, IOException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
//			js.executeScript("window.scroll(0,2000)");//for Portugal,Balearics,Canary islands  
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage(destination);
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Travel guide");
			log.info("click on the Travel guide tab");
			Thread.sleep(500);

			js.executeScript("window.scroll(0,2800)");
			Thread.sleep(3000);

			TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
			trm.Click_FCDO_link();
			Thread.sleep(1000);

			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			
			   Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle1 = prop.getProperty("FCDOLinkTitle");
			String actualTitle1 = driver.getTitle();
			Assert.assertEquals(actualTitle1, expectedTitle1);
			log.info("FCDO link is open");

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
