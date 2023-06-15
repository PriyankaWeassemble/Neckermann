package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Newsletter_Homepage_Negativetestcase_Functionality extends TestBaseClass {
	
		
		@Test
		public void Newsletter_Homepage_Negativetestcase_Functionality1() throws InterruptedException
		{
			//already subscribed email
			
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
	           js.executeScript("window.scroll(0,5000)");
	           Thread.sleep(2000);
	            
	           hm.enteremailidinnewsletter("priyanka@weassemble.team");
	           log.info("email id entered");
	           
	           hm.clcikonsignup_newsletter();
	           log.info("signup button clicked");
	           
//	           String expectedmsg ="User subscribed to the newsletter, please check your email";   	
//			   String actualmsg = hm.getmessagefromthetoast();
//			   if(expectedmsg.equals(actualmsg))
//	           Thread.sleep(1000);
	          
	           if(hm.visiblityofToast_for_errorssmessage()==true)
			   log.info("test case is pass ");
	   	   
			   
			   
			
		}

	}