package com.Neckermann.POMClasses;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {

	private WebDriver driver;
	Actions act;

	public HomePOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);

	}

	// ******************ATOL tab
	@FindBy(xpath = "(//a[text()='ATOL Protected'])[1]")
	private WebElement ATOLprotected;

	public void clickonatolprotected() {
		ATOLprotected.click();
	}

	// ******************Cookie accept
	@FindBy(xpath = "//button[@class='cookies_btn2__g59MH']")
	private WebElement cookieelement;

	public void acceptcookiepolicy() {
		cookieelement.click();
	}

	// ******************aboutus tab
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutus;

	public void clickonaboutus() {
		aboutus.click();
	}

	// ******************neckermannlogo
	@FindBy(xpath = "//a[@class='header_brandGroupWrap___jKO_']")
	private WebElement logofromheader;

	public void clickonlogofromheader() {
		logofromheader.click();
	}

	// ******************sign in tab
	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement signinbutton;

	public void clcikonsigninbutton() {
		signinbutton.click();
	}

	// ******************Hamburger menu******************//
	@FindBy(xpath = "//button[@class='header_navHamburger__dXcUC']")
	private WebElement Hamburgermenu;

	public void clcikonHamburgermenu() {
		Hamburgermenu.click();
	}

	// Container menu from Hamburger

	@FindBy(xpath = "//div[@class='header_menuItemContainer__03kc9']")
	private WebElement containermenufromHamburger;

	public void clickoncontainermenufromHamburger() {
		containermenufromHamburger.click();
	}

	// Closing Hamburger menu
	@FindBy(xpath = "//button[@id='headlessui-popover-button-:r2f:']")
	private WebElement closehmmenu;

	public void clickonclosehmmenu() {
		closehmmenu.click();
	}

	// selection of menus(Holidays,Company, Legal)
	@FindBy(xpath = "//div[@class='header_menuItemContainer__03kc9']/button")
	private List<WebElement> menufromhamburgerm;

	public void clickonmenufromhamburgermenu(String x) {
		for (int i = 0; i < menufromhamburgerm.size(); i++) {
			if (menufromhamburgerm.get(i).getText().contains(x)) {
				menufromhamburgerm.get(i).click();
				break;
			}
		}
	}

	// Holidays
	// sub-menu(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary
	// islands)
	@FindBy(xpath = "//div[@class='header_subMenuContainer__RUh3T']/div/a")
	private List<WebElement> holidaytbsubmenuselection;

	public void clickonholidaytbsubmenuselection(String y) {
		for (int i = 0; i < holidaytbsubmenuselection.size(); i++) {
			if (holidaytbsubmenuselection.get(i).getText().contains(y)) {
				holidaytbsubmenuselection.get(i).click();
				break;
			}
		}
	}

	// company submenu(ATOL Protected,About Us,Contact Us)
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement companysubmenuselection;

	public void clickoncompanysubmenuselection() {
		companysubmenuselection.click();
	}

	// Legal Submenu(Booking Conditions,Privacy Policy,Cookie Policy,Terms Of Use)
	@FindBy(xpath = "//div[@class='header_subMenuContainer__RUh3T']/div/a")
	private List<WebElement> legalsubmenuselection;

	public void clickonlegalsubmenuselection(String a) {
		for (int i = 0; i < legalsubmenuselection.size(); i++) {
			if (legalsubmenuselection.get(i).getText().contains(a)) {
				legalsubmenuselection.get(i).click();
				break;
			}
		}
	}

	// ******************Flash deals******************//
	// first video
	@FindBy(xpath = "//div[@class='flashDeals_img_container__TIAYh flashDeals_img1__4kL_W']")
	private WebElement firstvideo;

	public void clickonfirstvideo() {
		firstvideo.click();
	}

	// second video
	@FindBy(xpath = "//div[@class='flashDeals_img_container__TIAYh flashDeals_img2__DIkFd']")
	private WebElement secondvideo;

	public void clickonsecondvideo() {
		secondvideo.click();
	}

	// select
	// Destinations(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary
	// islands)
	@FindBy(xpath = "//div[@class='topDestinations_section_gallery__w61_w']/a")
	private List<WebElement> alldestinations;

	public void clickonalldestinations(String b)// if want to click on the all then remove the argument
	{
		for (int i = 0; i < alldestinations.size(); i++) {
			if (alldestinations.get(i).getText().contains(b)) {
				alldestinations.get(i).click();
				break;
			}
		}
	}

	// **************collection *********************//

	// visibility of the collection on the home page

	@FindBy(xpath = "//section[@class='collections_section_container__wZxnz collections_collections_section__gQV4N']")
	private WebElement visibilityofcollectiononhomepage;

	public boolean visibilityofcollectiononhomepage() {
		boolean a = visibilityofcollectiononhomepage.isDisplayed();
		return a;
	}

	// click on the collection from home page just change the index from 1 to 6

	@FindBy(xpath = "(//div[@class='collections_img_container__6GYSN']/a)[1]") // -->from 1 to 6 sequencelly
																					// collections(Luxury,Golf and
																					// Sports,Family Getaway,City
																					// Breaks,All Inclusive,Adults Only)
	private WebElement particularcollection;

	public void clickonparticularcollection() {
		particularcollection.click();
	}

	// select collections(Luxury,Golf and Sports,Family Getaway,City Breaks,All
	// Inclusive,Adults Only)
	@FindBy(xpath = "//div[@class='collections_img_container__6GYSN']")
	private List<WebElement> allcollections;

	public void clickonallcollections(String c) {
		for (int i = 0; i < allcollections.size(); i++) {
			if (allcollections.get(i).getText().contains(c)) {
				allcollections.get(i).click();
				break;
			}
		}
	}

	

	// ******************click on the Videos******************//
	@FindBy(xpath = "//video[@width='1000']")
	private WebElement videoclick1;

	public void clickonthevideo1() {
		videoclick1.click();
	}

	@FindBy(xpath = "(//video[@preload='metadata'])[2]")
	private WebElement videoclick2;

	public void clickonthevideo2() {
		videoclick2.click();
	}

	// ******************Home page destinations click ******************//

	// select
	// Destinations(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary
	// islands)
	@FindBy(xpath = "//div[@class='topDestinations_section_gallery__w61_w']/a[@class='topDestinations_img_container__qGSGp topDestinations_img__WUIPG']")
	private List<WebElement> alldestinationsfromhomepage;

	public void clickonalldestinationsfromhomepage(String b)// if want to click on the all then remove the argument
	{
		for (int i = 0; i < alldestinationsfromhomepage.size(); i++) {
			if (alldestinationsfromhomepage.get(i).getText().contains(b)) {
				alldestinationsfromhomepage.get(i).click();
				break;
			}
		}
	}

	// *****************Trust card from home page***********************//
	@FindBy(xpath = "//section[@class='trustCards_section__TC2zA']")
	private WebElement trustcard_homepage;

	public boolean visiblityoftrustcard_homepage() {
		boolean y = trustcard_homepage.isDisplayed();
		return y;
	}

	//Elements for verifying the text on the trust cards
	
	//Heading
	
	@FindBy(xpath = "//h2[text()='Why book with']\r\n")
	private WebElement trustcardheading;

	public String getTextfromtrustcardheading() {
		String y = trustcardheading.getText();
		return y;
	}
	
	//1st logo
			@FindBy(xpath = "(//span[text()='30+ years of experience'])[1]")
			private WebElement firststlogo;
			
			public String getTextfromfirststlogo() {
				String y = firststlogo.getText();
				return y;
			}
   //2nd logo
			@FindBy(xpath = "(//span[text()='Huge range of handpicked hotels'])[1]")
			private WebElement secondlogo;
			
			public String getTextfromsecondlogo() {
				String y = secondlogo.getText();
				return y;
			}
   //3rd logo
			@FindBy(xpath = "(//span[text()='Real-time search'])[1]")
			private WebElement thirdlogo;
			
			public String getTextfromthirdlogo() {
				String y = thirdlogo.getText();
				return y;
			}
   //4th logo
			@FindBy(xpath = "(//span[text()='Full Financial Protection'])[1]")
			private WebElement fourthlogo;
			
			public String getTextfromfourthlogo() {
				String y = fourthlogo.getText();
				return y;
			}
	
	
	// *****************Review on the home page************************//

	@FindBy(xpath = "//section[@class='ourReviews_section__86ndH']")
	private WebElement Reviewcomponent_homepage;

	public boolean visiblityofReviewcomponent_homepage() {
		boolean b = Reviewcomponent_homepage.isDisplayed();
		return b;
	}

	@FindBy(xpath = "//a[@class='ourReviews_mid_section_bottom__JTB_G']")
	private WebElement trustpiolet_homepage;

	public void clickontrustpiolet_homepage() {
		trustpiolet_homepage.click();
	}

	// back and front arrow on the review
	@FindBy(xpath = "(//button[text()='Next'])[5]")
	private WebElement nextarrow_review_homepage;

	public void clickonnextarrow_review_homepage() {
		nextarrow_review_homepage.click();
	}

	@FindBy(xpath = "(//button[text()='Previous'])[5]")
	private WebElement previousarrow_review_homepage;

	public void clickonpreviousarrow_review_homepage() {
		previousarrow_review_homepage.click();
	}

	// *****************Newsletter***********************//

	// Newsletter component
	@FindBy(xpath = "//section[@class='newsletter_section_container__PgpRE newsletter_travel_journey_section__QSg4q']")
	private WebElement Newsletter_Component;

	public boolean visiblityofNewsletter_Component_homepage() {
		boolean b = Newsletter_Component.isDisplayed();
		return b;
	}

	// Click on the newsletter email textbox
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailidin_newsletter;

	public void enteremailidinnewsletter(String a) {
		emailidin_newsletter.sendKeys(a);
	}

	// sign up
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signup_newsletter;

	public void clcikonsignup_newsletter() {
		signup_newsletter.click();
	}

	// Success message toast element

	@FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--bottom-center']/div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement Toast_for_successmessage;

	public String getmessagefromthetoast() {
		String c = Toast_for_successmessage.getText();
		return c;

	}

	// Success message toast is visible

	public boolean visiblityoftoastsuccessmessage() {

		boolean b = Toast_for_successmessage.isDisplayed();
		return b;

	}

	// error message toast element
	@FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--bottom-center']/div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")
	private WebElement Toast_for_errorssmessage;

	public String geterrormessagefromthetoast() {
		String c = Toast_for_errorssmessage.getText();
		return c;

	}

	// Success message toast is visible

	public boolean visiblityofToast_for_errorssmessage() {

		boolean d = Toast_for_errorssmessage.isDisplayed();
		return d;

	}
	// valid email error message

	@FindBy(xpath = "//div[text()='Email must be a valid email']")
	private WebElement valid_email_error_message;

	public boolean visiblityofvalid_email_error_message() {

		boolean d = valid_email_error_message.isDisplayed();
		return d;

	}

	@FindBy(xpath = "	//div[text()='Email is required']")
	private WebElement emailisrequired_error_message;

	public boolean visiblityofemailisrequired_error_message() {

		boolean d = emailisrequired_error_message.isDisplayed();
		return d;

	}

	// ************FOOTER***********************//

	// logo container
	@FindBy(xpath = "//footer[@class='footer_section_container__PyfBS']")
	private WebElement footer_element_container;

	public boolean visiblityoffooter_element_container() {

		boolean d = footer_element_container.isDisplayed();
		return d;

	}

	// logo on the footer
	@FindBy(xpath = "//a[@class='footer_brand__vFXFx']")
	private WebElement logoonthefooter;

	public boolean visiblityoflogoonthefooter() {

		boolean d = logoonthefooter.isDisplayed();
		return d;

	}

	public void clickonlogoonthefooter() {
		logoonthefooter.click();
	}

	// address from the footer

	@FindBy(xpath = "//div[@class='footer_left_section__2arnh']/div")
	private WebElement addressfromfooter;

	public String getaddressfromfooter() {

		String d = addressfromfooter.getText();
		return d;

	}

	// Company menu from the footer(ATOL Protected,About Us,Contact Us)
	@FindBy(xpath = "//div[@class='footer_right_section__YrbQm']/div[1]/ul/li/a")
	private List<WebElement> companysubmenufromfooterselection;

	public void clickoncompanysubmenufromfooterselection(String z) {
		for (int i = 0; i < companysubmenufromfooterselection.size(); i++) {
			if (companysubmenufromfooterselection.get(i).getText().contains(z)) {
				companysubmenufromfooterselection.get(i).click();
				break;
			}
		}
	}

	// Legal Submenu from the footer(Booking Conditions,Privacy Policy,Cookie
	// Policy,Terms Of Use)
	@FindBy(xpath = "//div[@class='footer_right_section__YrbQm']/div[2]/ul/li/a")
	private List<WebElement> legalsubmenufromfooterselection;

	public void clickonlegalsubmenufromfooterselection(String a) {
		for (int i = 0; i < legalsubmenufromfooterselection.size(); i++) {
			if (legalsubmenufromfooterselection.get(i).getText().contains(a)) {
				legalsubmenufromfooterselection.get(i).click();
				break;
			}
		}
	}

	// Holidays sub-menu from the
	// footer(Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary
	// islands)
	@FindBy(xpath ="//div[3]//ul[1]/li")
	private List<WebElement> holidaytbsubmenusfromfooterelection;

	public void clickonholidaytbsubmenusfromfooterelection(String y) {
		for (int i = 0; i < holidaytbsubmenusfromfooterelection.size(); i++) {
			if (holidaytbsubmenusfromfooterelection.get(i).getText().contains(y)) {
				holidaytbsubmenusfromfooterelection.get(i).click();
				break;
			}
		}
	}

	// **********************************************

	// Atol protected from footer
	@FindBy(xpath = "(//a[text()='ATOL Protected'])[2]")
	private WebElement Atolprotectedfromfooter;

	public void clickonAtolprotectedfromfooter() {
		Atolprotectedfromfooter.click();
	}

	// about us from footer
	@FindBy(xpath = "//a[text()='About us']")
	private WebElement aboutusfromfooter;

	// scroll upto aboutusfromfooter
	public void scrolltothefooteraboutus() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", aboutusfromfooter);

	}

	public void clickonaboutusfromfooter() {
		aboutusfromfooter.click();
	}

	// contact us from footer
	@FindBy(xpath = "//a[text()='Contact us']")
	private WebElement contactusfromfooter;

	public void clickoncontactusfromfooter() {
		contactusfromfooter.click();
	}

	// bookingconditions from footer
	@FindBy(xpath = "//a[text()='Booking Conditions']")
	private WebElement bookingconditionsfromfooter;

	public void clickonbookingconditionsfromfooter() {
		bookingconditionsfromfooter.click();
	}

	// privacypolicy from footer
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacypolicyfromfooter;

	public void clickonprivacypolicyfromfooter() {
		privacypolicyfromfooter.click();
	}

	// terms of use from footer
	@FindBy(xpath = "//a[text()='Terms of use']")
	private WebElement termsofusefromfooter;

	public void clickontermsofusefromfooter() {
		termsofusefromfooter.click();
	}

	// cookie policy from footer
	@FindBy(xpath = "//a[text()='Cookie Policy']")
	private WebElement cookiepolicyfromfooter;

	public void clickoncookiepolicyfromfooter() {
		cookiepolicyfromfooter.click();
	}

	//Address from the footer
	@FindBy(xpath = "//p[text()='Neckermann Travel']")
	private WebElement firstlineofaddress;

	public String gettextfromfirstlineofaddress() {
		String a = footercontent.getText();
		return a;}
	

	@FindBy(xpath = "//p[text()='1st Floor, Brunswick House']")
	private WebElement secondlineofaddress;

	public String gettextfromsecondlineofaddress() {
		String a = secondlineofaddress.getText();
		return a;}
	
	
	@FindBy(xpath = "//p[text()='Regent Park, 297 Kingston Road']")
	private WebElement thirdlineofaddress;

	public String gettextfromthirdlineofaddress() {
		String a = thirdlineofaddress.getText();
		return a;}
	
	
	@FindBy(xpath = "//p[text()='Leatherhead, Surrey. KT22 7LU']")
	private WebElement fourthlineofaddress;

	public String gettextfromfourthlineofaddress() {
		String a = fourthlineofaddress.getText();
		return a;}
	
	
	
	
	
	
	// *******************************************

	// Social media from the footer
	// Instagram
	@FindBy(xpath = "//div[@class='footer_social_icons__XLV5Z']/a[1]")
	private WebElement instagramfromfooter;

	public void clcikoninstagramfromfooter() {
		instagramfromfooter.click();
	}

	// Pininsert
	@FindBy(xpath = "//div[@class='footer_social_icons__XLV5Z']/a[2]")
	private WebElement Pininsertfromfooter;

	public void clcikonPininsertfromfooter() {
		Pininsertfromfooter.click();
	}

	// Ticktock
	@FindBy(xpath = "//div[@class='footer_social_icons__XLV5Z']/a[3]")
	private WebElement Ticktockfromfooter;

	public void clcikonTicktockfromfooter() {
		Ticktockfromfooter.click();
	}

	// Facebook
	@FindBy(xpath = "//div[@class='footer_social_icons__XLV5Z']/a[4]")
	private WebElement Facebookfromfooter;

	public void clcikonFacebookfromfooter() {
		Facebookfromfooter.click();
	}

	// content from the footer
	@FindBy(xpath = "(//p[@class='footer_copyright_text__tAHgN'])[2]")
	private WebElement footercontent;

	public String gettextfromfootercontent() {
		String a = footercontent.getText();
		return a;

	}

	// civil aviation link from the footer
	@FindBy(xpath = "//a[text()='Civil Aviation Authority']")
	private WebElement civilaviationlinkfromfootercontent;

	public void clcikoncivilaviationlinkfromfootercontent() {
		civilaviationlinkfromfootercontent.click();
	}

	public String gettextfromcivilaviationlinkfromfootercontent() {
		String b = civilaviationlinkfromfootercontent.getText();
		return b;
	}

	// ***********************DESTINATIONS********************//

	// (Egypt,Cyprus,Greece,Turkey,UAE,Spain,Portugal,Balearics,Canary islands)
	@FindBy(xpath = "//div[@class='topDestinations_section_gallery__w61_w']//a")
	private List<WebElement> Destinationfromhomepage;

	public void clickonDestinationfromhomepage(String b)// if want to click on the all then remove the argument
	{
		for (int i = 0; i < Destinationfromhomepage.size(); i++) {
			if (Destinationfromhomepage.get(i).getText().contains(b)) {
				Destinationfromhomepage.get(i).click();
				break;
			}
		}
	}

	// *********************Search Widget************************//

	// text on destination field
	@FindBy(xpath = "//select[@id='flights-and-hotels-destination-input']//option[text()='Going to']")
	private WebElement textondestinationhomepagelement;

	public String gettextfromtextondestinationhomepagelement() {
		String a = textondestinationhomepagelement.getText();
		return a;
	}
	
	// destination element

	@FindBy(xpath = "//div[@class='destination-input_popperContainer__qsspL']")
	private WebElement destinationhomepagelement;

	public void clickondestinationhomepagelement() {
		destinationhomepagelement.click();
	}

