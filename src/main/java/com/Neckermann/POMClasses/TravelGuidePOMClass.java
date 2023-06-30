package com.Neckermann.POMClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelGuidePOMClass {
	
	WebDriver driver;
	public TravelGuidePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//link "Egypt tourism website"
	
	@FindBy(xpath="(//a[@target='_blank'])[1]")
	private WebElement tourist_information_link;
	
	public void clickontourist_information_link()
	{
		
		tourist_information_link.click();
		
	}
	
	
	//link "visa health link"
	
	@FindBy(xpath="(//a[@target='_blank'])[2]")
	private WebElement visa_health_link;
	
	public void clickonvisa_health_link()
	{
		
		visa_health_link.click();
		
	}
	
	//*****more travel guide links
	//[Cyprus, Greece, Spain,Balearic Island,Portugal, Canary Islands, United Arab Emirates, Turkey, Egypt]
	
	@FindBy (xpath="//a[@target='_blank']") //3 to10
	private List<WebElement> allmorelinks;
	
	public void clickonallmorelinks(String z)
	{
		for(int i=0;i<allmorelinks.size();i++)
			{
				if(allmorelinks.get(i).getText().contains(z))
				{
					allmorelinks.get(i).click();
					break;
	}
			}
	}
	
	//4. FCDO link click
	@FindBy(xpath="//a[text()='FCDO website']")
	private WebElement FCDO_link;
	
	public void Click_FCDO_link()
	{
		
		FCDO_link.click();
		
	}
	
	
	
	

}
