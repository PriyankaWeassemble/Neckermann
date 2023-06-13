package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class AboutUSFunctionality_HomePage_Footer extends TestBaseClass {
	
	@Test
	public void AboutUSFunctionality_HomePage_Footer1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
         
           HomePOMClass hm=new HomePOMClass(driver);
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6000)");
           Thread.sleep(1000);
           hm.clickonaboutusfromfooter();
        
           String expectedTitle1 = "About Us Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("about us page is open when click from the footer");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE_from_Footer");
           
	}
}
