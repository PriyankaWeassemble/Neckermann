package com.Neckermann.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class FlashDealsVideo_functionality extends TestBaseClass {
	
	@Test
	public void FlashDealsVideo_functionality() throws InterruptedException
	{
		String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
	       log.info("Home page is open");
	       
	       HomePOMClass hm=new HomePOMClass(driver);
	       hm.clickonthevideo1();
	       Thread.sleep(2000);
	         log.info("1st video play");
	         
	         hm.clickonthevideo2();
	         log.info("2n video play");
	         Thread.sleep(2000);
		
	}
	
}
