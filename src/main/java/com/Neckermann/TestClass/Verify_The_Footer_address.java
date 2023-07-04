package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_Footer_address extends TestBaseClass{
	@Test
	public void Footer_address_Functionality() throws InterruptedException, IOException
	
	{
		      HomePOMClass hm=new HomePOMClass(driver);
		    
		       JavascriptExecutor js=(JavascriptExecutor)driver;
	           js.executeScript("window.scroll(0,6100)");
	           Thread.sleep(3000);		    
		    
	           Properties prop=new Properties();
	    	   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
	    	   prop.load(ip);

	    	
	    	   String expectedTitle = prop.getProperty("footeraddresslineone");
		       String actualTitle=hm.gettextfromfirstlineofaddress();
			   Assert.assertEquals(actualTitle, expectedTitle);
		       log.info("1st line of footer address is correct");  
		   
		       
		       String expectedTitle1 = prop.getProperty("footeraddresslinetwo");
		       String actualTitle1=hm.gettextfromsecondlineofaddress();
			   Assert.assertEquals(actualTitle1, expectedTitle1);
		       log.info("2nd line of footer address is correct"); 
		       
		       String expectedTitle2 = prop.getProperty("footeraddresslinethree");
		       String actualTitle2=hm.gettextfromthirdlineofaddress();
			   Assert.assertEquals(actualTitle2, expectedTitle2);
		       log.info("3rd line of footer address is correct");  
		       
		       String expectedTitle3 = prop.getProperty("footeraddresslinefour");
		       String actualTitle3=hm.gettextfromfourthlineofaddress();
			   Assert.assertEquals(actualTitle3, expectedTitle3);
		       log.info("4th line of footer address is correct");  
		  
		       
		       log.info("Test case is pass for the address from the footer");
		    
		    
		        
		        
		        
		       
		}

}
