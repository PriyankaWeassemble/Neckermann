package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.AboutusPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Footer__Functionality extends TestBaseClass{
	//***********1
	@Test  (enabled=false)     // invocationCount=0 or enabled=false-->then this test will not be executed
	public void Footer_container_visiblity_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6300)");
           Thread.sleep(2000);
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoffooter_element_container();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Trust cards are visible on the home page");
   		       
   		  
	}
	
	//***********2
	@Test (enabled=false)
	public void Footer_logo_visiblity_Functionality() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6300)");
           Thread.sleep(1000);
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoflogoonthefooter();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("logo from the footer is visible on the home page");
           
   
           
	}
	
	//***********3
@Test(priority=-1,enabled=false)
     public void Footer_clicklogo_Functionality() throws InterruptedException
	
   {
	    HomePOMClass hm=new HomePOMClass(driver);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,6500)");
        Thread.sleep(2000);
	    
	    hm.clickonlogoonthefooter();
	    log.info("click on the logo from the footer");   
	    Thread.sleep(500);
	    
	       String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open, test case is pass for the logo clicking from the footer");
	    
		   }

//***********4     ---->TEXT REGARDING ISSUE
//	@Test
//	public void Footer_address_Functionality() throws InterruptedException
//	
//	{
//		      HomePOMClass hm=new HomePOMClass(driver);
//		    
//		       JavascriptExecutor js=(JavascriptExecutor)driver;
//	           js.executeScript("window.scroll(0,6100)");
//	           Thread.sleep(3000);		    
//		    
//		    String actualTitle=hm.getaddressfromfooter();
//		    String expectedTitle="Neckermann Travel\r\n"
//		    		+ "1st Floor, Brunswick House\r\n"
//		    		+ "Regent Park, 297 Kingston Road\r\n"
//		    		+ "Leatherhead, Surrey. KT22 7LU";
//		    
////		          log.info(actualTitle);
//		    
//			   Assert.assertEquals(actualTitle, expectedTitle);
//		       log.info("address is correct");  
//		   
////		    Assert.assertEquals(actual, expected);
////		    log.info("Test case is pass for the address from the footer");
//		    
//		    
//		    
//			   }
	

//***********5
@Test(enabled=false)
public void Footer_company_Functionality() throws InterruptedException

{
	       HomePOMClass hm=new HomePOMClass(driver);
	    
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scrollTo(0,7000);");
           Thread.sleep(3000);		    
	    
//           (ATOL Protected,About Us,Contact Us)
           hm.clickonaboutusfromfooter();
           Thread.sleep(1000);
           
           
           
           
           driver.navigate().back();
           Thread.sleep(1000);
           js.executeScript("window.scrollTo(0,7000);");
           Thread.sleep(1000);
           
           
           
           
           
           hm.clickonAtolprotectedfromfooter();
           Thread.sleep(1000);
           driver.navigate().back();
           Thread.sleep(1000);
           
           
           
           
           
           js.executeScript("window.scrollTo(0,7000);");
           Thread.sleep(1000);
           hm.clickoncontactusfromfooter();
	    
		   }

//***********6
@Test(enabled=false)
public void Footer_Legal_Functionality() throws InterruptedException

{
	        HomePOMClass hm=new HomePOMClass(driver);
	    
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scrollTo(0,6500)");
           Thread.sleep(1500);		
           
//           (Booking Conditions,Privacy Policy,Cookie Policy,Terms Of Use)
	        hm.clickonlegalsubmenufromfooterselection("Booking Conditions");
	        Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
	        
	        hm.clickonlegalsubmenufromfooterselection("Privacy Policy");
	        Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
	        hm.clickonlegalsubmenufromfooterselection("Cookie Policy");
	        Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
	        hm.clickonlegalsubmenufromfooterselection("Terms Of Use");
	        
	   
		   }
	
//***********7
@Test(enabled=false)
public void Footer_Holidays_Functionality() throws InterruptedException

{
	        HomePOMClass hm=new HomePOMClass(driver);
	    
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,6500)");
           Thread.sleep(1500);		    
	    //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
	    
            hm.clickonholidaytbsubmenusfromfooterelection("Egypt");  
            Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
           
           
           hm.clickonholidaytbsubmenusfromfooterelection("Cyprus");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Greece");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Turkey");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("UAE");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Spain");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Portugal");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Balearics");
           Thread.sleep(1000);
	        driver.navigate().back();
	        Thread.sleep(1000);
	        js.executeScript("window.scrollTo(0,6500)");
	        Thread.sleep(1000);
	        
           hm.clickonholidaytbsubmenusfromfooterelection("Canary islands");

           
		   }



