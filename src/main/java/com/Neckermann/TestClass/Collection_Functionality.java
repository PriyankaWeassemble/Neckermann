package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Collection_Functionality extends TestBaseClass {

	// 1. Visiblity of collection on home and in collection page -->header,Serach
	// widget,footer,Newsletter

	@Test(enabled = false)
	public void Homepage_collection_visibilityofcomponents() throws IOException, InterruptedException {
		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Home page is open");

		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		boolean actual = hm.visibilityofcollectiononhomepage();
		;
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		log.info("collection component is visible on the destination");

		hm.clickonparticularcollection();
		Thread.sleep(4000);
		// assertion

		CollectionPOMClass cm = new CollectionPOMClass(driver);

		boolean actual1 = cm.visibilityofheaderoncollection();
		boolean expected1 = true;
		Assert.assertEquals(actual1, expected1);
		log.info("Header from the collection component is visible ");

		boolean actual2 = cm.visiblityofsearchwidgetcomponentoncollection();
		boolean expected2 = true;
		Assert.assertEquals(actual2, expected2);
		log.info("Search widget from the collection component is visible ");

		boolean actual3 = cm.visiblityofbraedcrumb_component();
		boolean expected3 = true;
		Assert.assertEquals(actual3, expected3);
		log.info("Breadcrumb from the collection component is visible ");

		boolean actual4 = cm.visiblityofnewsletter();
		boolean expected4 = true;
		Assert.assertEquals(actual4, expected4);
		log.info("Newsletter from the collection component is visible ");

		boolean actual5 = cm.visiblityoffooter();
		boolean expected5 = true;
		Assert.assertEquals(actual5, expected5);
		log.info("footer from the collection component is visible ");

		log.info("Test case is Pass");

	}

	// 2. click on collections from hamburger
	@Test(enabled = false)
	public void clickon_collections_from_hamburger() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		// assertion

		CollectionPOMClass cm = new CollectionPOMClass(driver);
		cm.clickoncollectionfrombreadcrumb();
		Thread.sleep(1000);

		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("click on the collections from hamburgermenu");

	}

	// 3. click on Home from hamburger
	@Test(enabled = false)
	public void clickon_Home_from_hamburger() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		// assertion

		CollectionPOMClass cm = new CollectionPOMClass(driver);
		cm.clickonHomefrombreadcrumb();
		Thread.sleep(1000);

		String expectedTitle = "Neckermann Travel | Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("click on the collections from hamburgermenu");

	}

	// 4. click on Home from hamburger
	@Test(enabled = false)
	public void check_title_ofcollection() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		// assertion

		CollectionPOMClass cm = new CollectionPOMClass(driver);

		String actual2 = cm.gettextfromTitleofcollection();
		String expected2 = "Luxury";
		Assert.assertEquals(actual2, expected2);
		log.info("Title of the collection is correct");

	}

	// 5. click on more collection from the collection page
	@Test(enabled = false)
	public void clickoncomponentfrommorecollection() throws IOException, InterruptedException {

		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		CollectionPOMClass cm = new CollectionPOMClass(driver);
		hm.clickonparticularcollection();
		Thread.sleep(2000);

		cm.clickoncomponentfrommorecollection();

	}

	// 6. ****instagram****
	@Test(enabled = false)
	public void socialmedia_instagram_Functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		cm.clickoninstagram();
		Thread.sleep(1000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));
		String expectedTitle2 = "Instagram";
		String actualTitle2 = driver.getTitle();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("Neckermann Instagram is open");
	}

	// 7.****facebook****
	@Test(enabled = false)
	public void socialmedia_facebook_Functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		cm.clickonfacebook();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle3 = "Facebook – log in or sign up";
		String actualTitle3 = driver.getTitle();
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("Neckermann facebook is open");

	}

	// 8.****twitter****
	@Test(enabled = false)
	public void socialmedia_twitter_Functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		cm.clickontwitter();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle4 = "Explore / Twitter";
		String actualTitle4 = driver.getTitle();
		Assert.assertEquals(actualTitle4, expectedTitle4);
		log.info("twitter is open");

	}

	// 9. *****linkdin*****
	@Test(enabled = false)
	public void socialmedia_linkdin_Functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,900)");
		Thread.sleep(2000);

		cm.clickonlinkdin();
		Thread.sleep(3000);
		List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpageaddress.get(1));

		String expectedTitle5 = "LinkedIn: Log In or Sign Up";
		String actualTitle5 = driver.getTitle();
		Assert.assertEquals(actualTitle5, expectedTitle5);
		log.info("linkdin is open");

	}

	// 10. View more button on destination

	@Test(enabled = false)
	public void clickon_Viewmore_button() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		cm.clickonviewbuttonforindividualhotel();
		Thread.sleep(2000);

	}

	// 11.
	@Test(enabled = false)
	public void clickon_View_button() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		cm.clickonviewbuttonforindividualhotel();
		Thread.sleep(2000);

	}

	// 12. Read more and read less functionality
	@Test
	public void Readmore_Readless_functionality() throws InterruptedException {
		HomePOMClass hm = new HomePOMClass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2900)");
		Thread.sleep(2000);

		hm.clickonparticularcollection();
		Thread.sleep(2000);
		CollectionPOMClass cm = new CollectionPOMClass(driver);

		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);

		cm.clickonreadmore();
		log.info("read more button clicked");
		Thread.sleep(1000);
		cm.clickonreadless();
		log.info("read less button clicked");
		Thread.sleep(1000);

	}

}