//				
	// select "Ibiza" from detination(cyprus)
	@FindBy(xpath = "//option[text()='Ibiza']")
	private WebElement selectdestination;

	public void clickonselectdestination() {
		selectdestination.click();

//					act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
//					act.sendKeys(Keys.ENTER).perform();
	}

	// departure airport

	@FindBy(xpath = "//input[@id='flight-and-hotel-departure-input']")
	private WebElement departureAirportonhomepagelement;

	public void clickondepartureAirportonhomepagelement() {
		departureAirportonhomepagelement.click();
	}

	public String getattributevalue() {
		String b = departureAirportonhomepagelement.getAttribute("placeholder");
		return b;
	}

//				select Airports from the Departure(birmingham, bournemouth,bristol,cardiff,edinburgh,gatwick,glasgow international,heathrow,leeds bradford, liverpool,
//				                                   london - all airports,luton, manchester,newcastle,stansted)

	@FindBy(xpath = "//ul[@id='departureAirportList']/li[@class='departure-input_inputGroup__M2Gt0']/label")
	private List<WebElement> AirportofdepartureAirport;

	public void clickonAirportofdepartureAirport(String b)// if want to click on the all then remove the argument
	{
		for (int i = 0; i < AirportofdepartureAirport.size(); i++) {
			if (AirportofdepartureAirport.get(i).getText().contains(b)) {
				AirportofdepartureAirport.get(i).click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//label[text()='london - all airports']")
	private WebElement londondeparture;
	
	public void clickonlondondeparture()
	{
		londondeparture.click();
	}
	
	// Travel date

		@FindBy(xpath = "//input[@class='travel-dates-picker_travelDatesInput__f8c7s']")
		private WebElement traveldatetextbox;

		public void clickontraveldatetextbox() {
			traveldatetextbox.click();
		}

		public String getattributevaluetraveldatetextbox() {
			String b = traveldatetextbox.getAttribute("placeholder");
			return b;
		}

	
		//date selection
		
		
		// search button
		
		@FindBy(xpath = "//button[@class='search-widget-form_submitButton__0ByQy']")
		private WebElement searchbutton;

		public void clickonsearchbutton() {
			searchbutton.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		// ******************click on see all button from blog******************
		@FindBy(xpath = "(//a[text()='see all'])[1]")
		private WebElement SeeAllbutton;

		public void clickonSeeAllbutton() {
			SeeAllbutton.click();
		}

		// Select blog from the home page
		@FindBy(xpath = "//div[@class='inspirations_section_gallery__hJy_Y']//a/div[2]/a[text()='Read More']")
		private List<WebElement> selectblogfromhomepage;

		public void clickonselectblogfromhomepage() {
			for (int i = 0; i < selectblogfromhomepage.size(); i++) {
				selectblogfromhomepage.get(i).click();

			}
		}
	

	// Treading holidays click on the "view Now" and forward & backward arrow
	// each "view now button" is different for the 27 hotels , component is same but
	// ref link is diffrent
	// a[@class='trendingHolidays_view_now__MJQy4']

	//

//	}@FindBy(xpath="")
//	private WebElement ;
//	
//	public void ()
//	{
//	
//	}

}
