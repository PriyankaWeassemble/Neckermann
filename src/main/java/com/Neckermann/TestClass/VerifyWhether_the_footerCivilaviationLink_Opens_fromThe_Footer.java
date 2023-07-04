package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_the_footerCivilaviationLink_Opens_fromThe_Footer extends TestBaseClass {
	@Test
	public void Footer_footercontent_Functionality() throws InterruptedException, IOException

	{
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,7000)");
		Thread.sleep(3000);

		
		   Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);

		
		String expectedTitle2 = prop.getProperty("textbelowthefoote");
		String actualTitle2 = hm.gettextfromfootercontent();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("content is matched");

	}
}
