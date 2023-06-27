package com.Neckermann.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestinationsPOMClass {
	
	WebDriver driver;
	public DestinationsPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//search widget component
	
	@FindBy(xpath="//div[@class='search-widget-root_containerBackgroundBlue__o0aRn']")
	private WebElement searchwidgetcomponent;
	
	public boolean visiblityofsearchwidgetcomponent()
	{
		
		boolean d=searchwidgetcomponent.isDisplayed();
        return d;
		
	}
	
	//braedcrumb component
	
	@FindBy(xpath="//section[@class='breadcrumbs_section__22M_e']")
	private WebElement braedcrumb_component;
	
	public boolean visiblityofbraedcrumb_component()
	{
		
		boolean d=braedcrumb_component.isDisplayed();
        return d;
		
	}
	
	//Destinations from the breadcrumb
	
	@FindBy(xpath="//a[text()='Destinations']")
	private WebElement destinationfrombreadcrumb;
	
	public void clickondestinationfrombreadcrumb()
	{
		destinationfrombreadcrumb.click();
	}
	
	//Home from the breadcrumb
	
	@FindBy(xpath="//a[text()='home']")
	private WebElement Homefrombreadcrumb;
	
	public void clickonHomefrombreadcrumb()
	{
		Homefrombreadcrumb.click();
	}
	
	
	//select the submenus -->Travel guide, Holidays,Things to do
	@FindBy (xpath="//ul[@class='destinationTabs_tabs__8mlEU']/li")
	private List<WebElement> submenusfromdestination;
	
	public void clickonsubmenusfromdestination(String z)
	{
		for(int i=0;i<submenusfromdestination.size();i++)
			{
				if(submenusfromdestination.get(i).getText().contains(z))
				{
					submenusfromdestination.get(i).click();
					break;
	}
			}
	}

	//Title of the destination
	
	@FindBy(xpath="//h1[@class='destinationTabs_title__sOW_9']")
	private WebElement Titleofdestination;
	
	public String gettextfromTitleofdestination()
	{
	    String a=Titleofdestination.getText();
	    return a;
	}
	
	//more destination section
	
			@FindBy(xpath="(//section[@class='holidays_right_section__geObw'])[1]")
			private WebElement moredestsection;
			
			public boolean visiblityofmoredestsection()
			{
				
				boolean d=moredestsection.isDisplayed();
		        return d;
				
			}
	
	
       	//select one component from the more destination
	
	@FindBy(xpath="(//div[@class='holidays_collection__UK_tn'])[1]") //change the index number(2,3)
					private WebElement componentfrommoredestination;
					
					public void clickoncomponentfrommoredestination()
					{
						componentfrommoredestination.click();
					}
				
		//Social media (instagram, linkdin, twitter,facebook)
				
					@FindBy(xpath="(//a[@rel='nofollow noreferrer'])[1]")
					private WebElement instagram;
					
					public void clickoninstagram()
					{
						
						instagram.click();
						
					}
					
					@FindBy(xpath="(//a[@rel='nofollow noreferrer'])[2]")
					private WebElement linkdin;
					
					public void clickonlinkdin()
					{
						
						linkdin.click();
						
					}	
					
					@FindBy(xpath="(//a[@rel='nofollow noreferrer'])[3]")
					private WebElement twitter;
					
					public void clickontwitter()
					{
						
						twitter.click();
						
					}
					
					@FindBy(xpath="(//a[@rel='nofollow noreferrer'])[4]")
					private WebElement facebook;
					
					public void clickonfacebook()
					{
						
						facebook.click();
						
					}
					
		//view more button on destination
					@FindBy(xpath="(//a[text()='view more'])[1]")
					private WebElement viewmorebutton;
					
					public void clickonviewmorebutton()
					{
						
						viewmorebutton.click();
						
					}	
					
		//	View button for individual hotel
						
							@FindBy(xpath="(//a[@class='featuredHotels_view__xiD2O'])[1]")// for 2nd & 3rd use index(2,3)
							private WebElement viewbuttonforindividualhotel;
							
							public void clickonviewbuttonforindividualhotel()
							{
								
								viewbuttonforindividualhotel.click();
								
							}	
			
					//breadcrumb click on destination
								
								@FindBy(xpath="//a[@class='breadcrumb_breadcrumb__Mzla3']//span[text()='Egypt']")
							private WebElement destinationfrombreadcrumb1;
							
							public void clickondestinationfrombreadcrumb1()
							{
								
								destinationfrombreadcrumb1.click();
								
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
					
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
}
