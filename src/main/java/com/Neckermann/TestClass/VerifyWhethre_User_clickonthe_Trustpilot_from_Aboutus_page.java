package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhethre_User_clickonthe_Trustpilot_from_Aboutus_page extends TestBaseClass {

	@Test
	public void AboutuspageElement_Trustpilot_Functionality() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
//      ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1400)");
		Thread.sleep(1000);

		AboutusPOMClass ab = new AboutusPOMClass(driver);
		ab.clickontrustpiolet();
		Thread.sleep(2000);
//      ScreenshotClass.takeScreenshot(driver, "Neckermann_Trustpilot_PAGE");
		
		// switch the window

		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle1 = "Neckermann Travel Reviews | Read Customer Service Reviews of neckermanntravel.co.uk";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("Click on the trustpilot from the about us page");

	}

}
