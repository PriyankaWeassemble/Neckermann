package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_clickontrustpilotonfeelthelove_on_ATOLProtected extends TestBaseClass{

	@Test
	public void ATOLProtected_clickontrustpilotonfeelthelove_Link_Functionality1()
			throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonatolprotected();

//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);
		   
		String expectedTitle1 = prop.getProperty("ATOLProtectedtitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("click on ATOL Protected ");
		AtolPOMClass ac = new AtolPOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);

		AtolPOMClass at = new AtolPOMClass(driver);
		at.clickonfeelthelove_trustpilot();
		log.info("click on the trustpilot link from the feel the love");
//		ScreenshotClass.takeScreenshot(driver, "trustpiolet_page");
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle2 = prop.getProperty("TrustpilotLinkTitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("user is directed to neckermann trustpilot");
	}
}
