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

public class Verify_Footer_SocialMedia_Pininsert_Functionality extends TestBaseClass{
	@Test
	public void Footer_SocialMedia_Pininsert_Functionality() throws InterruptedException, IOException

	{
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,7000)");
		Thread.sleep(5000);
		hm.clcikonPininsertfromfooter();
//		Thread.sleep(1500);

		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		   Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);

		
		String expectedTitle2 = prop.getProperty("Pininserttitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Neckermann pininsert is open");
//		ScreenshotClass.takeScreenshot(driver,"PininsertpageNeckermann");
	}

}
