package com.Neckermann.TestClass;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class HamburgerMenu_Functionality extends TestBaseClass {
	
	//1
	@Test
	public void HamburgerMenu_Company_Functionality() throws IOException
	{
	
	   String expectedTitle = "Neckermann Travel | Home Page";   	
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
       log.info("Home page is open");
       
       HomePOMClass hm=new HomePOMClass(driver);
       hm.clcikonHamburgermenu();
       log.info("click on the hamburger menu");
//       ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");
       
     	   
////	   selection of menus-->Company
//	   
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Company");
//	   hm.clickoncompanysubmenuselection("Contact Us");
//	   log.info("User is on the Contact Us");
//	   ScreenshotClass.takeScreenshot(driver, "Company_Contact_Us");
	   
	   
////	   selection of menus-->Legal(Booking Conditions,Privacy Policy,Cookie Policy,Terms Of Use)
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Legal");
//	   hm.clickonlegalsubmenuselection("Booking Conditions");
//	   log.info("User is on the Booking Conditions");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Booking_Conditions");
//	   
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Legal");
//	   hm.clickonlegalsubmenuselection("Privacy Policy");
//	   log.info("User is on the Privacy Policy");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Privacy_Policy");
//	   
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Legal");
//	   hm.clickonlegalsubmenuselection("Cookie Policy");
//	   log.info("User is on the Cookie Policy");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Cookie_Policy");
//	   
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Legal");
//	   hm.clickonlegalsubmenuselection("Terms Of Use");
//	   log.info("User is on the Terms Of Use");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Terms_Of_Use");
	   
	   

}
	//2
	@Test
	public void HamburgerMenu_Holidays_Functionality() throws IOException
	{
	
	   String expectedTitle = "Neckermann Travel | Home Page";   	
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
       log.info("Home page is open");
       
       HomePOMClass hm=new HomePOMClass(driver);
       hm.clcikonHamburgermenu();
       log.info("click on the hamburger menu");
//       ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");
       
       
     //selection of menus-->Holidays,Company, Legal
       hm.clickonmenufromhamburgerm("Holidays");
       log.info("click on the Holidays menu");
      
       hm.clickonholidaytbsubmenuselection("Egypt");
//       ScreenshotClass.takeScreenshot(driver, "clickontheegyptdestination");
//       String expectedTitle1 = "https://dev.neckermanntravel.co.uk/destinations/egypt/";   	
//	   String actualTitle1 = 
			  System.out.println(driver.getTitle());
//       Assert.assertEquals(actualTitle1, expectedTitle1);
	   log.info("User is on the egypt destination");
	   
	   //**********NEED TO ADD ASSERTION -->Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Cyprus");
	   log.info("User is on the Cyprus destination");
	   ScreenshotClass.takeScreenshot(driver, "Destination_Cyprus");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Greece");
	   log.info("User is on the Greece destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Greece");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Turkey");
	   log.info("User is on the Turkey destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Turkey");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("UAE");
	   log.info("User is on the UAE destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_UAE");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Spain");
	   log.info("User is on the Spain destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Spain");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Portugal");
	   log.info("User is on the Portugal destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Portugal");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Balearics");
	   log.info("User is on the Balearics destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Balearics");
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Holidays");
	   hm.clickonholidaytbsubmenuselection("Canary islands");
	   log.info("User is on the Canary islands destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Canary_islands");
	   
	   
//	   selection of menus-->Company
//	   
//	   hm.clcikonHamburgermenu();
//	   hm.clickonmenufromhamburgerm("Company");
//	   hm.clickoncompanysubmenuselection("Contact Us");
//	   log.info("User is on the Contact Us");
//	   ScreenshotClass.takeScreenshot(driver, "Company_Contact_Us");
	   
	}
	
	
//	3
	@Test
	public void HamburgerMenu_Legal_Functionality1() throws IOException, InterruptedException
	{
	
	   String expectedTitle = "Neckermann Travel | Home Page";   	
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
       log.info("Home page is open");
    
    HomePOMClass hm=new HomePOMClass(driver);
    hm.clcikonHamburgermenu();
    log.info("click on the hamburger menu");
    //ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");
	
   //selection of menus-->Legal(Booking Conditions,Privacy Policy,Cookie Policy,Terms Of Use)
	   hm.clickonmenufromhamburgerm("Legal");
//	   Thread.sleep(1000);
	   hm.clickonlegalsubmenuselection("Booking Conditions");
	   log.info("User is on the Booking Conditions");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Booking_Conditions");
	
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Legal");
	   hm.clickonlegalsubmenuselection("Privacy Policy");
	   log.info("User is on the Privacy Policy");
//	   ScreenshotClass.takeScresenshot(driver, "Legal_Privacy_Policy");
//	   Thread.sleep(1000);
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Legal");
	   hm.clickonlegalsubmenuselection("Cookie Policy");
	   log.info("User is on the Cookie Policy");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Cookie_Policy");
//	   Thread.sleep(1000);
	   
	   hm.clcikonHamburgermenu();
	   hm.clickonmenufromhamburgerm("Legal");
	   hm.clickonlegalsubmenuselection("Terms Of Use");
	   log.info("User is on the Terms Of Use");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Terms_Of_Use");
//	   Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	

}
