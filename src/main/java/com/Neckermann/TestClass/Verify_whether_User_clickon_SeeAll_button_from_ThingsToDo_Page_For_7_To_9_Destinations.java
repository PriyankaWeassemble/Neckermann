package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Verify_whether_User_clickon_SeeAll_button_from_ThingsToDo_Page_For_7_To_9_Destinations extends TestBaseClass{

	// 7. click on the "see all " button from the things to do page
			@Test(dataProvider="getData")
			public void clickonseeallbutton_functionality(String destination) throws InterruptedException, IOException {

				HomePOMClass hm = new HomePOMClass(driver);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,1950)");
				Thread.sleep(1000);

				// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
				hm.clickonalldestinationsfromhomepage(destination);
				Thread.sleep(1000);

//				ScreenshotClass.takeScreenshot(driver,"Destinationpage");
				DestinationsPOMClass dm = new DestinationsPOMClass(driver);
				dm.clickonsubmenusfromdestination("Things to do");
//				ScreenshotClass.takeScreenshot(driver,"Things_To_DO_Page");
				log.info("click on the things to do tab");
				Thread.sleep(500);

				ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);
				js.executeScript("window.scroll(0,1500)");
				Thread.sleep(1000);

				tm.clickonseeall();
				Thread.sleep(1000);
//				ScreenshotClass.takeScreenshot(driver,"BlogpageafterclickseeallfromThingstodopage");
				Properties prop=new Properties();
				FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			    prop.load(ip);

				String expectedTitle5 = prop.getProperty("BlogPageTitle");
				String actualTitle5 = driver.getTitle();
				Assert.assertEquals(actualTitle5, expectedTitle5);
				log.info("see all button is clicked");

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
