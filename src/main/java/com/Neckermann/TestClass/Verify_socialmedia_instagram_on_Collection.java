package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_instagram_on_Collection extends TestBaseClass {
	// 6. ****instagram****
		@Test(enabled = false)
		public void socialmedia_instagram_Functionality() throws InterruptedException {
			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonparticularcollection();
			Thread.sleep(2000);
			CollectionPOMClass cm = new CollectionPOMClass(driver);

			js.executeScript("window.scroll(0,900)");
			Thread.sleep(2000);

			cm.clickoninstagram();
			Thread.sleep(1000);
			List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allpageaddress.get(1));
			String expectedTitle2 = "Instagram";
			String actualTitle2 = driver.getTitle();
			Assert.assertEquals(actualTitle2, expectedTitle2);
			log.info("Neckermann Instagram is open");
		}
	
}
