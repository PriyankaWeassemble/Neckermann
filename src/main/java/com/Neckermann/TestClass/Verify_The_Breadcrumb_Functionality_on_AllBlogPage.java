package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AllBlogPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_Breadcrumb_Functionality_on_AllBlogPage extends TestBaseClass{
	@Test 
	public void Verify_The_Breadcrumb_Functionality_on_AllBlogPage1() throws InterruptedException, IOException {
		
		HomePOMClass hm = new HomePOMClass(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4500)");
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
	      
         //Home,Blog,all
           abp.clickonBreadcrumbelement("Blog");
           Thread.sleep(1000);
           String expectedText1 =prop.getProperty("blogpagetitle"); 	
		   String actualText1 =  driver.getTitle();
		   Assert.assertEquals(actualText1, expectedText1);
           log.info("User selects the blog tab from the breadcrumb");
	
           abp.clickonBreadcrumbelement("Home");
           Thread.sleep(1000);
           String expectedText2 =prop.getProperty("homepagetitle"); 	
		   String actualText2 =  driver.getTitle();
		   Assert.assertEquals(actualText2, expectedText2);
           log.info("User selects the Home tab from the breadcrumb");
	
	}
}
