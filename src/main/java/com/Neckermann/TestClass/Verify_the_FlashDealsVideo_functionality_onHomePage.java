package com.Neckermann.TestClass;
import org.testng.annotations.Test;
import com.Neckermann.POMClasses.HomePOMClass;

public class Verify_the_FlashDealsVideo_functionality_onHomePage extends TestBaseClass{
	@Test
	public void FlashDealsVideo_functionality() throws InterruptedException {
		
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickonthevideo1();
		Thread.sleep(2000);
		log.info("1st video play");
//	       ScreenshotClass.takeScreenshot(driver, "1stvideostarted");
		
		hm.clickonthevideo2();
		log.info("2n video play");
		Thread.sleep(2000);
//	       ScreenshotClass.takeScreenshot(driver, "2ndvideostarted");
	}

}
