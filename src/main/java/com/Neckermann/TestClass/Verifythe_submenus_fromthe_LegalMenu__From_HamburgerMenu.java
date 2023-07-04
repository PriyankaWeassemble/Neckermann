package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verifythe_submenus_fromthe_LegalMenu__From_HamburgerMenu extends TestBaseClass{
	
	@Test
	public void HamburgerMenu_Legal_Functionality1() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clcikonHamburgermenu();
		log.info("click on the hamburger menu");
		// ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");

		// selection of menus-->Legal(Booking Conditions,Privacy Policy,Cookie
		// Policy,Terms Of Use)
		hm.clickonmenufromhamburgermenu("Legal");
//	   Thread.sleep(1000);
		hm.clickonlegalsubmenuselection("Booking Conditions");
		log.info("User is on the Booking Conditions");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Booking_Conditions");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Legal");
		hm.clickonlegalsubmenuselection("Privacy Policy");
		log.info("User is on the Privacy Policy");
//	   ScreenshotClass.takeScresenshot(driver, "Legal_Privacy_Policy");
//	   Thread.sleep(1000);

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Legal");
		hm.clickonlegalsubmenuselection("Cookie Policy");
		log.info("User is on the Cookie Policy");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Cookie_Policy");
//	   Thread.sleep(1000);

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Legal");
		hm.clickonlegalsubmenuselection("Terms Of Use");
		log.info("User is on the Terms Of Use");
//	   ScreenshotClass.takeScreenshot(driver, "Legal_Terms_Of_Use");
//	   Thread.sleep(1000);
	}


}
