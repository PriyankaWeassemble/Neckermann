package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verifythe_submenus_fromthe_HolidayMenu__From_HamburgerMenu extends TestBaseClass{

	@Test
	public void HamburgerMenu_Holidays_Functionality() throws IOException {

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clcikonHamburgermenu();
		log.info("click on the hamburger menu");
//       ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");

		// selection of menus-->Holidays,Company, Legal
		hm.clickonmenufromhamburgermenu("Holidays");
		log.info("click on the Holidays menu");

		hm.clickonholidaytbsubmenuselection("Egypt");
//       ScreenshotClass.takeScreenshot(driver, "clickontheegyptdestination");
//       String expectedTitle1 = "https://dev.neckermanntravel.co.uk/destinations/egypt/";   	
//	   String actualTitle1 = 
//		System.out.println(driver.getTitle());
//       Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("User is on the egypt destination");

		// **********NEED TO ADD ASSERTION
		// -->Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Cyprus");
		log.info("User is on the Cyprus destination");
		ScreenshotClass.takeScreenshot(driver, "Destination_Cyprus");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Greece");
		log.info("User is on the Greece destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Greece");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Turkey");
		log.info("User is on the Turkey destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Turkey");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("UAE");
		log.info("User is on the UAE destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_UAE");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Spain");
		log.info("User is on the Spain destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Spain");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Portugal");
		log.info("User is on the Portugal destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Portugal");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Balearics");
		log.info("User is on the Balearics destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Balearics");

		hm.clcikonHamburgermenu();
		hm.clickonmenufromhamburgermenu("Holidays");
		hm.clickonholidaytbsubmenuselection("Canary islands");
		log.info("User is on the Canary islands destination");
//	   ScreenshotClass.takeScreenshot(driver, "Destination_Canary_islands");


	}
}
