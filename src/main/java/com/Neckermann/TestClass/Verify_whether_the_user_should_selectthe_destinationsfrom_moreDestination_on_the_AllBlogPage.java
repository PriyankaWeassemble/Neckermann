package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AllBlogPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_the_user_should_selectthe_destinationsfrom_moreDestination_on_the_AllBlogPage extends TestBaseClass{
	@Test 
	public void Verify_whether_the_user_should_selectthe_destinationsfrom_moreDestination_on_the_AllBlogPage1() throws InterruptedException, IOException {
		
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4400)");
		Thread.sleep(3000);
		
           hm.clickonSeeAllbutton();
           Thread.sleep(1000);
           
           Properties prop=new Properties();
           FileInputStream ip =new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
           prop.load(ip);
           
           String expectedText =prop.getProperty("blogpagetitle"); 	
		   String actualText =  driver.getTitle();
		   Assert.assertEquals(actualText, expectedText);
           log.info("text is correct in the destination field");
           
           AllBlogPOMClass abp=new AllBlogPOMClass(driver);   
           abp.clickoncomponentfrommoredestination();
           Thread.sleep(1000);
           
           String expectedText1 =prop.getProperty("blogpagetitle"); 	
		   String actualText1 =  driver.getTitle();
		   Assert.assertNotEquals(actualText1, expectedText1);
           log.info("user  is directed to the destination page hense test case pass");
	}
}
