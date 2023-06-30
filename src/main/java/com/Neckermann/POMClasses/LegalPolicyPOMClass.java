package com.Neckermann.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LegalPolicyPOMClass {
	WebDriver driver;
	public LegalPolicyPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
//	Container menu in policies[Booking Conditions,Privacy Policy,Cookie Policy,Terms Of Use]
	
	@FindBy(xpath="//div[@class='Cms_sideNavChild__CBFbq']/a")
    private List<WebElement> containermenuofpolicies;
	
	public void clickoncontainermenuofpolicies(String z)
	{
		for(int i=0;i<containermenuofpolicies.size();i++)
			{
				if(containermenuofpolicies.get(i).getText().contains(z))
				{
					containermenuofpolicies.get(i).click();
					break;
	}
			}
	}
	
	//terms of use click from container
	@FindBy(xpath="//a[text()='Terms of use']")
	private WebElement clickontremsofuse;
	
	public void clickontremsofuse()
	{
		clickontremsofuse.click();
	}
	
	
	//for checking the visiblity of the newsletter
	@FindBy(xpath="//div[@class='newsletter_section_gallery__eKeHL']")
	private WebElement Newsletteronaboutus;
	
	public boolean visiblityofnewsletter()
	{
		boolean x=Newsletteronaboutus.isDisplayed();
		return x;
	}
	
	
//for checking the visiblity of the footer
	
	@FindBy(xpath="//footer[@class='footer_section_container__PyfBS']")
	private WebElement footeraboutus;
	
	public boolean visiblityoffooteraboutus()
	{
		boolean y=footeraboutus.isDisplayed();
		return y;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	//******************Privacy Policy Element***************************//
	@FindBy(xpath="")
	private WebElement instagram;
	
	public void clickoninstagram()
	{
		
		instagram.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
