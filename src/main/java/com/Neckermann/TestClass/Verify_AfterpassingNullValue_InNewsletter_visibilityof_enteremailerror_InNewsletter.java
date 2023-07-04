package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_AfterpassingNullValue_InNewsletter_visibilityof_enteremailerror_InNewsletter extends TestBaseClass {


	@Test
	public void Newsletter_Homepage_Negativetestcase3_Functionality() throws InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		boolean expectedTitle1 = hm.visiblityofNewsletter_Component_homepage();
		boolean actualTitle1 = true;
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("Newsletter component is visible on the home page");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5100)");
		Thread.sleep(2000);

		hm.clcikonsignup_newsletter();
		log.info("signup button clicked");

//           String expectedmsg ="User subscribed to the newsletter, please check your email";   	
//		   String actualmsg = hm.getmessagefromthetoast();
//		   if(expectedmsg.equals(actualmsg))
//           Thread.sleep(1000);

		boolean expectedTitle2 = hm.visiblityofemailisrequired_error_message();
		boolean actualTitle2 = true;
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("test case is pass ");

		
	}

}
