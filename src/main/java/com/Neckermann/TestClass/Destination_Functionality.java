package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Destination_Functionality extends TestBaseClass {

	private String expectedTitle2;

	// 1

	@Test(enabled = false)
	public void Homepage_Destination_click_Visibility() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

	}

	// 2

	@Test(enabled = false)
	public void Destination_searchwidget_Breadcrumb_moredestination_visibility() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);

		boolean actual = dm.visiblityofsearchwidgetcomponent();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		log.info("search widget is visible on the destination");

		boolean actual1 = dm.visiblityofbraedcrumb_component();
		boolean expected1 = true;
		Assert.assertEquals(actual1, expected1);
		log.info("bread crumb is visible on the destination");

		boolean actual2 = dm.visiblityofmoredestsection();
		boolean expected2 = true;
		Assert.assertEquals(actual2, expected2);
		log.info("search widget is visible on the destination");

	}

	// 3
	@Test(enabled = false)
	public void clickdestinationfrommoredestination() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickoncomponentfrommoredestination();
		Thread.sleep(2000);
		// assertion

	}

	// 4
//	, Holidays,
	@Test(enabled = false)
	public void clickonthingstodo() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Things to do");
		log.info("click on the things to do tab");
		Thread.sleep(500);
		dm.clickonsubmenusfromdestination("Holidays");

	}

	// 5
	@Test(enabled = false)
	public void clickontravelguide() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickonsubmenusfromdestination("Travel guide");
		Thread.sleep(2000);

	}

	// 6
	@Test(enabled = false)
	public void breadcrumb_clicking_functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		dm.clickondestinationfrombreadcrumb();
		Thread.sleep(500);
		log.info("click on the destinations tab from the breadcrumb");

		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(500);

		log.info("again click on the destination");
		dm.clickonHomefrombreadcrumb();
		Thread.sleep(500);
		log.info("click on the destinations tab from the breadcrumb");

	}

	// 7
	@Test(enabled = false)
	public void socialmedia_instagram_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//         ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);

		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);

		// 1.****instagram****

		dm.clickoninstagram();
		Thread.sleep(1000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));
		String expectedTitle2 = "Instagram";
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Neckermann Instagram is open");
	}

	// 8
	@Test(enabled = false)
	public void socialmedia_Facebook_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//                ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);

		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);

		// 2.****facebook****
		dm.clickonfacebook();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle3 = "Facebook – log in or sign up";
		String actualTitle3 = driver.getTitle();
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("Neckermann facebook is open");

	}

	// 9
	@Test(enabled = false)
	public void socialmedia_twitter_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//                   ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);

		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);

		// 3.****twitter****

		dm.clickontwitter();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle4 = "Explore / Twitter";
		String actualTitle4 = driver.getTitle();
		Assert.assertEquals(actualTitle4, expectedTitle4);
		log.info("twitter is open");

	}

	// 10

	@Test(enabled = false)
	public void socialmedia_linkdin_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");
//                  ScreenshotClass.takeScreenshot(driver, "Home_PAGE");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);

		DestinationsPOMClass dm = new DestinationsPOMClass(driver);

		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
//          4. *****linkdin*****
		dm.clickonlinkdin();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle5 = "LinkedIn: Log In or Sign Up";
		String actualTitle5 = driver.getTitle();
		Assert.assertEquals(actualTitle5, expectedTitle5);
		log.info("linkdin is open");

	}

	// 11 View more button on destination
	@Test(enabled = false)
	public void viewmorw_button_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		dm.clickonviewmorebutton();
		Thread.sleep(1000);
		dm.clickondestinationfrombreadcrumb1();
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);
		dm.clickonviewbuttonforindividualhotel();

	}

	// 12. View button on destination from the individual hotel

	@Test(enabled = false)
	public void view_button_Functionality() throws InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1800)");
		Thread.sleep(2000);

		// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		hm.clickonalldestinationsfromhomepage("Egypt");
		Thread.sleep(2000);
		DestinationsPOMClass dm = new DestinationsPOMClass(driver);
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		dm.clickonviewbuttonforindividualhotel();
		Thread.sleep(1000);
	}

	// travel guide
	// things to do

}
