package com.Neckermann.TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class VerifyWhether_whenuserenters_invalidendpoint_unautorized_Pageshpould_Open {

	@Test
	public void unauthorizedpage_functionality() throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://staging.neckermanntravel.co.uk/fbf");

		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement cookieelement = driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
		cookieelement.click();
		Thread.sleep(1000);

		WebElement containerofpagenotfound = driver
				.findElement(By.xpath("//div[@class='PageNotFound_container__afuyD']"));
		if (containerofpagenotfound.isDisplayed() == true) {
			System.out.println("404 page is open");
			System.out.println("test case pass");
		}

		else
			System.out.println("test case fail");

		driver.quit();
		System.out.println("browser is closed");

	}

}
