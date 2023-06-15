package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Aboutus_functionality extends TestBaseClass{
	
	@Test
	public void Aboutusfunctionality_visiblityofNewsletter() throws IOException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
   
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		boolean expectedTitle1=ab.visiblityofnewsletter();
		boolean actualTitle1=true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("newsletter is visible on the about us page");
		
		boolean expectedTitle2=ab.visiblityoffooteraboutus();
		boolean actualTitle2=true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("footer is visible on the about us page");
		
	  
	}
	
	
	@Test
	public void AboutUSFunctionality_HomePage_Footer() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
         
           HomePOMClass hm=new HomePOMClass(driver);
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6000)");
           Thread.sleep(1000);
           hm.clickonaboutusfromfooter();
        
           String expectedTitle1 = "About Us Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("about us page is open when click from the footer");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE_from_Footer");
           
	}
	
	
	@Test
	public void AboutUSFunctionality_HomePage_Header() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
           HomePOMClass hm=new HomePOMClass(driver);
           hm.clickonaboutus();
           
           AboutusPOMClass ab=new AboutusPOMClass(driver);
        
           String expectedTitle1 = "About Us Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("about us page is open");
//           ScreenshotClass.takeScreenshot(driver, "aboutus_PAGE");        	
		
	}
	@Test
	public void AboutuspageElement_contactus_Functionality() throws IOException, InterruptedException {
		
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
      
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		log.info("click on about us");
		  
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1600)");
        Thread.sleep(1000);
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		ab.clickoncontactusonaboutus();
		Thread.sleep(1000);
		String expectedTitle2 = "Contact Us | Neckermanntravel";   	
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("click on contact us button from the about us page");
	

}
	
	@Test
	public void AboutuspageElement_nextbackarrow_Functionality() throws IOException, InterruptedException {
		
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
      
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonaboutus();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1600)");
        Thread.sleep(1000);
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		ab.clickonnextarrow();
		Thread.sleep(1000);
		ab.clickonpreviousarrow();
		Thread.sleep(1000);
		

}
	
	@Test
	public void AboutuspageElement_Trustpilot_Functionality() throws IOException, InterruptedException {
		
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
