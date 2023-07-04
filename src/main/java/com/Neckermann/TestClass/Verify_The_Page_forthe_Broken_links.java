package com.Neckermann.TestClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Verify_The_Page_forthe_Broken_links {
	@Test 
	public void testprogram() throws MalformedURLException, IOException
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	

WebDriver driver=new ChromeDriver(opt);
//driver.get("https://neckermanntravel.co.uk/");
//driver.get("https://dev.neckermanntravel.co.uk/blog/");
driver.get("https://staging.neckermanntravel.co.uk/");

//driver.get("https://admin:admin@weassemble.devpro.agency/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement cookie=driver.findElement(By.xpath("//button[@class='cookies_btn2__g59MH']"));
cookie.click();

//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scroll(0,4000)");
//WebElement seeallblog=driver.findElement(By.xpath("(//a[text()='see all'])[1]"));
//seeallblog.click();



//all links list
List<WebElement> linklist= driver.findElements(By.tagName("a"));
linklist.add(driver.findElement(By.tagName("img")));

System.out.println("size of full links and images --->"+linklist.size());


//find out active links
List<WebElement> activelinks =new ArrayList<WebElement>();

for(int i=0; i<linklist.size();i++)
{
	
	if(linklist.get(i).getAttribute("href")!=null)
	{
		
		activelinks.add(linklist.get(i));
	}
}

//links with the status (here we get broken links)
System.out.println("size of active links and images--->"+activelinks.size());

	for(int j=0; j<activelinks.size();j++)
	{
		HttpURLConnection conection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
	
		conection.connect();
		String response=conection.getResponseMessage();
		conection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
	}
	
	
	driver.quit();
	
	
	
	
	
	
	}
}
