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
	@FindBy(xpath = "//div[@class='AtolProtected_headerParent__38ppk']")
	private WebElement headerelement;

	public String headerelementtitlefetch() {
		String x = headerelement.getText();
		return x;
	}

	public AtolPOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='AtolProtected_excerptParent__JN_LN']")
	private WebElement contentbelowheading;

	public String contentbelowheading() {
		String y = contentbelowheading.getText();
		return y;
	}

	// closing the pop up
	@FindBy(xpath = "//button[@tabindex='0']")
	private WebElement closepopup;

	public void closepopup() {
		closepopup.click();
	}

	// pop up of atol protected

	@FindBy(xpath = "//button[@class='AtolProtected_readMoreBtn__V0Y_1']")
	private List<WebElement> popupofatolprotected;

	public void clickAllPopup() throws IOException, InterruptedException {
		for (int i = 0; i < popupofatolprotected.size(); i++) {
			popupofatolprotected.get(i).click();
			Thread.sleep(2000);
			ScreenshotClass.takeScreenshot(driver, "popupofATOL");
			closepopup.click();
		}
	}

	// click on the ATOL Protected

	@FindBy(xpath = "(//button[@class='AtolProtected_readMoreBtn__V0Y_1'])[1]")
	private WebElement Atolprotectedreadmore;

	public void clickonAtolprotectedreadmore() {
		Atolprotectedreadmore.click();
	}

	// click on the ATOL link

	@FindBy(xpath = "//a[text()='ATOL']")
	private WebElement Atollink;

	public void clickonAtollink() {
		Atollink.click();
	}

//	click on the unbeatable price
	@FindBy(xpath = "(//button[@class='AtolProtected_readMoreBtn__V0Y_1'])[3]")
	private WebElement unbeatableprice;

	public void clickonunbeatableprice() {
		unbeatableprice.click();
	}

	@FindBy(xpath = "//a[text()='terms and conditions']")
	private WebElement termsconditionslink;

	public void clickontermsconditionslink() {
		termsconditionslink.click();
	}

	// click on the Quality assured
	@FindBy(xpath = "(//button[@class='AtolProtected_readMoreBtn__V0Y_1'])[5]")
	private WebElement Qualityassured;

	public void clickonQualityassured() {
		Qualityassured.click();
	}

	@FindBy(xpath = "//a[text()='contact us']")
	private WebElement contactuslink;

	public void clickoncontactuslink() {
		contactuslink.click();
	}

	// click on the feelthelove

	@FindBy(xpath = "//a[text()='Trustpilot']")
	private WebElement feelthelove_trustpilot;

	public void clickonfeelthelove_trustpilot() {
		feelthelove_trustpilot.click();
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
