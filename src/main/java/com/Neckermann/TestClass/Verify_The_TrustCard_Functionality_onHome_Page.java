package com.Neckermann.TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_The_TrustCard_Functionality_onHome_Page extends TestBaseClass{
	@Test
	public void Trust_cards_onhomepage_Functionality1() throws IOException, InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		boolean expectedTitle5 = hm.visiblityoftrustcard_homepage();
		boolean actualTitle5 = true;
		Assert.assertEquals(actualTitle5, expectedTitle5);
		log.info("Trust cards are visible on the home page");
		
		//Verify the Text on the trust cards 
		
		//heading of trustcards
		   Properties prop=new Properties();
		   FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
		   prop.load(ip);
		
		String expectedTitle = prop.getProperty("trustcardfirstline");
		String actualTitle = hm.getTextfromtrustcardheading();
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Title 1st line is correct");
		
		//trust card logo's text validation
		
		String expectedTitle1 = prop.getProperty("trustcardfirstlogocontent");
		String actualTitle1 = hm.getTextfromfirststlogo();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		log.info("1st logo have correct text");
		
		String expectedTitle2 = prop.getProperty("trustcardsecondlogocontent");
		String actualTitle2 = hm.getTextfromsecondlogo();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		log.info("1st logo have correct text");
		
		String expectedTitle3 = prop.getProperty("trustcardthirdlogocontent");
		String actualTitle3 = hm.getTextfromthirdlogo();
		Assert.assertEquals(actualTitle3, expectedTitle3);
		log.info("1st logo have correct text");
		
		String expectedTitle4 = prop.getProperty("trustcardfourthlogocontent");
		String actualTitle4 = hm.getTextfromfourthlogo();
		Assert.assertEquals(actualTitle4, expectedTitle4);
		log.info("1st logo have correct text");
		
		





	}

}
