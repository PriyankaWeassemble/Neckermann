package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_submenus_from_The_Footer_Holidays_Functionality extends TestBaseClass{
	
	@Test
	public void Footer_Holidays_Functionality() throws InterruptedException

	{
		//NEED TO ADD ASSERTIONS
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,6800)");
		Thread.sleep(1500);
		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)

		hm.clickonholidaytbsubmenusfromfooterelection("Egypt");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Cyprus");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Greece");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Turkey");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("UAE");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		
		//(//div[3]//ul[1]/li)[9]-->for particular destination on the footer
		
		hm.clickonholidaytbsubmenusfromfooterelection("Spain");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Portugal");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Balearics");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,6500)");
		Thread.sleep(1000);

		hm.clickonholidaytbsubmenusfromfooterelection("Canary islands");

	}

}
