package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class VerifyWhether_user_select_contactus_from_hamburgermenu extends TestBaseClass {


	// 5. contact us from hamburger menu

	@Test // (enabled=false)
	public void contactusfromhamburgermenu() throws IOException, InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clcikonHamburgermenu();
		Thread.sleep(1000);

		hm.clickonmenufromhamburgermenu("Company");
		Thread.sleep(1000);
		hm.clickoncompanysubmenuselection();
		Thread.sleep(1000);

		Properties prop=new Properties();
	    FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
	    prop.load(ip);
		
		String expectedTitle1 = prop.getProperty("Contactustitle");
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("Contact Us is open");

	}

}
