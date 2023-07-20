package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Blog_Functionality extends TestBaseClass{
	
	@Test
	public void name() throws InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6300)");
		Thread.sleep(1000);
		
           hm.clickonSeeAllbutton();
           Thread.sleep(2000);
           String expectedText = "Blogs | NeckermannTravel";   	
		   String actualText =  driver.getTitle();
		   Assert.assertEquals(actualText, expectedText);
           log.info("text is correct in the destination field");
           
           
           
	}
	

}
