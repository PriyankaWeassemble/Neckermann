package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Other_Functionality_From_Homepage extends TestBaseClass{
	
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
	
	
//	*************Check for it*****************
	@Test
	public void Review_onThe_Homepage_Functionality() throws IOException, InterruptedException
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
	
	@Test
	public void Trust_cards_onhomepage_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoftrustcard_homepage();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Trust cards are visible on the home page");
   		    
   		 
	}

	
	
	
	

}
