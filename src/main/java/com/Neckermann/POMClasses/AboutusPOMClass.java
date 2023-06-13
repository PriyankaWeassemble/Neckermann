package com.Neckermann.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutusPOMClass {
	WebDriver driver;

	public AboutusPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactusonaboutus;
	
	public void clickoncontactusonaboutus()
	{
		contactusonaboutus.click();
	}
	
	@FindBy(xpath="//a[@class='ourReviews_mid_section_bottom__JTB_G']")
	private WebElement trustpiolet;
	
	public void clickontrustpiolet()
	{
		trustpiolet.click();
	}
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextarrow;
	
	public void clickonnextarrow()
	{
		nextarrow.click();
	}
	
	@FindBy(xpath="//button[text()='Previous']")
	private WebElement previousarrow;
	
	public void clickonpreviousarrow()
	{
		previousarrow.click();
	}
	
	
	
	

	

}
