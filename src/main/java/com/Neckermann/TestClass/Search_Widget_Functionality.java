package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Search_Widget_Functionality extends TestBaseClass{
	
	@Test  
	public void name() throws InterruptedException 
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
           
           HomePOMClass hm=new HomePOMClass(driver);
           
           //*********Destination***********//
           //checking for the text from the destination field 
           
//           hm.gettextfromtextondestinationhomepagelement();
//           String expectedText = "Going to";   	
//		   String actualText =  hm.gettextfromtextondestinationhomepagelement();;
//		   Assert.assertEquals(actualText, expectedText);
//           log.info("text is correct in the destination field");
//          
//           hm.clickondestinationhomepagelement();
//           log.info("destination textbox is clicked");
//           Thread.sleep(4000);
//         
//           hm.clickonselectdestination();
//           Thread.sleep(3000);
           
//           String expectedText1 = "Larnaca";   	
//		   String actualText1 =  hm.gettextfromtextondestinationhomepagelement();;
//		   Assert.assertEquals(actualText1, expectedText1);
//           log.info("destination selected");
           
           //departure airport(birmingham, bournemouth,bristol,cardiff,edinburgh,gatwick,glasgow international,heathrow,leeds bradford, liverpool,
//           london - all airports,luton, manchester,newcastle,stansted)
           
           hm.clickondepartureAirportonhomepagelement();
           Thread.sleep(4000);
           log.info("DA is clicked");
           hm.clickonAirportofdepartureAirport("luton");
           Thread.sleep(2000);
           log.info("sub DA  is clicked");
           
           String expectedText1 ="luton";   	
		   String actualText1 = hm.getattributevalue();
		   Assert.assertEquals(actualText1, expectedText1);
		   
		   log.info("departure Airport selected-->test case pass");
           
           
           
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
