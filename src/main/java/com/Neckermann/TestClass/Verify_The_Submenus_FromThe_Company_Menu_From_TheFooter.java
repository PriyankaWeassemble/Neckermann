package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_Submenus_FromThe_Company_Menu_From_TheFooter extends TestBaseClass{
	@Test
	public void Footer_company_Functionality() throws InterruptedException, IOException

	{
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,7000);");
		Thread.sleep(3000);

//           (ATOL Protected,About Us,Contact Us)
		hm.clickonaboutusfromfooter();
		Thread.sleep(1000);
		
		   Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);

		
		String expectedTitle1 = prop.getProperty("AboutusTitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("about us page is open when click on the Footer");
//		ScreenshotClass.takeScreenshot(driver,"aboutuswhenclickfromthefooter");

		driver.navigate().back();
		Thread.sleep(1000);

		js.executeScript("window.scrollTo(0,7000);");
		Thread.sleep(1000);
		hm.clickonAtolprotectedfromfooter();
		Thread.sleep(1000);
		String expectedTitle2 = prop.getProperty("ATOLProtectedtitle");
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("ATOL protected page is open when click on the Footer");
//		ScreenshotClass.takeScreenshot(driver,"atolprotectedwhenclickfromthefooter");
		driver.navigate().back();
		Thread.sleep(1000);

		js.executeScript("window.scrollTo(0,7000);");
		Thread.sleep(1000);
		hm.clickoncontactusfromfooter();
		String expectedTitle3 = prop.getProperty("Contactustitle");
		String actualTitle3 = driver.getTitle();
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("Contact US page is open when click on the Footer");
//		ScreenshotClass.takeScreenshot(driver,"cwhenclickfromthefooter");
	}
	
}
