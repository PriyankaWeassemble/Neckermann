package com.Neckermann.TestClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.DestinationsPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;
import com.Neckermann.POMClasses.ThingstoDoPOMClass;

public class Things_To_do_Functionality extends TestBaseClass{
	
	//1.
	@Test(enabled=false)
	public void visibilityofcomponents_onthingstodothrows() throws InterruptedException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       dm.clickonsubmenusfromdestination("Holidays");
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       boolean actual=tm.visiblityofsearchwidgetcomponent();
		   boolean expected=true;
		   Assert.assertEquals(actual, expected);
		   log.info("search widget is visible on the destination");
		   
		   boolean actual1=tm.visiblityofbraedcrumb_component();
		   boolean expected1=true;
		   Assert.assertEquals(actual1, expected1);
		   log.info("bread crumb is visible on the destination");
		   
		   boolean actual2=tm.visiblityofheadercomponentcomponent();
		   boolean expected2=true;
		   Assert.assertEquals(actual2, expected2);
		   log.info("header component is visible on the destination");
		   
		   boolean actual3=tm.visiblityofnewsletter();
		   boolean expected3=true;
		   Assert.assertEquals(actual3, expected3);
		   log.info("Newsletter component is visible on the destination");
	}
	
//2.	contents click on things to do 
	@Test(enabled=false)
	public void clickontheContent() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       dm.clickonsubmenusfromdestination("Holidays");
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,500)");
           Thread.sleep(2000);
	       
           tm.clickAllclickonsubmenusfromdestination();//click on the all content 
	       
	}

//	 social media
	
	//3.****instagram****
	@Test(enabled=false)
	public void clickoninstagram() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);

	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,500)");
           Thread.sleep(1000);
	       
           tm.clickoninstagram();
		   Thread.sleep(1000);
           List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
		   String expectedTitle2 ="Instagram";   	//Instapaper
		   String actualTitle2 = driver.getTitle();
		   Assert.assertEquals(actualTitle2, expectedTitle2);
           log.info("Neckermann Instagram is open");
           
	       
	}

	//4.****facebook*****
	@Test(enabled=false)
	public void clickonfacebook() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,500)");
           Thread.sleep(1000);
	       
           tm.clickonfacebook();
		   Thread.sleep(3000);
		   List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
           
		   String expectedTitle3 ="Facebook – log in or sign up";   	//Facebook
		   String actualTitle3 = driver.getTitle();
		   Assert.assertEquals(actualTitle3, expectedTitle3);
		   log.info("Neckermann facebook is open");	
	       
	}
	//5.****twitter******
	@Test(enabled=false)
	public void clickontwitter() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
//	       dm.clickonsubmenusfromdestination("Holidays");
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,500)");
           Thread.sleep(1000);
	       
           tm.clickontwitter();
           Thread.sleep(3000);
		   List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
           
           String expectedTitle4 ="Explore / Twitter";   	//Twitter
		   String actualTitle4 = driver.getTitle();
		   Assert.assertEquals(actualTitle4, expectedTitle4);
		   log.info("twitter is open");	
	       
	}
	
	//6.*****linkdin*****
	@Test(enabled=false)
	public void clickonlinkdin() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(2000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(2000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,500)");
           Thread.sleep(1000);
	       
           tm.clickonlinkdin();
           Thread.sleep(3000);
		   List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(allpageaddress.get(1));
           
           String expectedTitle5 ="LinkedIn: Log In or Sign Up";   	//LinkedIn Login, Sign in | LinkedIn
		   String actualTitle5 = driver.getTitle();
		   Assert.assertEquals(actualTitle5, expectedTitle5);
		   log.info("linkdin is open");
	       
	}
	
	//7. click on the "see all " button from the things to do page 
	@Test(enabled=false)
	public void clickonseeallbutton_functionality() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(1000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(1000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,1500)");
           Thread.sleep(1000);
	       
            tm.clickonseeall();
           String expectedTitle5 ="Blogs | NeckermannTravel";   	//LinkedIn Login, Sign in | LinkedIn
		   String actualTitle5 = driver.getTitle();
		   Assert.assertEquals(actualTitle5, expectedTitle5);
		   log.info("see all button is clicked");
	       
	}
	
	
	//8. click on the individual blog
	@Test(enabled=false)
	public void clickonindivisualblog_functionality() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(1000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(1000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,1500)");
           Thread.sleep(1000);
	       
            tm.clickonindividualblog();
           String expectedTitle5 ="Benefits for booking your summer holiday in January | Blogs | NeckermannTravel";   	//LinkedIn Login, Sign in | LinkedIn
		   String actualTitle5 = driver.getTitle();
		   Assert.assertEquals(actualTitle5, expectedTitle5);
		   log.info("see all button is clicked");
	       
	}
	
	//9. click on all the blogs
	@Test 
	public void clickonalltheindivisualblog_functionality() throws InterruptedException, IOException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");

		   HomePOMClass hm= new HomePOMClass(driver);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,1800)");
           Thread.sleep(1000);
		   
           //(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
		   hm.clickonalldestinationsfromhomepage("Egypt");
		   Thread.sleep(1000);  
		   
		   DestinationsPOMClass dm=new DestinationsPOMClass(driver);
	       dm.clickonsubmenusfromdestination("Things to do");
	       log.info("click on the things to do tab");
	       Thread.sleep(500);
	       
	       ThingstoDoPOMClass tm=new ThingstoDoPOMClass(driver);
	       
	       js.executeScript("window.scroll(0,1500)");
           Thread.sleep(1000);
	       
            tm.clickonallindividualblog();
           
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
