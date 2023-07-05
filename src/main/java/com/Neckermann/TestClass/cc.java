package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class cc extends TestBaseClass{
	// 4. FCDO link click

		@Test
		public void FCDO_link_Functionality() throws InterruptedException, IOException {

			HomePOMClass hm = new HomePOMClass(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
//			js.executeScript("window.scroll(0,2000)");//for Portugal,Balearics,Canary islands  
			Thread.sleep(2000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(2000);

			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Travel guide");
			log.info("click on the Travel guide tab");
			Thread.sleep(500);

			js.executeScript("window.scroll(0,2600)");
			Thread.sleep(2000);

			TravelGuidePOMClass trm = new TravelGuidePOMClass(driver);
			trm.Click_FCDO_link();

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

}
