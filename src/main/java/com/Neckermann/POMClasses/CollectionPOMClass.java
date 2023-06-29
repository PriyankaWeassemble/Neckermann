package com.Neckermann.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionPOMClass {
	
	WebDriver driver;
	public CollectionPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//header on collection
	
	@FindBy(xpath="//header[@id='header']")
	private WebElement headeroncollection;
	
	public boolean visibilityofheaderoncollection()
	{
		boolean x=headeroncollection.isDisplayed();
		return x;
	}
	
	//serach widget on collection
	
	//search widget component
	
		@FindBy(xpath="//div[@class='search-widget-root_containerBackgroundBlue__o0aRn']")
		private WebElement searchwidgetcomponentoncollection;
		
		public boolean visiblityofsearchwidgetcomponentoncollection()
		{
			
			boolean d=searchwidgetcomponentoncollection.isDisplayed();
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
	
		//collections from the breadcrumb
		
		@FindBy(xpath="//a[text()='Collections']")
		private WebElement collectionfrombreadcrumb;
		
		public void clickoncollectionfrombreadcrumb()
		{
			collectionfrombreadcrumb.click();
		}
		//Home from the breadcrumb
		
		@FindBy(xpath="//a[text()='home']")
		private WebElement Homefrombreadcrumb;
		
		public void clickonHomefrombreadcrumb()
		{
			Homefrombreadcrumb.click();
		}
		
		//Title of the collection
		
		@FindBy(xpath="//h1[@class='collectionTabs_title__zQxMQ']")
		private WebElement Titleofcollection;
		
		public String gettextfromTitleofcollection()
		{
		    String a=Titleofcollection.getText();
		    return a;
		}
		
		//Visibility of more collection
		
		@FindBy(xpath="//section[@class='collectionsHolidays_top_section__YOsrW']") //change the index number(2,3)
		private WebElement visibilityofmorecollection;
						
		public boolean visibilityofmorecollection()
		{
			
			boolean d=visibilityofmorecollection.isDisplayed();
	        return d;
			
		}
		
		//select one component from the more collection
		
		@FindBy(xpath="(//div[@class='collectionsHolidays_collection__xIALU'])[1]") //change the index number(2,3)
						private WebElement componentfrommorecollection;
						
						public void clickoncomponentfrommorecollection()
						{
							componentfrommorecollection.click();
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
						
						
			//Read more functionality
						@FindBy(xpath="(//a[@class='more'])[2]")
						private WebElement readmore;
						
						//visibility
						public boolean visiblityofreadmore()
						{
						boolean a= readmore.isDisplayed();
						return a;
						}
						
						//click function
						public void clickonreadmore()
						{
							
							readmore.click();
							
						}		
						
	   	//Read less functionality
						
						@FindBy(xpath="//a[@class='less']")
						private WebElement readless;
						
						//visibility
						
						public boolean visiblityofreadless()
						{
						boolean a= readless.isDisplayed();
						return a;
						}
						
						//click function
						
						public void clickonreadless()
						{
							
							readless.click();
							
						}
						
			//view more button on destination
						@FindBy(xpath="(//a[text()='view more'])[1]")
						private WebElement viewmorebutton;
						
						public void clickonviewmorebutton()
						{
							
							viewmorebutton.click();
							
						}	
						
			//	View button for individual hotel
							
								@FindBy(xpath="(//a[@class='featuredHotels_view__ooS4R'])[2]")// for 2nd & 3rd use index(2,3)
								private WebElement viewbuttonforindividualhotel;
								
								public void clickonviewbuttonforindividualhotel()
								{
									
									viewbuttonforindividualhotel.click();
									
								}				
					
						
						
			//for checking the visiblity of the newsletter
								@FindBy(xpath="//div[@class='newsletter_section_gallery__eKeHL']")
								private WebElement Newsletter;
								
								public boolean visiblityofnewsletter()
								{
									boolean x=Newsletter.isDisplayed();
									return x;
								}
								
								
			//for checking the visiblity of the footer
								
								@FindBy(xpath="//footer[@class='footer_section_container__PyfBS']")
								private WebElement footer;
								
								public boolean visiblityoffooter()
								{
									boolean y=footer.isDisplayed();
									return y;
								}	
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

}
