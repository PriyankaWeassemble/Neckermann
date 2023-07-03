package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_Useropens_AboutUs_from_Footer extends TestBaseClass{
	@Test
	public void AboutUSFunctionality_HomePage_Footer() throws IOException, InterruptedException {
		
			

		HomePOMClass hm = new HomePOMClass(driver);
//           
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6000)");
	
		Thread.sleep(3000);
//      ScreenshotClass.takeScreenshot(driver, "Scrollto_the_Footer");
		
		hm.clickonaboutusfromfooter();
		String expectedTitle1 = "About Us Neckermanntravel";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("about us page is open when click from the footer");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE_from_Footer");

	}

}
