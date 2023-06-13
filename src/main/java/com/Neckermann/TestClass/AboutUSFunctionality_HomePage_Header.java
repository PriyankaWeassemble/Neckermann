package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class AboutUSFunctionality_HomePage_Header extends TestBaseClass {
	@Test
	public void aboutusfunctionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
           HomePOMClass hm=new HomePOMClass(driver);
           hm.clickonaboutus();
           
           AboutusPOMClass ab=new AboutusPOMClass(driver);
        
           String expectedTitle1 = "About Us Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("about us page is open");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE");        	
		
	}

}
