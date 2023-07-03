package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.LegalPolicyPOMClass;

public class Legal_policies_Functionality extends TestBaseClass {

	// 1. click on the all the policyfrom container
	@Test
	public void Privacy_Policy_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);
		hm.clcikonHamburgermenu();
		Thread.sleep(1000);

		hm.clickonmenufromhamburgerm("Legal");
		Thread.sleep(1000);
		hm.clickonlegalsubmenuselection("Booking Conditions");// Booking Conditions,Privacy Policy,Cookie Policy,Terms
																// Of Use
		Thread.sleep(1000);

		String expectedTitle1 = "Booking conditions Neckermanntravel";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("Booking conditions is open");

		LegalPolicyPOMClass lm = new LegalPolicyPOMClass(driver);

		lm.clickoncontainermenuofpolicies("Privacy Policy");
		Thread.sleep(1000);
		String expectedTitle2 = "Privacy policy Neckermanntravel";
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Privacy Policy is open");

		lm.clickoncontainermenuofpolicies("Cookie Policy");
		Thread.sleep(1000);
		String expectedTitle4 = "Cookie Policy Neckermanntravel";
		String actualTitle4 = driver.getTitle();
		Assert.assertEquals(actualTitle4, expectedTitle4);
		log.info("Cookie Policy is open");

		lm.clickontremsofuse();
		Thread.sleep(3000);
		String expectedTitle5 = "Terms of use Neckermanntravel";
		String actualTitle5 = driver.getTitle();
		Assert.assertEquals(actualTitle5, expectedTitle5);
		log.info("Terms Of Use is open");

		boolean actual4 = lm.visiblityofnewsletter();
		boolean expected4 = true;
		Assert.assertEquals(actual4, expected4);
		log.info("Newsletter from the collection component is visible ");

		boolean actual5 = lm.visiblityoffooteraboutus();
		boolean expected5 = true;
		Assert.assertEquals(actual5, expected5);
		log.info("footer from the collection component is visible ");

//         2.   
//           

	}

}
