package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Newsletter_and_footer_Visibility_on_ATOLPage extends TestBaseClass{

	@Test
	public void Atolprotecetdfunctionality_visiblityofNewsletter_Footer() throws IOException {
		
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

		AboutusPOMClass ab = new AboutusPOMClass(driver);
		boolean expectedTitle2 = ab.visiblityofnewsletter();
		boolean actualTitle2 = true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("newsletter is visible on the atol protected page");

		boolean expectedTitle3 = ab.visiblityoffooteraboutus();
		boolean actualTitle3 = true;
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("footer is visible on the atol protected page");

	}
}
