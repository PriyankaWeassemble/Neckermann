package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Atolprotecetdfunctionality_visiblityofNewsletter_Footer extends TestBaseClass{

	@Test
	public void Atolprotecetdfunctionality_visiblityofNewsletter_Footer1() throws IOException
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
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		boolean expectedTitle2=ab.visiblityofnewsletter();
		boolean actualTitle2=true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("newsletter is visible on the atol protected page");
		
		boolean expectedTitle3=ab.visiblityoffooteraboutus();
		boolean actualTitle3=true;
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("footer is visible on the atol protected page");
		
		
		  
	}
	
	
	
	
	
	
	
}
