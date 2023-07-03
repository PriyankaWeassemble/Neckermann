package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VisibilityofNewsletter_and_Footer_On_Aboutus_Page extends TestBaseClass {
	
	@Test
	public void visiblityofNewsletter_on_Aboutus() throws IOException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
//      ScreenshotClass.takeScreenshot(driver, "about_us");
		
		AboutusPOMClass ab = new AboutusPOMClass(driver);
		boolean expectedTitle1 = ab.visiblityofnewsletter();
		boolean actualTitle1 = true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("newsletter is visible on the about us page");

		boolean expectedTitle2 = ab.visiblityoffooteraboutus();
		boolean actualTitle2 = true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("footer is visible on the about us page");

	}
	
	
	

}
