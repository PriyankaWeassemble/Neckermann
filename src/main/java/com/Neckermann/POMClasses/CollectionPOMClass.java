package com.Neckermann.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CollectionPOMClass {
	
	WebDriver driver;
	public CollectionPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
