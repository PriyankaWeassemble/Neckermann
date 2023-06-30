package com.Neckermann.POMClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Neckerman.UtilityClass.ScreenshotClass;

public class ThingstoDoPOMClass {
	WebDriver driver;
	public ThingstoDoPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Header component
	@FindBy(xpath="//header[@class='header_header__cFIgN ']")
	private WebElement headercomponent;
	
	public boolean visiblityofheadercomponentcomponent()
	{
		
		boolean d=headercomponent.isDisplayed();
        return d;
		
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
	
	//content from things to do
		
		
		@FindBy (xpath="//div[@class='thingsToDoDetail_tdd_content_container__yiNPi']/ol/li")
		private List<WebElement> submenusfromdestination;
		
		public void clickAllclickonsubmenusfromdestination() throws IOException, InterruptedException
		{
			for(int i=0; i<submenusfromdestination.size();i++)
			{
				submenusfromdestination.get(i).click();
				Thread.sleep(2000);
				
			}
		}
	
	
	
		//Social media (instagram, linkdin, twitter,facebook)
		
		@FindBy(xpath="(//div[@class='thingsToDoDetail_social_icons__6zF_R']/a)[1]")
		private WebElement instagram;
		
		public void clickoninstagram()
		{
			
			instagram.click();
			
		}
		
		@FindBy(xpath="(//div[@class='thingsToDoDetail_social_icons__6zF_R']/a)[2]")
		private WebElement linkdin;
		
		public void clickonlinkdin()
		{
			
			linkdin.click();
			
		}	
		
		@FindBy(xpath="(//div[@class='thingsToDoDetail_social_icons__6zF_R']/a)[3]")
		private WebElement twitter;
		
		public void clickontwitter()
		{
			
			twitter.click();
			
		}
		
		@FindBy(xpath="(//div[@class='thingsToDoDetail_social_icons__6zF_R']/a)[4]")
		private WebElement facebook;
		
		public void clickonfacebook()
		{
			
			facebook.click();
			
		}
	
	//click on see all button
		@FindBy(xpath="(//a[text()='see all'])[1]")
		private WebElement seeall;
		
		public void clickonseeall()
		{
			
			seeall.click();
			
		}
		
		//click on the individual blog
		
				@FindBy(xpath="(//a[@class='inspirations_content_container__nRBP4'])[3]")//change the index from 1 to 6
				private WebElement individualblog;
				
				public void clickonindividualblog()
				{
					
					individualblog.click();
					
				}
	
	//click on all the individual blog
				//select the submenus -->Travel guide, Holidays,Things to do
				@FindBy (xpath="//a[@class='inspirations_content_container__nRBP4']")
				private List<WebElement> allindividualblog;
				
				public void clickonallindividualblog() throws InterruptedException
				{
					for(int i=0;i<allindividualblog.size();i++)
					{
						allindividualblog.get(i).click();
						Thread.sleep(1000);
						driver.navigate().back();
						Thread.sleep(1000);
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("window.scroll(0,1500)");
				        Thread.sleep(1000);
						}
				}
	
	
	
	
	
	
	
	
	

}
