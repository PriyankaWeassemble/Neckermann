package com.Neckermann.POMClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Neckerman.UtilityClass.ScreenshotClass;

public class AtolPOMClass {
	
	private WebDriver driver;
	@FindBy(xpath="//div[@class='AtolProtected_headerParent__38ppk']")
	private WebElement headerelement;
	
	public String headerelementtitlefetch()
	{
		String x=headerelement.getText();
		return x;
	}

	public AtolPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='AtolProtected_excerptParent__JN_LN']")
	private WebElement contentbelowheading;
	
	public String contentbelowheading()
	{
		String y=contentbelowheading.getText();
		return y;
	}
	
	
	@FindBy(xpath="//button[@tabindex='0']")
	private WebElement closepopup;
	
	public void closepopup()
	{
		closepopup.click();
	}
	
	@FindBy(xpath="//button[@class='AtolProtected_readMoreBtn__V0Y_1']")
	private List<WebElement> popupofatolprotected;
	
	public void clickAllPopup() throws IOException, InterruptedException
	{
		for(int i=0; i<popupofatolprotected.size();i++)
		{
			popupofatolprotected.get(i).click();
			Thread.sleep(2000);
			ScreenshotClass.takeScreenshot(driver, "popupofATOL");
			closepopup.click();
		}
	}

	
	

}
