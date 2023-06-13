package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Aboutusfunctionality_visiblityofNewsletter_Footer extends TestBaseClass{
	
	@Test
	public void Aboutusfunctionality_visiblityofNewsletter1() throws IOException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
   
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		boolean expectedTitle1=ab.visiblityofnewsletter();
		boolean actualTitle1=true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("newsletter is visible on the about us page");
		
		boolean expectedTitle2=ab.visiblityoffooteraboutus();
		boolean actualTitle2=true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("footer is visible on the about us page");
		
		
		  
	}

}
