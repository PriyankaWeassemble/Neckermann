package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class AboutuspageElement_Trustpilot_Functionality extends TestBaseClass {
	
	@Test
	public void AboutuspageElement_Trustpilot_Functionality1() throws IOException, InterruptedException {
		
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
      
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1400)");
        Thread.sleep(1000);
		
		 AboutusPOMClass ab=new AboutusPOMClass(driver);
		 ab.clickontrustpiolet();
		 Thread.sleep(2000);
		 
		 //switch the window 
		 
		 
		 
		 
		 
		 String expectedTitle1 = "Neckermann Travel Reviews | Read Customer Service Reviews of neckermanntravel.co.uk";   	
		 String actualTitle1 = driver.getTitle();
		 Assert.assertEquals(actualTitle1, expectedTitle1);
		 log.info("Click on the trustpilot from the about us page");

		
	}

}
