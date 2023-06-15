package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Newsletter_Homepage_Negativetestcase3_Functionality extends TestBaseClass{

	@Test
	public void Newsletter_Homepage_Negativetestcase3_Functionality1() throws InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
        
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityofNewsletter_Component_homepage();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Newsletter component is visible on the home page");
      
   	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,5100)");
           Thread.sleep(2000);
            

           
           hm.clcikonsignup_newsletter();
           log.info("signup button clicked");
           
//           String expectedmsg ="User subscribed to the newsletter, please check your email";   	
//		   String actualmsg = hm.getmessagefromthetoast();
//		   if(expectedmsg.equals(actualmsg))
//           Thread.sleep(1000);
          
           if(hm.visiblityofemailisrequired_error_message()==true)
		   log.info("test case is pass ");
   	   
		
	}

}
	

