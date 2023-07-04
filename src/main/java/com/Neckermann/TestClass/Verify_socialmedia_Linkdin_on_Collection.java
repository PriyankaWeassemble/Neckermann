package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_socialmedia_Linkdin_on_Collection extends TestBaseClass{
	// 9. *****linkdin*****
			@Test(enabled = false)
			public void socialmedia_linkdin_Functionality() throws InterruptedException {
				HomePOMClass hm = new HomePOMClass(driver);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,2900)");
				Thread.sleep(2000);

				hm.clickonparticularcollection();
				Thread.sleep(2000);
				CollectionPOMClass cm = new CollectionPOMClass(driver);

				js.executeScript("window.scroll(0,900)");
				Thread.sleep(2000);

				cm.clickonlinkdin();
				Thread.sleep(3000);
				List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(allpageaddress.get(1));

				String expectedTitle5 = "LinkedIn: Log In or Sign Up";
				String actualTitle5 = driver.getTitle();
				Assert.assertEquals(actualTitle5, expectedTitle5);
				log.info("linkdin is open");

			}
}
