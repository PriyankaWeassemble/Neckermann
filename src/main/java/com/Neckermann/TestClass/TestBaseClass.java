package com.Neckermann.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Neckerman.UtilityClass.ScreenshotClass;
import com.Neckermann.POMClasses.HomePOMClass;

public class TestBaseClass {
	

	
	
	   Logger log= Logger.getLogger("Neckermann");
	   WebDriver driver;
	   
	   
//	    @Parameters("browserName")
		@BeforeMethod
		public void setUp() throws IOException
		{
//			if(browserName.equals("chrome"))
//			{
	    	ChromeOptions opt=new ChromeOptions();
	    	opt.addArguments("--remote-allow-origins=*");
	    	
//			    System.setProperty("webdriver.chrome.driver", 
//						"./Drivers\\chromedriver.exe");
	            driver = new ChromeDriver(opt);
			
//			else
//			{
//				System.setProperty("webdriver.gecko.driver", 
//						"./Drivers\\geckodriver.exe");
//				driver = new FirefoxDriver();
//			}

			PropertyConfigurator.configure("log4j.properties");			
			log.info("Browser is opened");
			
			
			driver.manage().window().maximize();
			log.info("Browser is maximized");
			
			driver.get("https://staging.neckermanntravel.co.uk/");
			log.info("URL is opened");
			
//			ScreenshotClass.takeScreenshot(driver,"cookiepageopen");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			HomePOMClass hm= new HomePOMClass(driver);
			hm.acceptcookiepolicy();
//			ScreenshotClass.takeScreenshot(driver,"Homepage");
			log.info("cookie policy accepted");
			}
		
		
		@AfterMethod
		public void tearDown() 
		{

			driver.quit();
			System.out.println("browser is closed");
			
		}

	}



