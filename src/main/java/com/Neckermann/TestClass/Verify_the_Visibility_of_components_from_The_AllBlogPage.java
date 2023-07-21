package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.AllBlogPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_the_Visibility_of_components_from_The_AllBlogPage extends TestBaseClass{
	
	@Test //Verify_the_Visibility_of_components_from_The_AllBlogPage
	public void ClickOn_the_seeallblogs_fromthe_homepage() throws InterruptedException, IOException {
		
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
           
            boolean actual = abp.visiblityofNewsletter_Component_allblogpage();
			boolean expected = true;
			Assert.assertEquals(actual, expected);
			log.info("Newsletter component is visible on the All blog page");
			
			    boolean actual1 = abp.visiblityoffooter_element_container();
				boolean expected1 = true;
				Assert.assertEquals(actual1, expected1);
				log.info("footer component is visible on the All blog page");
				
				    boolean actual2 = abp.visiblityofHeader_element_container();
					boolean expected2 = true;
					Assert.assertEquals(actual2, expected2);
					log.info("Header component is visible on the All blog page");
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
