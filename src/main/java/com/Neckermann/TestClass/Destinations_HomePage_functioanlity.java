package com.Neckermann.TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Destinations_HomePage_functioanlity extends TestBaseClass {
	@Test
	public void Destinations_HomePage_functioanlity() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1900)");
		Thread.sleep(1000);

		// Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(500);
		log.info("click the destination Egypt from the home page");

	}

}
