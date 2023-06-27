package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Collection_Functionality extends TestBaseClass{
	
	//1. Visiblity of collection on home and in collection page -->header,Serach widget,footer,Newsletter
	
	@Test(enabled=false)   
	public void Homepage_collection_visibilityofcomponents() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           HomePOMClass hm= new HomePOMClass(driver);
        
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,2900)");
           Thread.sleep(2000);
      
           boolean actual=hm.visibilityofcollectiononhomepage();;
		   boolean expected=true;
		   Assert.assertEquals(actual, expected);
		   log.info("collection component is visible on the destination");
   		   
		   hm.clickonparticularcollection();
		   Thread.sleep(4000);
		   //assertion
		   
		   CollectionPOMClass cm=new CollectionPOMClass(driver);
		   
	       boolean actual1=cm.visibilityofheaderoncollection();
		   boolean expected1=true;
		   Assert.assertEquals(actual1, expected1);
		   log.info("Header from the collection component is visible ");
	    
		   boolean actual2=cm.visiblityofsearchwidgetcomponentoncollection();
		   boolean expected2=true;
		   Assert.assertEquals(actual2, expected2);
		   log.info("Search widget from the collection component is visible ");
		   
		   boolean actual3=cm.visiblityofbraedcrumb_component();
		   boolean expected3=true;
		   Assert.assertEquals(actual3, expected3);
		   log.info("Breadcrumb from the collection component is visible ");
		   
		   boolean actual4=cm.visiblityofnewsletter();
		   boolean expected4=true;
		   Assert.assertEquals(actual4, expected4);
		   log.info("Newsletter from the collection component is visible ");
		   
		   boolean actual5=cm.visiblityoffooter();
		   boolean expected5=true;
		   Assert.assertEquals(actual5, expected5);
		   log.info("footer from the collection component is visible ");
   		   
		   log.info("Test case is Pass");
		   
	}
	
	@Test
	public void clickoncollectionfromhamburgermenu() throws IOException, InterruptedException
	{
		   
           HomePOMClass hm= new HomePOMClass(driver);
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scroll(0,2900)");
           Thread.sleep(2000);
   		   
		   hm.clickonparticularcollection();
		   Thread.sleep(2000);
		   //assertion
		   
		   CollectionPOMClass cm=new CollectionPOMClass(driver);
		   
		   
		   
		   
	}

	
	   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}





