package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_fromthe_aboutusPage_User_clickon_forward_and_BackwardArrow_intheReviewSection extends TestBaseClass {

	@Test
	public void AboutuspageElement_nextbackarrow_Functionality() throws IOException, InterruptedException {


		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonaboutus();
//      ScreenshotClass.takeScreenshot(driver, "aboutUs_PAGE");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1600)");
		Thread.sleep(1000);

		AboutusPOMClass ab = new AboutusPOMClass(driver);
		ab.clickonnextarrow();
		Thread.sleep(1000);
		ab.clickonpreviousarrow();
		Thread.sleep(1000);

	}
	
	
	
	
	
	
	
	
	
	
}
