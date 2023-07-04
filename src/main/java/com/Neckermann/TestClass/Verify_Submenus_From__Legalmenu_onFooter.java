package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_Submenus_From__Legalmenu_onFooter extends TestBaseClass{
	@Test
	public void Footer_Legal_Functionality() throws InterruptedException

	{	//NEED TO ADD ASSERTIONS
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
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
}
