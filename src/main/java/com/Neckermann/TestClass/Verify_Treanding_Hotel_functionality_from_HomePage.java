package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Treanding_Hotel_functionality_from_HomePage extends TestBaseClass{
	
	
	@Test(enabled=false)
	public void socialmedia_instagram_Functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3800)");
		Thread.sleep(2000);
		
		boolean actual = hm.visibilityoftreandingholidayonhomepage1();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		log.info("treanding holiday component is visible on the home page");
		
		hm.clickonviewnowbuttonforfirsthotel();
		Thread.sleep(2000);
		log.info("User is directed to the hotel");
		
		
  }
	@Test(enabled=false) //check for it
	public void Verify_The_previous_arrow_functionality_of_treandingholidays() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3800)");
		Thread.sleep(2000);
		
		boolean actual = hm.visibilityoftreandingholidayonhomepage1();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		log.info("treanding holiday component is visible on the home page");
		
		hm.clickonpreviousarrow();
		Thread.sleep(2000);
		hm.clickonpreviousarrow();
		
		hm.clickonviewnowbuttonforlasthotel();//28
		Thread.sleep(2000);
		log.info("User is directed to the hotel");
		
		
  }
	@Test(enabled=false)
	public void Verify_The_next_arrow_functionality_of_treandingholidays() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3800)");
		Thread.sleep(2000);
		
		boolean actual = hm.visibilityoftreandingholidayonhomepage1();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		log.info("treanding holiday component is visible on the home page");
		
		hm.clickonnextarrow();
		Thread.sleep(2000);
//		hm.clickonnextarrow();
		
		hm.clickonviewnowbuttonforsecondhotel();//3
		Thread.sleep(2000);
		log.info("User is directed to the hotel");
		
		
  }
	
	
	
	
	
	
	
}
