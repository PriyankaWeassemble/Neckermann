package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AllBlogPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_whether_the_user_should_selectthe_Back_arrow_fromThe_pagination_on_the_AllBlogPage extends TestBaseClass{

	@Test
	public void Verify_whether_the_user_should_selectthe_Back_arrow_fromThe_pagination_on_the_AllBlogPage1() throws InterruptedException, IOException {
		
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
           js.executeScript("window.scroll(0,7000)");
   	       Thread.sleep(2000);
	       abp.clickonpaginationnumber("2");
	       Thread.sleep(2000);
	       js.executeScript("window.scroll(0,7000)");
	       Thread.sleep(2000);
   	       abp.clickonpaginationbackarrow();   
	   	   Thread.sleep(2000);
	       js.executeScript("window.scroll(0,7000)");
	       Thread.sleep(2000);
	        boolean actual = abp.visibilityofbackarrow();
			boolean expected = false;
			Assert.assertEquals(actual, expected);
			log.info("back arrow functionality is pass");
	       
	       
	}
}
