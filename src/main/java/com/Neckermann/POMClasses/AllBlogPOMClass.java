package com.Neckermann.POMClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllBlogPOMClass {
	private WebDriver driver;
	

	public AllBlogPOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Newsletter component
		@FindBy(xpath = "//section[@class='newsletter_sectionContainer__TGgQJ newsletter_travel_journey_section__QSg4q']")
		private WebElement Newsletter_Component;

		public boolean visiblityofNewsletter_Component_allblogpage() {
			boolean b = Newsletter_Component.isDisplayed();
			return b;
		}
		// Footer component
		@FindBy(xpath = "//footer[@class='footer_sectionContainer___0Fqc']")
		private WebElement footer_element_container;

		public boolean visiblityoffooter_element_container() {

			boolean d = footer_element_container.isDisplayed();
			return d;

		}
		// Header component
	
		@FindBy(xpath = "//header[@id='header']")
		private WebElement Header_element_container;

		public boolean visiblityofHeader_element_container() {

			boolean d = Header_element_container.isDisplayed();
			return d;

		}

		//Heading of all Blogs page 
		
		 @FindBy(xpath="//h5[text()='Neckermann ']")
		 private WebElement firstheading;

		public String firtsheadingcheck() {

			String d =firstheading.getText();
			return d;

		}
		
		@FindBy(xpath="//span[text()='Travel Blogs']")
		 private WebElement secondheading;

		public String secondheadingcheck() {

			String d =secondheading.getText();
			return d;

		}
		
	//Breadcrumb
		
		//Home,Blog,all,5 tasty dishes to try in Greece
		@FindBy(xpath="//ul[@class='breadcrumb_breadcrumbList__hrCuC']/li") 
        private List<WebElement> Breadcrumbelement;
        
        public void clickonBreadcrumbelement(String b)//if want to click on the all then remove the argument
        {
                for(int i=0;i<Breadcrumbelement.size();i++)
                        {
                                if(Breadcrumbelement.get(i).getText().contains(b))
                                {
                                	Breadcrumbelement.get(i).click();
                                        break;
        }
                        }
        }
	
	 //All the blog tabs  [all, beach,city, couples,family, featured, news]
      
	
//        @FindBy(xpath="//button[@class='blogs-tags-list_blogTag__ZkSrY ']") 
//        private List<WebElement> blogfiltertabs;
//        
//        public void clickonblogfiltertabs(String b)//if want to click on the all then remove the argument
//        {
//                for(int i=0;i<blogfiltertabs.size();i++)
//                        {
//                                if(blogfiltertabs.get(i).getText().contains(b))
//                                {
//                                	blogfiltertabs.get(i).click();
//                                        break;
//        }
//                        }
//        }
	
        @FindBy(xpath="//button[@class='blogs-tags-list_blogTag__ZkSrY ']") 
        private List<WebElement> blogfiltertabs;
        
        public void clickonblogfiltertabs() throws InterruptedException//if want to click on the all then remove the argument
        {
                for(int i=0;i<blogfiltertabs.size();i++)
                              {       
                	           blogfiltertabs.get(i).click();
                	           Thread.sleep(1000);
                                                }
        }
        
        
	
        //Search box click and write string 
        
        		@FindBy(xpath="(//input[@name='search'])[2]")
        		private WebElement searchbox;
        		
        		public void clickonsearchbox(String a)
        		{
        			searchbox.sendKeys(a);
        		}
        		
        //click on the search button	
        		@FindBy(xpath="(//button[@type='submit'])[2]")
        		private WebElement clickonsearchbutton;
        		
        		public void clickonsearchbutton()
        		{
        			clickonsearchbutton.click();
        		}
        //After search visibility of search text
        		@FindBy(xpath = "//h6[@style='color: rgb(89, 89, 89);']")
        		private WebElement visibilityoftextaftersearch;

        		public boolean visibilityoftextaftersearch() {

        			boolean d = visibilityoftextaftersearch.isDisplayed();
        			return d;

        		}
        		
        		
       //click on the more destinations
        		
        		@FindBy(xpath = "(//div[@class='blog-articles_blog_articles__Kvao_'])[2]") // change the index number(2,3)
        		private WebElement componentfrommoredestination;

        		public void clickoncomponentfrommoredestination() {
        			componentfrommoredestination.click();
        		}
	
	
       // click on the Individual blog
        		@FindBy(xpath = "(//div[@class='blog-excerpt_blog_excerpts__KeeLp'])[1]") //each page have 10 blogs just change the index number and scroll the page
        		private WebElement individualblog;

        		public void clickonindividualblog(){
        			individualblog.click();
        		}	
        
        		
       //Pagination back arrow  		
        		
        		@FindBy(xpath = "//button[@class='pagination_paginationItem__xRspD pagination_paginationItemPrev__IS_zs']") 
        		private WebElement paginationbackarrow;

        		public void clickonpaginationbackarrow(){
        			paginationbackarrow.click();
        		}
        		
        		public boolean visibilityofbackarrow() {

        			boolean d = paginationbackarrow.isEnabled();
        			return d;

        		}
        		
       //Pagination forward arrow  		
        		
        		@FindBy(xpath = "//button[@class='pagination_paginationItem__xRspD pagination_paginationItemNext__mvTid']") 
        		private WebElement paginationforwardarrow;

        		public void clickonpaginationforwardarrow(){
        			paginationforwardarrow.click();
        		}
        		
        		public boolean visibilityofforward() {

        			boolean d = paginationforwardarrow.isEnabled();
        			return d;

        		}
        		
       //Pagination number(1,2,3)
        		
        		@FindBy(xpath="//button[@class='pagination_paginationItem__xRspD']") 
                private List<WebElement> paginationnumber;
                
                public void clickonpaginationnumber(String b)//if want to click on the all then remove the argument
                {
                        for(int i=0;i<paginationnumber.size();i++)
                                {
                                        if(paginationnumber.get(i).getText().contains(b))
                                        {
                                        	paginationnumber.get(i).click();
                                                break;
                }
                                }
                }
                
                
                //**********individual Blog******************//
                
                //popular blogs 
                @FindBy(xpath = "//section[@class='inspirations_sectionContainer__NUpxI inspirations_inspiration_section__qhXfw']")
        		private WebElement Popular_blogs_container;

        		public boolean visiblityofPopular_blogs_container() {

        			boolean d = Popular_blogs_container.isDisplayed();
        			return d;

        		}
        		
        		//header is visible or not
        		@FindBy(xpath = "//h5[@class='blog-header_header__RJcHU']")
        		private WebElement Header_container;

        		public boolean visiblityofHeader_container() {

        			boolean d = Header_container.isDisplayed();
        			return d;

        		}
                  
        		//content menu for individual blog
        		@FindBy(xpath = "//div[@class='blog-detail_contentList__bQLXx blog-detail_blog_content_container__3Ooyi']/ol[@class='blog-detail_orderedList__JAwVw']/li")
        		private List<WebElement> containermenufromindividualpage;

        		public void clickoncontainermenufromindividualpage() throws IOException, InterruptedException {
        			for (int i = containermenufromindividualpage.size()-1; i >=5 ; i--) {
        				containermenufromindividualpage.get(i).click();
//        				ScreenshotClass.takeScreenshot(driver,"Contentclickimages");
        				Thread.sleep(3000);

        			}
        		}
                
                
        		
	
}
