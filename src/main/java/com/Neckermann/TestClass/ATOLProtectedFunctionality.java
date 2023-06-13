package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class ATOLProtectedFunctionality extends TestBaseClass{
	
	@Test
	public void atolprotecetdfunctionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonatolprotected();
		
		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           
           String expectedTitle2 = "Book with Confidence - Neckermanntravel";  
           AtolPOMClass ac=new AtolPOMClass(driver);  
		   String actualTitle2 = ac.headerelementtitlefetch();
		   Assert.assertEquals(actualTitle2, expectedTitle2);
           log.info("Heading is correct");
                    
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(3000);
           ac.clickAllPopup();
           log.info("all pop up's are clicked");
           
           
           
           
           
           
	}
}
