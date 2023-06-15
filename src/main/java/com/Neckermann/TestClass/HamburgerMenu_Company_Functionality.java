package com.Neckermann.TestClass;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class HamburgerMenu_Company_Functionality extends TestBaseClass {
	@Test
	public void HamburgerMenu_Company_Functionality1() throws IOException
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
	
	
	
	
	
	
	
	
	

}
