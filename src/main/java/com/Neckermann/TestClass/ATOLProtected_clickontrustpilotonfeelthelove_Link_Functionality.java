package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AtolPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class ATOLProtected_clickontrustpilotonfeelthelove_Link_Functionality extends TestBaseClass{

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
	
	
}