//***********8 --->CHECKLATER<-----
@Test(enabled=false)
public void Footer_SocialMedia_Instagram_Functionality() throws InterruptedException

{
	        HomePOMClass hm=new HomePOMClass(driver);
	           JavascriptExecutor js=(JavascriptExecutor)driver;
	           js.executeScript("window.scroll(0,6500)");
	           Thread.sleep(1500);
            hm.clcikoninstagramfromfooter();
            Thread.sleep(2000);
            
           List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
   	 	      		   
   		   String expectedTitle2 ="Neckermann Travel UK (@neckermann_uk) â€¢ Instagram photos and videos";   	
		   String actualTitle2 = driver.getTitle();
		   Assert.assertEquals(actualTitle2, expectedTitle2);
           log.info("Neckermann Instagram is open");
          
         
          
	    
	   
	    
	    
	    
		   }

//***********9
@Test(enabled=false)
public void Footer_SocialMedia_Pininsert_Functionality() throws InterruptedException

{
	   HomePOMClass hm=new HomePOMClass(driver);
	   JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scroll(0,6500)");
       Thread.sleep(1500);
	   hm.clcikonPininsertfromfooter();
	   Thread.sleep(1500);
	   
	   List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(allpageaddress.get(1));
	   
	   
	   String expectedTitle2 ="Neckermann Travel (Neckermanntravel) - Profile | Pinterest";   	
	   String actualTitle2 = driver.getTitle();
	   Assert.assertEquals(actualTitle2, expectedTitle2);
	   log.info("Neckermann pininsert is open");		    
	   
	    
	   
	    
	    
	    
		   }


//***********10
@Test(enabled=false)
public void Footer_SocialMedia_Ticktok_Functionality() throws InterruptedException

{
	HomePOMClass hm=new HomePOMClass(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scroll(0,6500)");
    Thread.sleep(1500);
	hm.clcikonTicktockfromfooter();
	  Thread.sleep(1500);
	  
	List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(allpageaddress.get(1));
	   
	   
	   String expectedTitle2 ="TikTok";   	
	   String actualTitle2 = driver.getTitle();
	   Assert.assertEquals(actualTitle2, expectedTitle2);
	   log.info("Neckermann ticktock is open");	    
	    
	     
	   
	    
	    
	    
		   }

//***********11
@Test(enabled=false)
public void Footer_SocialMedia_Facebook_Functionality() throws InterruptedException

{
		HomePOMClass hm=new HomePOMClass(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,6500)");
        Thread.sleep(1500);
	    hm.clcikonFacebookfromfooter();
	    Thread.sleep(1500);
	    
	  List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(allpageaddress.get(1));
	   
	   
	   String expectedTitle2 ="Facebook – log in or sign up";   	
	   String actualTitle2 = driver.getTitle();
	   Assert.assertEquals(actualTitle2, expectedTitle2);
	   log.info("Neckermann facebook is open");		    
	    
	   
	   
	    
	    
	    
		   }

//***********12
@Test(enabled=false)
public void Footer_footercontent_Functionality() throws InterruptedException

{
	        HomePOMClass hm=new HomePOMClass(driver);
	    
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,7000)");
           Thread.sleep(3000);		    
	       
          
           String expectedTitle2 ="When you book a holiday which includes a flight, a flight inclusive holiday, through Neckermann Travel you are financially protected by the ATOL scheme. When you pay you will be supplied with an ATOL Certificate. Please ask for it and check to ensure that everything you booked (flights, hotels and other services) is listed on it. Please see our booking conditions for further information or for more information about financial protection and the ATOL Certificate go to the Civil Aviation Authority";   	
    	   String actualTitle2 = hm.gettextfromfootercontent();
    	   Assert.assertEquals(actualTitle2, expectedTitle2);
    	   log.info("content is matched");
         
		   }

//***********13
@Test(enabled=false)
public void Footer_footerCivilaviationLink_Functionality() throws InterruptedException

{
	        HomePOMClass hm=new HomePOMClass(driver);
	    
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,7000)");
           Thread.sleep(3000);		    
	    
           hm.clcikoncivilaviationlinkfromfootercontent();
           log.info("click on the link from the footer");
           
           List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
     	   driver.switchTo().window(allpageaddress.get(1));
	    
           
           String expectedTitle2 ="Civil Aviation Authority";   	
    	   String actualTitle2 = driver.getTitle();
    	   Assert.assertEquals(actualTitle2, expectedTitle2);
    	   log.info("Civil Aviation Authority from the footer is open");
	    
		   }

}





































