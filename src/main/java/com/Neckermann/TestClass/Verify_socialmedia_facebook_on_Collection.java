package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_facebook_on_Collection extends TestBaseClass{

	// 7.****facebook****
		@Test(enabled = false)
		public void socialmedia_facebook_Functionality() throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			cm.clickonfacebook();
			Thread.sleep(3000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));

			String expectedTitle3 = "Facebook – log in or sign up";
			String actualTitle3 = driver.getTitle();
			Assert.assertEquals(actualTitle3, expectedTitle3);
			log.info("Neckermann facebook is open");

		}
	
	
}
