package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_twitter_on_Collection extends TestBaseClass{

	// 8.****twitter****
		@Test(enabled = false)
		public void socialmedia_twitter_Functionality() throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			cm.clickontwitter();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle4 = "Explore / Twitter";
			String actualTitle4 = driver.getTitle();
			Assert.assertEquals(actualTitle4, expectedTitle4);
			log.info("twitter is open");

		}
	
}
