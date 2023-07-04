package com.Neckermann.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verifythe_CompanyMenu_ContactUs_From_HamburgerMenu extends TestBaseClass {

	// 1
	@Test
	public void HamburgerMenu_Company_Functionality() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		
//	   selection of menus-->Company
	   
	   hm.clcikonHamburgermenu();
	   Thread.sleep(1000);
	   log.info("click on the hamburger menu");
//     ScreenshotClass.takeScreenshot(driver, "clickonhamburgermenu");
	   
	   hm.clickonmenufromhamburgermenu("Company");
	   Thread.sleep(2000);
	   log.info("click on the company ");
//	   ScreenshotClass.takeScreenshot(driver, "Company_menu_click");
	   
	   hm.clickoncompanysubmenuselection();
	   Thread.sleep(2000);
	   log.info("click on the contact us page by clicking submenu from the company menu");
//	   ScreenshotClass.takeScreenshot(driver, "Company_Contact_Us");



	}


	
}
