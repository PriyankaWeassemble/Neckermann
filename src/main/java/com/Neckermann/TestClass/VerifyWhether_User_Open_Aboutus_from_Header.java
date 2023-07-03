package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_User_Open_Aboutus_from_Header extends TestBaseClass{
	@Test
	public void AboutUSFunctionality_HomePage_Header() throws IOException, InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickonaboutus();
		AboutusPOMClass ab = new AboutusPOMClass(driver);

		String expectedTitle1 = "About Us Neckermanntravel";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("about us page is open when click on the header");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE");        	

	}

}
