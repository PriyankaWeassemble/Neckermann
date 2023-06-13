package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class AboutuspageElement_contactus_Functionality extends TestBaseClass {
	@Test
	public void AboutuspageElement_contactus_Functionality1() throws IOException, InterruptedException {
		
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
      
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		  
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1600)");
        Thread.sleep(1000);
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		ab.clickoncontactusonaboutus();
		Thread.sleep(1000);
		String expectedTitle2 = "Contact Us | Neckermanntravel";   	
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("click on contact us button from the about us page");
	

}
}
