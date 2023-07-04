package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_title_of_collection_Page extends TestBaseClass{

		@Test
		public void check_title_ofcollection() throws IOException, InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
			// assertions need to be add

			CollectionPOMClass cm = new CollectionPOMClass(driver);
			   Properties prop=new Properties();
		   	   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle = prop.getProperty("collectionHeading");
			String actual2 = cm.gettextfromTitleofcollection();
			Assert.assertEquals(actual2, expectedTitle);
			log.info("Title of the collection is correct");

		}

}
