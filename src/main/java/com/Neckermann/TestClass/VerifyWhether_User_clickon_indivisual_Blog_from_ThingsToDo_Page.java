package com.Neckermann.TestClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class VerifyWhether_User_clickon_indivisual_Blog_from_ThingsToDo_Page extends TestBaseClass{
	// 8. click on the individual blog
		@Test
		public void clickonindivisualblog_functionality() throws InterruptedException, IOException {
			
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1800)");
			Thread.sleep(1000);

			// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			hm.clickonalldestinationsfromhomepage("Egypt");
			Thread.sleep(1000);
//			ScreenshotClass.takeScreenshot(driver,"destinationPage");
			
			DestinationsPOMClass dm = new DestinationsPOMClass(driver);
			dm.clickonsubmenusfromdestination("Things to do");
			log.info("click on the things to do tab");
			Thread.sleep(500);
//			ScreenshotClass.takeScreenshot(driver,"Thingstodo");
			ThingstoDoPOMClass tm = new ThingstoDoPOMClass(driver);

			js.executeScript("window.scroll(0,1500)");
			Thread.sleep(1000);

			tm.clickonindividualblog();
//			ScreenshotClass.takeScreenshot(driver,"individualblog");
			
			Properties prop=new Properties();
			   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle5 = prop.getProperty("ThirdblogTitle");
			String actualTitle5 = driver.getTitle();
			Assert.assertEquals(actualTitle5, expectedTitle5);
			log.info("see all button is clicked");

		}

}
