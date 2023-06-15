package com.Neckermann.TestClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Trust_cards_onhomepage_Functionality extends TestBaseClass{
	@Test
	public void Trust_cards_onhomepage_Functionality1() throws IOException, InterruptedException
	{
		   String expectedTitle = "Neckermann Travel | Home Page";   	
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("Home page is open");
         
           HomePOMClass hm=new HomePOMClass(driver);
           boolean expectedTitle1=hm.visiblityoftrustcard_homepage();
   		   boolean actualTitle1=true;
   		   Assert.assertEquals(actualTitle1, expectedTitle1);
   		   log.info("Trust cards are visible on the home page");
   		    
   		   
   		  
	}

}
