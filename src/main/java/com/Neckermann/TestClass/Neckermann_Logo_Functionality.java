package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Neckermann_Logo_Functionality extends TestBaseClass {
	@Test
	public void Neckermann_Logo_Functionality() throws InterruptedException, IOException
	{
		String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
	       log.info("Home page is open");
	       
	       HomePOMClass hm=new HomePOMClass(driver);
	       hm.clickonaboutus();
	       log.info("click on the aboiut us");
	      
	       
	       hm.clickonlogofromheader();
	       Thread.sleep(2000);
	       String expectedTitle1 = "Neckermann Travel | Home Page";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
	       log.info("logo from the header is clicked ");
//	       ScreenshotClass.takeScreenshot(driver, "afterclickinglogocomes");
	   
		
	}

}
