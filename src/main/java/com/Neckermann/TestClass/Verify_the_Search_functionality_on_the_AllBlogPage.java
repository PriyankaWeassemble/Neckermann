package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AllBlogPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_the_Search_functionality_on_the_AllBlogPage extends TestBaseClass {
	@Test 
	public void Verify_the_Search_functionality_on_the_AllBlogPage1() throws InterruptedException, IOException {
		
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
	      
           abp.clickonsearchbox("Turkey"); //search the blog which you want 
           Thread.sleep(1000);
           log.info("write text in the search box");
           
           abp.clickonsearchbutton();
           Thread.sleep(1000);
           log.info("search button clicked");
	
            boolean actual1 = abp.visibilityoftextaftersearch();
			boolean expected1 = true;
			Assert.assertEquals(actual1, expected1);
			log.info("Serach functionality works fine hence test case pass");
	}
}
