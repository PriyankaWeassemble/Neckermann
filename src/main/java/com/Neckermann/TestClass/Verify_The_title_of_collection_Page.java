package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.CollectionPOMClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_title_of_collection_Page extends TestBaseClass{

		@Test(dataProvider="getData")
		public void check_title_ofcollection(String collection,String collectionheading) throws IOException, InterruptedException {

			HomePOMClass hm = new HomePOMClass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,2900)");
			Thread.sleep(2000);

			hm.clickonallcollections(collection);

			Thread.sleep(2000);
			// assertions need to be add

			CollectionPOMClass cm = new CollectionPOMClass(driver);
			   Properties prop=new Properties();
		   	   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
			   prop.load(ip);

			
			String expectedTitle = prop.getProperty(collectionheading);
			String actual2 = cm.gettextfromTitleofcollection();
			Assert.assertEquals(actual2, expectedTitle);
			log.info("Title of the collection is correct");
			
					
					
		}
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[6][2];
			
			data[0][0]="Luxury";
			data[0][1]="luxryTitle";
					
			data[1][0]="Golf and Sports";
			data[1][1]="Golf&sportTitle";
			
			data[2][0]="Family Getaway";
			data[2][1]="FamilygatewayTitle";
					
			data[3][0]="City Breaks";
			data[3][1]="citybreaksTitle";
					
			data[4][0]="All Inclusive";
			data[4][1]="allinclusiveTitle";
					
			data[5][0]="Adults Only";
			data[5][1]="adultsonlyTitle";
					
			return data;
			
			
		}	

}
