package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Footer__Functionality extends TestBaseClass{
	
	@Test
	public void Footer_container_visiblity_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6100)");
           Thread.sleep(2000);
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoffooter_element_container();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Trust cards are visible on the home page");
   		       
   		  
	}
	
	
	@Test
	public void Footer_logo_visiblity_Functionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6100)");
           Thread.sleep(1000);
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoflogoonthefooter();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("logo from the footer is visible on the home page");
           
   
           
	}
	
@Test
     public void Footer_clicklogo_Functionality() throws InterruptedException
	
   {
	    HomePOMClass hm=new HomePOMClass(driver);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,6100)");
        Thread.sleep(1000);
	    
	    hm.clickonlogoonthefooter();
	    log.info("click on the logo from the footer");   
	    Thread.sleep(1000);
	    
	       String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open, test case is pass for the logo clicking from the footer");
	    
		   }
	@Test
	public void Footer_address_Functionality() throws InterruptedException
	
	{
		    HomePOMClass hm=new HomePOMClass(driver);
		    
		       JavascriptExecutor js=(JavascriptExecutor)driver;
	           js.executeScript("window.scroll(0,6100)");
	           Thread.sleep(1000);		    
		    
		    String actual=hm.getaddressfromfooter();
		    String expected="Neckermann Travel\r\n"
		    		+ "1st Floor, Brunswick House\r\n"
		    		+ "Regent Park, 297 Kingston Road\r\n"
		    		+ "Leatherhead, Surrey. KT22 7LU";
		    log.info("click on the logo from the footer"); 
		   
		    Assert.assertEquals(actual, expected);
		    log.info("Test case is pass for the address from the footer");
		    
		    
		    
			   }
	
	@Test
	public void AboutuspageElement_Trustpilot_Functionality1() throws IOException, InterruptedException {
		
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
      
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1400)");
        Thread.sleep(1000);
		
		 AboutusPOMClass ab=new AboutusPOMClass(driver);
		 ab.clickontrustpiolet();
		 Thread.sleep(2000);
		 
		 //switch the window 
		 
		 List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(allpageaddress.get(1));
		 
		 String expectedTitle1 = "Neckermann Travel Reviews | Read Customer Service Reviews of neckermanntravel.co.uk";   	
		 String actualTitle1 = driver.getTitle();
		 Assert.assertEquals(actualTitle1, expectedTitle1);
		 log.info("Click on the trustpilot from the about us page");

		
	}
	
	
	
	
}
