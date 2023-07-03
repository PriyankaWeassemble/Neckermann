package com.Neckermann.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutusPOMClass {
	WebDriver driver;

	public AboutusPOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactusonaboutus;

	public void clickoncontactusonaboutus() {
		contactusonaboutus.click();
	}

	@FindBy(xpath = "//a[@class='ourReviews_mid_section_bottom__JTB_G']")
	private WebElement trustpiolet;

	public void clickontrustpiolet() {
		trustpiolet.click();
	}

	// back and front arrow on the review
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement nextarrow;

	public void clickonnextarrow() {
		nextarrow.click();
	}

	@FindBy(xpath = "//button[text()='Previous']")
	private WebElement previousarrow;

	public void clickonpreviousarrow() {
		previousarrow.click();
	}

	// for checking the visiblity of the newsletter
	@FindBy(xpath = "//div[@class='newsletter_section_gallery__eKeHL']")
	private WebElement Newsletteronaboutus;

	public boolean visiblityofnewsletter() {
		boolean x = Newsletteronaboutus.isDisplayed();
		return x;
	}

	// for checking the visiblity of the footer

	@FindBy(xpath = "//footer[@class='footer_section_container__PyfBS']")
	private WebElement footeraboutus;

	public boolean visiblityoffooteraboutus() {
		boolean y = footeraboutus.isDisplayed();
		return y;
	}

}
