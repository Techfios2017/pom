package demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class TechfiosContactTest {

	@Test
	public void ContactTest(){
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
				
		
		TechfiosLoginPage Techfios = PageFactory.initElements(driver, TechfiosLoginPage.class);
		
			
        Techfios.Techfioslogin("techfiosdemo@gmail.com", "abc123");
        
        TechFiosHomePage Homepage = PageFactory.initElements(driver, TechFiosHomePage.class);
        
        Homepage.ClickAddContacts();
        
        TechifiosContactForm Contact = PageFactory.initElements(driver, TechifiosContactForm.class);
        
        Contact.FillContactForm();
        
        driver.close();
       
        driver.quit();

	}





}
