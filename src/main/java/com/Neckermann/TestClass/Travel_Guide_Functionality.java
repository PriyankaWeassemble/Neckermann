package com.Neckermann.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.TravelGuidePOMClass;

public class Travel_Guide_Functionality extends TestBaseClass {
	
	//1. click on tourist information link
	@Test(enabled=false)
	public void tourist_informationlink_Functionality() throws InterruptedException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Travel guide");
	       log.info("click on the Travel guide tab");
	       Thread.sleep(500);
	       
	       js.executeScript("window.scroll(0,900)");
           Thread.sleep(2000);
           
           TravelGuidePOMClass trm=new TravelGuidePOMClass(driver);
	       trm.clickontourist_information_link();
	       
	       
	       List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
	       String expectedTitle1 = "Egyptian Tourism Authority";   	
		   String actualTitle1 = driver.getTitle();
		   Assert.assertEquals(actualTitle1, expectedTitle1);
           log.info("Egyptian Tourism Authority link is open");
           
	}   
	
	//2. click on visa health link--->*****ADD ASSERTIONS FOR PAGE
		@Test(enabled=false)
		public void visa_healthlink_Functionality() throws InterruptedException 
		{
			   String expectedTitle = "Neckermann Travel | Home Page";   	
			   String actualTitle = driver.getTitle();
			   Assert.assertEquals(actualTitle, expectedTitle);
	           log.info("Home page is open");

			   HomePOMClass hm= new HomePOMClass(driver);
			   
			   JavascriptExecutor js=(JavascriptExecutor)driver;
	           js.executeScript("window.scroll(0,1800)");
	           Thread.sleep(2000);
			   
	           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
			   hm.clickonalldestinationsfromhomepage("Egypt");
			   Thread.sleep(2000);  
			   
			   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
		       dm.clickonsubmenusfromdestination("Travel guide");
		       log.info("click on the Travel guide tab");
		       Thread.sleep(500);
		       
		       js.executeScript("window.scroll(0,900)");
	           Thread.sleep(2000);
	           
	           TravelGuidePOMClass trm=new TravelGuidePOMClass(driver);
		       trm.clickonvisa_health_link();
		       
		       
		       List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
	           driver.switchTo().window(allpageaddress.get(1));
		       String expectedTitle1 = "Egypt travel advice - GOV.UK";   	
			   String actualTitle1 = driver.getTitle();
			   Assert.assertEquals(actualTitle1, expectedTitle1);
	           log.info("Egypt travel advice - GOV.UK link is open");
	           
		}

	
		//3. click on more travel guide
				@Test (enabled=false)
				public void more_travel_guide_Functionality() throws InterruptedException 
				{
					   String expectedTitle = "Neckermann Travel | Home Page";   	
					   String actualTitle = driver.getTitle();
					   Assert.assertEquals(actualTitle, expectedTitle);
			           log.info("Home page is open");

					   HomePOMClass hm= new HomePOMClass(driver);
					   
					   JavascriptExecutor js=(JavascriptExecutor)driver;
			           js.executeScript("window.scroll(0,1800)");
			           Thread.sleep(2000);
					   
			           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
					   hm.clickonalldestinationsfromhomepage("Egypt");
					   Thread.sleep(2000);  
					   
					   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
				       dm.clickonsubmenusfromdestination("Travel guide");
				       log.info("click on the Travel guide tab");
				       Thread.sleep(500);
				       
				       js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           
			           //[Cyprus, Greece, Spain,Balearic Island,Portugal, Canary Islands, United Arab Emirates, Turkey, Egypt]
			           TravelGuidePOMClass trm=new TravelGuidePOMClass(driver);
				       trm.clickonallmorelinks("Cyprus");
				       //assertion needed
				       List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress.get(1));
			           Thread.sleep(2000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Greece");
			           List<String> allpageaddress1= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress1.get(2));
			           
			           js.executeScript("window.scroll(0,700)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Spain");
			           List<String> allpageaddress2= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress2.get(3));
			           Thread.sleep(1000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Balearic Island");
			           List<String> allpageaddress3= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress3.get(4));
			           Thread.sleep(1000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Portugal");
			           List<String> allpageaddress4= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress4.get(5));
			           Thread.sleep(1000);
			           
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Canary Islands");
			           List<String> allpageaddress5= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress5.get(6));
			           Thread.sleep(1000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("United Arab Emirates");
			           List<String> allpageaddress6= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress6.get(7));
			           Thread.sleep(1000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Turkey");
			           List<String> allpageaddress7= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress7.get(8));
			           Thread.sleep(1000);
			           
			           js.executeScript("window.scroll(0,900)");
			           Thread.sleep(2000);
			           trm.clickonallmorelinks("Egypt");
			           List<String> allpageaddress8= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress8.get(9));
				       
			           
				}
				
				
				//4. FCDO link click
		
				@Test (enabled=false)
				public void FCDO_link_Functionality() throws InterruptedException 
				{
					   String expectedTitle = "Neckermann Travel | Home Page";   	
					   String actualTitle = driver.getTitle();
					   Assert.assertEquals(actualTitle, expectedTitle);
			           log.info("Home page is open");

					   HomePOMClass hm= new HomePOMClass(driver);
					   
					   JavascriptExecutor js=(JavascriptExecutor)driver;
			           js.executeScript("window.scroll(0,1800)");
			           Thread.sleep(2000);
					   
			           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
					   hm.clickonalldestinationsfromhomepage("Egypt");
					   Thread.sleep(2000);  
					   
					   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
				       dm.clickonsubmenusfromdestination("Travel guide");
				       log.info("click on the Travel guide tab");
				       Thread.sleep(500);
				       
				       js.executeScript("window.scroll(0,2600)");
			           Thread.sleep(2000);
			           
			           TravelGuidePOMClass trm=new TravelGuidePOMClass(driver);
				       trm.Click_FCDO_link();
				       
				       
				       List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
			           driver.switchTo().window(allpageaddress.get(1));
				       String expectedTitle1 = "Foreign, Commonwealth & Development Office - GOV.UK";   	
					   String actualTitle1 = driver.getTitle();
					   Assert.assertEquals(actualTitle1, expectedTitle1);
			           log.info("FCDO link is open");
			           
				}
	
	
	
	
	
	
	
	
	
	
	

//	click on the more travel guides
//	your guides to Egypt-->food & drinks, Beachses, We love, At a glance
//	FCDO website
//	View button click
//	FAQ's
	
	
	
	

}
