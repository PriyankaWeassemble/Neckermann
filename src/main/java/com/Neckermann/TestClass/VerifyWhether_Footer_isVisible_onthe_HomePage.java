package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_Footer_isVisible_onthe_HomePage extends TestBaseClass{

	@Test // invocationCount=0 or enabled=false-->then this test will not be executed
	public void Footer_container_visiblity_Functionality1() throws IOException, InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6300)");
		Thread.sleep(2000);
//		ScreenshotClass.takeScreenshot(driver,"footerontheHomepage");
		HomePOMClass hm = new HomePOMClass(driver);
		boolean expectedTitle1 = hm.visiblityoffooter_element_container();
		boolean actualTitle1 = true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("Trust cards are visible on the home page");

	}
}
