package com.Neckermann.TestClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_the_Mybooking_tab_Functionality extends TestBaseClass{
	@Test
	public void mybookingfunctionality() throws InterruptedException, IOException
	{
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonmybookingtab();
		Thread.sleep(2000);
		
		List<String> allpageaddress= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allpageaddress.get(1));
		
        Properties prop=new Properties();
 	    FileInputStream  ip=new FileInputStream("C:\\Users\\Priyanka Lanjekar\\git\\Neckermann\\Neckermann\\src\\main\\java\\com\\Neckermann\\TestClass\\config.properties");
 	    prop.load(ip);

 	
 	       String expectedTitle = prop.getProperty("mybookingtitle");
		   String actualTitle =  driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
           log.info("MyBooking page is open");
	}

}
