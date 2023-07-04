package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyThe_Reviews_functionality_on_The_HomePage extends TestBaseClass{
	@Test
	public void Review_onThe_Homepage_Functionality() throws IOException, InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5450)");
		Thread.sleep(3000);

		hm.clickonnextarrow_review_homepage();
		log.info("forword arrow clicked");
//	    ScreenshotClass.takeScreenshot(driver, "Forwardarowclick");
		Thread.sleep(2000);

		hm.clickonpreviousarrow_review_homepage();
		log.info("back arrow clicked ");
//	    ScreenshotClass.takeScreenshot(driver, "backwardarrowclick");
		Thread.sleep(2000);

		hm.clickontrustpiolet_homepage();
//	       ScreenshotClass.takeScreenshot(driver, "trustpilotPage");

		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		Properties prop=new Properties();
		FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
	    prop.load(ip);

		String expectedTitle2 = prop.getProperty("TrustpilotLinkTitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Trustpilot side is open");

	}

}
