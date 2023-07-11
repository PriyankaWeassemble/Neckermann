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

	public TravelGuidePOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// link "Egypt tourism website"

	@FindBy(xpath = "(//a[@target='_blank'])[1]")
	private WebElement tourist_information_link;

	public void clickontourist_information_link() {

		tourist_information_link.click();

	}

	// link "visa health link"

	@FindBy(xpath = "(//a[@target='_blank'])[2]")
	private WebElement visa_health_link;

	public void clickonvisa_health_link() {

		visa_health_link.click();

	}

	// *****more travel guide links
	// [Cyprus, Greece, Spain,Balearic Island,Portugal, Canary Islands, United Arab
	// Emirates, Turkey, Egypt]

	@FindBy(xpath = "//a[@target='_blank']") // 3 to10
	private List<WebElement> allmorelinks;

	public void clickonallmorelinks(String z) {
		for (int i = 0; i < allmorelinks.size(); i++) {
			if (allmorelinks.get(i).getText().contains(z)) {
				allmorelinks.get(i).click();
				break;
			}
		}
	}

	// 4. FCDO link click
	@FindBy(xpath = "//a[text()='FCDO website']")
	private WebElement FCDO_link;

	public void Click_FCDO_link() {

		FCDO_link.click();
	}
		
	//FAQ's selection
	
	@FindBy(xpath = "//section[@class='accordion_accordion__3bhlH']/div") // 3 to10
	private List<WebElement> FAQ_min_and_Max;

	public void FAQ_min_and_Max() {
		for (int i = 0; i < FAQ_min_and_Max.size(); i++) {
			{
				FAQ_min_and_Max.get(i).click();
			
			}
		}
	}
		
	@FindBy(xpath = "//a[text()='view']")
	private List<WebElement> View_button;

	public void clickonView_button() throws InterruptedException {
		for (int i = 0; i < View_button.size(); i++) {
			{
				View_button.get(i).click();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,2900)");
				Thread.sleep(2000);
			
			}
		}
	}
	
	//your guide to widget
	
	@FindBy(xpath = "//li[text()='Food & Drinks']")
	private WebElement FoodandDrink;

	public void Click_FoodandDrink() {

		FoodandDrink.click();
	}
	
	@FindBy(xpath = "//li[text()='Beaches']")
	private WebElement Beaches;

	public void Click_Beaches() {

		Beaches.click();
	}
	
	@FindBy(xpath = "//li[text()='We Love']")
	private WebElement WeLove;

	public void Click_WeLove() {

		WeLove.click();
	}
	
	@FindBy(xpath = "//li[text()='At a Glance']")
	private WebElement At_a_Glance;

	public void Click_At_a_Glance() {

		At_a_Glance.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	

}
