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

public class ATOLprotecetd_Functionality extends TestBaseClass{
	
	@Test
	public void ATOLProtected_clickonATOL_Link_Functionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
//           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		   HomePOMClass hm= new HomePOMClass(driver);
		   hm.clickonatolprotected();
		
//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           AtolPOMClass ac=new AtolPOMClass(driver);
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(2000);
          
           AtolPOMClass at=new AtolPOMClass(driver);
           at.clickonAtolprotectedreadmore();
           log.info("click on the atol protected read more");
           at.clickonAtollink();
           
           
           List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
  		    driver.switchTo().window(allpageaddress.get(1));
  		 
  		 String expectedTitle2 = "ATOL protection | Civil Aviation Authority";   	
  		 String actualTitle2 = driver.getTitle();
  		 Assert.assertEquals(actualTitle2, expectedTitle2);
  		 log.info("user is directed to the ATOL link");
}
	
	

	@Test
	public void Atolprotecetdfunctionality_visiblityofNewsletter_Footer() throws IOException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonatolprotected();
		
		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
		
		AboutusPOMClass ab=new AboutusPOMClass(driver);
		boolean expectedTitle2=ab.visiblityofnewsletter();
		boolean actualTitle2=true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("newsletter is visible on the atol protected page");
		
		boolean expectedTitle3=ab.visiblityoffooteraboutus();
		boolean actualTitle3=true;
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("footer is visible on the atol protected page");
		  
	}
	
	
	@Test
	public void ATOLProtected_clickontrustpilotonfeelthelove_Link_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
//           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		   HomePOMClass hm= new HomePOMClass(driver);
		   hm.clickonatolprotected();
		
//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           AtolPOMClass ac=new AtolPOMClass(driver);
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(2000);
          
           AtolPOMClass at=new AtolPOMClass(driver);
           at.clickonfeelthelove_trustpilot();
           log.info("click on the trustpilot link from the feel the love");
          
           List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
 		    driver.switchTo().window(allpageaddress.get(1));
           
  		 String expectedTitle2 = "Neckermann Travel Reviews | Read Customer Service Reviews of neckermanntravel.co.uk";   	
  		 String actualTitle2 = driver.getTitle();
  		 Assert.assertEquals(actualTitle2, expectedTitle2);
  		 log.info("user is directed to neckermann trustpilot");
}
	
	@Test
	public void ATOLProtected_clickonunbdeatableprice_Link_Functionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
//           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		   HomePOMClass hm= new HomePOMClass(driver);
		   hm.clickonatolprotected();
		
//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           AtolPOMClass ac=new AtolPOMClass(driver);
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(2000);
          
           AtolPOMClass at=new AtolPOMClass(driver);
           at.clickonQualityassured();
           log.info("click on the quality assured read more link");
           at.clickoncontactuslink();
           
  		 String expectedTitle2 = "Contact Us | Neckermanntravel";   	
  		 String actualTitle2 = driver.getTitle();
  		 Assert.assertEquals(actualTitle2, expectedTitle2);
  		 log.info("user is directed to the ATOL link");
}
	
	
	@Test
	public void ATOLProtected_clickonunbeatableprice_Link_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
//           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		   HomePOMClass hm= new HomePOMClass(driver);
		   hm.clickonatolprotected();
		
//		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           AtolPOMClass ac=new AtolPOMClass(driver);
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(2000);
          
           AtolPOMClass at=new AtolPOMClass(driver);
           at.clickonunbeatableprice();
           log.info("click on the unbeatable price read more");
           at.clickontermsconditionslink();
  		 
  		 String expectedTitle2 = "Terms of use Neckermanntravel";   	
  		 String actualTitle2 = driver.getTitle();
  		 Assert.assertEquals(actualTitle2, expectedTitle2);
  		 log.info("user is directed to the ATOL link");

}
	
	@Test
	public void atolprotecetdfunctionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           ScreenshotClass.takeScreenshot(driver, "Home_PAGE");
        
		HomePOMClass hm= new HomePOMClass(driver);
		hm.clickonatolprotected();
		
		ScreenshotClass.takeScreenshot(driver, "ATOL_PAGE");
		
		   String expectedTitle1 = "Book with confidence- Neckermanntravel";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("click on ATOL Protected ");
           
           String expectedTitle2 = "Book with Confidence - Neckermanntravel";  
           AtolPOMClass ac=new AtolPOMClass(driver);  
		   String actualTitle2 = ac.headerelementtitlefetch();
		   Assert.assertEquals(actualTitle2, expectedTitle2);
           log.info("Heading is correct");
                    
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,600)");
           Thread.sleep(3000);
           ac.clickAllPopup();
           log.info("all pop up's are clicked");
           
           
	}
	
	
	
}
