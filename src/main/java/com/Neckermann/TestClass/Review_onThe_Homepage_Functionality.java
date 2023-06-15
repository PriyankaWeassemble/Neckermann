package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Review_onThe_Homepage_Functionality extends TestBaseClass{
	@Test
	public void Review_onThe_Homepage_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityofReviewcomponent_homepage();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Review component is visible on the home page");

   		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,5225)");
           Thread.sleep(2000);
         
   		   hm.clickonnextarrow_review_homepage();
   		   log.info("forword arrow clicked");
   		   Thread.sleep(2000);
   		   
		   hm.clickonpreviousarrow_review_homepage();
   		   log.info("back arrow clicked ");
   		   Thread.sleep(2000);
   		   
   	       hm.clickontrustpiolet_homepage();
   	       
   	       List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
   	 	   
   		   
   		   String expectedTitle2 ="Neckermann Travel Reviews | Read Customer Service Reviews of neckermanntravel.co.uk";   	
		   String actualTitle2 = driver.getTitle();
		   Assert.assertEquals(actualTitle2, expectedTitle2);
           log.info("Trustpilot side is open");
   		   
   		   
           
	}

}
